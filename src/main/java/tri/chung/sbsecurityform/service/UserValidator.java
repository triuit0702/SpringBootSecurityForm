package tri.chung.sbsecurityform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import tri.chung.sbsecurityform.entity.User;

@Component
public class UserValidator implements Validator {

	@Autowired
	UserService userService;

	@Override
	public boolean supports(Class<?> aclazz) {
		return User.class.equals(aclazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		User user = (User) object;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
//		if (user.getUsername().length() < 6 || user.getUsername().length() > 32) {
//			errors.rejectValue("username", "Size.userForm.username");
//		}
//		
		if (userService.findByUsername(user.getUsername()) != null) {
			errors.rejectValue("username", "Duplicate.userForm.username");
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
//        if (user.getPassword().length() < 8 || user.getPassword().length() > 32) {
//            errors.rejectValue("password", "Size.userForm.password");
//        }

        if (!user.getPasswordConfirm().equals(user.getPassword())) {
            errors.rejectValue("passwordConfirm", "Diff.userForm.passwordConfirm");
        }
	}

}
