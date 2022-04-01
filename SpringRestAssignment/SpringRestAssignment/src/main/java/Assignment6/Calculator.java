package Assignment6;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Q6")
@RestController
public class Calculator {
	@GetMapping("/addition/{a}/{b}")
	public Integer getaddition(@PathVariable int a, @PathVariable int b) {
		return a+b;}
	@GetMapping("/subtraction/{a}/{b}")
	public Integer getsubtraction(@PathVariable int a, @PathVariable int b) {
			return a-b;	}
	@GetMapping("/multiplication/{a}/{b}")
	public Integer getmultiplication(@PathVariable int a, @PathVariable int b) {
			return a*b;	}
	@GetMapping("/division/{a}/{b}")
	public Integer getdivision(@PathVariable int a, @PathVariable int b) {
			return a/b;	}
	@GetMapping("/squareroot/{a}/{b}")
	public double getsquareroot(@PathVariable int a, @PathVariable int b) {
			return Math.sqrt(a);	}
	
	
	
	

}

	