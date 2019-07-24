package tri.chung.sbsecurityform.service;

import tri.chung.sbsecurityform.entity.User;

public interface UserService {

	void save(User user);

	User findByUsername(String username);
}
