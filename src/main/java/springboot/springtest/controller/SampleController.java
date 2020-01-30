package springboot.springtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springboot.springtest.model.UserLanguage;
import springboot.springtest.service.SampleService;

@RestController
@RequestMapping("user/")
public class SampleController {

	@Autowired
	private SampleService sampleService;

	public SampleController(SampleService sampleService) {
		this.sampleService = sampleService;
	}
	
	@GetMapping("/welcome/{userName}")
	public String welcome(@PathVariable("userName") String userName) {
		return sampleService.welcome(userName);
	}	

	@RequestMapping(value = "/welcome/welcome/{userName}", method = RequestMethod.GET)
	public String welcome2(@PathVariable("userName") String userName) {
		return sampleService.welcome(userName);
	}

	@RequestMapping(value = "/getUser/{userName}", method = RequestMethod.GET)
	public UserLanguage getUser(@PathVariable("userName") String userName) {
		return sampleService.getUserLanguage(userName);
	}
	
	@RequestMapping(value = "/insertUser/{userName},{language}", method = RequestMethod.POST)
	public UserLanguage insertUser(@PathVariable("userName") String userName, @PathVariable("language") String language) {
		return sampleService.insertUserLanguage(userName, language);
	}	
	

}