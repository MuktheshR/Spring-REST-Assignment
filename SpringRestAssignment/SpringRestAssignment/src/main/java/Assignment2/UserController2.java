package Assignment2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController2 {
	@Autowired
	private User service;
    @RequestMapping(value="/AssignmentQ2/{username}/{password}",method=RequestMethod.GET)
	public ResponseEntity<String> checkdata(@PathVariable String username,@PathVariable String password,@ModelAttribute User user) {
//		String run= service.checkdata(username,password);
//		if(!(run.equals(username)) & !(run.equals(password))) {
//			
//			return new ResponseEntity<String>("invalid",HttpStatus.NOT_FOUND);
//
//		}
//		else {
//		return new ResponseEntity<String>("valid",HttpStatus.OK);
//		}
    	if(username.equals("Kaveesh")&& (password.equals("Kumar"))) {
    		return new ResponseEntity<String>("valid user",HttpStatus.OK);
    	}
    	else {
    		return new ResponseEntity<String>("invalid user",HttpStatus.NOT_FOUND);
    	}
	}
}