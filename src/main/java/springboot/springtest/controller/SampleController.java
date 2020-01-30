package springboot.springtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

//	@RequestMapping(value = "/getUser/{userName}", method = RequestMethod.GET)
	@GetMapping("/getUser/{userName}")
	public UserLanguage getUser(@PathVariable("userName") String userName) {
		return sampleService.getUserLanguage(userName);
	}
	
//	@RequestMapping(value = "/insertUser", produces = "application/json", method = RequestMethod.POST)
	@PostMapping("/insertUser")
	public UserLanguage insertUser(@RequestBody UserLanguage userLanguage) {
		return sampleService.insertUserLanguage(userLanguage);
	}	
	
//	@RequestMapping(value = "/deleteUser", produces = "application/json", method = RequestMethod.DELETE)
	@DeleteMapping("/deleteUser/{userName}")
	public Boolean deleteUser(@PathVariable("userName") String userName) {
		Object obj = sampleService.deleteUserLanguage(userName);
		return true;
	}
	
//	@RequestMapping(value = "/updateUser", produces = "application/json", method = RequestMethod.PUT)
	@PutMapping("/updateUser")
	public UserLanguage uodateUser(@RequestBody UserLanguage userLanguage) {
		return sampleService.updateUserLanguage(userLanguage);
	}	

}
