package springboot.springtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.springtest.model.UserLanguage;
import springboot.springtest.repository.SampleRepository;
import springboot.springtest.repository.UserRepository;

@Service
public class SampleService {
 
    @Autowired
    private SampleRepository sampleRepository;
    
//    @Autowired
//    UserRepository userRepository;
 
    public SampleService(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }
 
    public String welcome(String userName) {
        return sampleRepository.getMessageByUser(userName);
    }
    
    public UserLanguage getUserLanguage(String userName) {
//        return userRepository.findOneByUsername(userName);
    	return sampleRepository.getUserLanguage(userName);
    }
    
    public UserLanguage insertUserLanguage(UserLanguage newUser) {
    	return sampleRepository.insertUserLanguage(newUser);
  }

	public Boolean deleteUserLanguage(String userName) {
		return sampleRepository.deleteUserLanguage(userName);
	}

	public UserLanguage updateUserLanguage(UserLanguage userLanguage) {
		return sampleRepository.updateUserLanguage(userLanguage);
	}    

}
