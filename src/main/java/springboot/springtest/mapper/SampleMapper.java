package springboot.springtest.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import springboot.springtest.model.UserLanguage;

@Mapper
public interface SampleMapper {

	String getLanguageByUser(@Param("userName") String userName);

	String getMessageByLanguage(@Param("language") String language);
	
	UserLanguage getUserLanguageByName(@Param("userName") String userName);
	
	Boolean insertUserLanguage(@Param("userName") String userName, @Param("language") String language);

}
