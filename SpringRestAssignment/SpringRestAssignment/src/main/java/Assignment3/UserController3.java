package Assignment3;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController3 {
	
	@RequestMapping(value="/AssignmentQ3/{zipcode}")
	public ResponseEntity<String> check(@PathVariable String zipcode) {
		if(zipcode.equals("600026")) {
			return new ResponseEntity<String>("{State:Tamil Nadu,city:Chennai,country:India}",HttpStatus.OK);
		}
		else if(zipcode.equals("897979")) {
			return new ResponseEntity<String>("{State:New Jersey,city:Gotham,country:America",HttpStatus.OK);
		}
		else if(zipcode.equals("897474")) {
			return new ResponseEntity<String>("{State:Dubai,City:Vivekanandar Street,Country:United Arab Emirates",HttpStatus.OK);
		}
		 return new ResponseEntity<String>("false",HttpStatus.NOT_FOUND);
	}
}