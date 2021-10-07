package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@RequestMapping("/index.do")
	public String main() {
		System.out.println("test1");
		return "test/index";
	}
	
	@RequestMapping("/test.do")
	public ModelAndView test() {
		ModelAndView mav2 = new ModelAndView();
		String result = "9*1=9" +"<br>"+ "9*2=18" +"<br>"+"9*3=27" +"<br>"+"9*4=36" +"<br>"+"9*5=45" +"<br>"+"9*6=54" +"<br>"+"9*7=63" +"<br>"+"9*8=72" +"<br>"+"9*9=81" ;
		
		mav2.addObject("result", result);
		
		mav2.setViewName("test/result");
		return mav2;
	}
}
