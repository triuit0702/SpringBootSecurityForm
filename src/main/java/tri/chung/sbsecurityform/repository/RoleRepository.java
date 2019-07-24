package tri.chung.sbsecurityform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tri.chung.sbsecurityform.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
