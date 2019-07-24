package tri.chung.sbsecurityform.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import tri.chung.sbsecurityform.entity.User;
import tri.chung.sbsecurityform.service.SecurityService;
import tri.chung.sbsecurityform.service.UserService;
import tri.chung.sbsecurityform.service.UserValidator;

@Controller
public class LoginController {

	@Autowired
	UserService userService;

	@Autowired
	SecurityService securityService;
	
	@Autowired
	private UserValidator userValidator;

	@GetMapping("/registration")
	public String registration(Model model) {
		model.addAttribute("userForm", new User());
		return "registration";
	}

	@PostMapping("/registration")
	public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult) {
		userValidator.validate(userForm, bindingResult);
		if (bindingResult.hasErrors()) {
			return "registration";
		}
		userService.save(userForm);
		securityService.autoLogin(userForm.getUsername(), userForm.getPasswordConfirm());
		return "redirect:/welcome";
	}

	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";
	}

	@GetMapping("/login")
	public String login(Model model, String error, String logout) {
		if (error != null) {
			model.addAttribute("error", "Your username and password is invalid.");
		}
		if (logout != null) {
			model.addAttribute("message", "You have been logged out successfully.");
		}
		return "login";
	}

	@GetMapping("/admin")
	public String adminPage() {
		return "admin";
	}

	@GetMapping("/logout")
	public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/login?logout";
	}
}
