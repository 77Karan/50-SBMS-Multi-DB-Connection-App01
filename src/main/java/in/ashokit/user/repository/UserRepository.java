package in.ashokit.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.user.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{
	

}
