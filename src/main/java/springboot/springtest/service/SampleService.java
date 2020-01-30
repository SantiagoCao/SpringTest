package springboot.springtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.springtest.model.UserLanguage;
import springboot.springtest.repository.UserRepository;

@Service
public class SampleService {

	@Autowired
	UserRepository userRepository;

	public UserLanguage getUserIdLanguage(Long id) {
		return userRepository.findOne(id);
	}

	public UserLanguage getUserNameLanguage(String username) {
		return userRepository.findOneByUsername(username);
	}
	
	public UserLanguage getUserLanguage(String userlanguage) {
		return userRepository.findOneByUserlanguage(userlanguage);
	}	

	public UserLanguage insertUserLanguage(UserLanguage newUser) {
		return userRepository.saveAndFlush(newUser);
	}

	public void deleteUserLanguage(Long id) {
		userRepository.delete(id);
	}

	public UserLanguage updateUserLanguage(UserLanguage userLanguage) {
		return userRepository.save(userLanguage);
	}

}
