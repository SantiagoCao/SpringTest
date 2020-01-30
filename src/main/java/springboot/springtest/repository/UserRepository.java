package springboot.springtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.springtest.model.UserLanguage;

public interface UserRepository extends JpaRepository<UserLanguage, Long> {
	UserLanguage findOneByUsername(String username);
	UserLanguage findOneByUserlanguage(String userlanguage);
}