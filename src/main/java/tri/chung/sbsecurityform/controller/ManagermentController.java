package tri.chung.sbsecurityform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import tri.chung.sbsecurityform.entity.User;
import tri.chung.sbsecurityform.repository.UserRepository;

@Controller
public class ManagermentController {

	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/user")
	public String getAllUser(Model model) {
		List<User> listUser = userRepository.findAll();
		model.addAttribute("listUser", listUser);
		return "management";
	}
}
