package springboot.springtest.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springboot.springtest.mapper.SampleMapper;
import springboot.springtest.model.UserLanguage;

@Repository
public class SampleRepository {

	@Autowired
	private SampleMapper sampleMapper;

	public SampleRepository(SampleMapper sampleMapper) {
		this.sampleMapper = sampleMapper;
	}

	public String getMessageByUser(String userName) {
		String language = sampleMapper.getLanguageByUser(userName);
		return sampleMapper.getMessageByLanguage(language);
	}
	
	public UserLanguage getUserLanguage(String userName) {
		return sampleMapper.getUserLanguageByName(userName);
	}
	
	public UserLanguage insertUserLanguage(UserLanguage newUser) {
		sampleMapper.insertUserLanguage(newUser.getUsl_user(), newUser.getUsl_language());
		return sampleMapper.getUserLanguageByName(newUser.getUsl_user());
	}

	public Boolean deleteUserLanguage(String userName) {
		UserLanguage ul = sampleMapper.getUserLanguageByName(userName);
		return sampleMapper.deleteUserLanguage(ul.getId());
	}

	public UserLanguage updateUserLanguage(UserLanguage userLanguage) {
		sampleMapper.updateUserLanguage(userLanguage.getId(), userLanguage.getUsl_user(), userLanguage.getUsl_language());
		return null;
	}		
}


