package tri.chung.sbsecurityform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tri.chung.sbsecurityform.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByUsername(String username);
}
