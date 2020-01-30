package springboot.springtest.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import springboot.springtest.model.UserLanguage;

@Mapper
public interface SampleMapper {

	String getLanguageByUser(@Param("userName") String userName);

	String getMessageByLanguage(@Param("language") String language);
	
	UserLanguage getUserLanguageByName(@Param("userName") String userName);
	
	UserLanguage insertUserLanguage(@Param("userName") String userName, @Param("language") String language);

	Boolean deleteUserLanguage(@Param("id") long id);

	Boolean updateUserLanguage(@Param("id") long id, @Param("userName") String userName, @Param("language") String language);

}
