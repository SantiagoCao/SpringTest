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
	
	public UserLanguage insertUserLanguage(String userName, String languages) {
		sampleMapper.insertUserLanguage(userName, languages);
		return sampleMapper.getUserLanguageByName(userName);
	}		
}


