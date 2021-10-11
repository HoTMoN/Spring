package multi.erp.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {
	@Autowired
	EmpService service;
	@RequestMapping("/emp/insert.do")
	//스프링 MVC의 DispatcherServlet이 넘겨주는 VO객체를 서비스단의 메소드를 호출하면서 넘겨준다.
	public String insert(EmpVO command) { //VO객체를 command객체라 한다.
		System.out.println("================"+command);
		service.insert(command);
		return "redirect:/emp/loginPage.do"; //회원가입이 완료되면 로그인을 하기 위한 페이지로 redirect하도록 설정
	}
	@RequestMapping("/emp/list.do")
	public ModelAndView getMemberList() {
		ModelAndView mav = new ModelAndView();
		List<EmpVO> userlist = service.getMemberList();
		System.out.println("*******************************");
		System.out.println(userlist);
		//tiles에 등록한 뷰의 이름
		mav.setViewName("emp/list");
		mav.addObject("userlist", userlist);
		return mav;
		
	}
	@RequestMapping("/emp/idcheck.do")
	public ModelAndView idCheck(String id) {
		ModelAndView mav = new ModelAndView();
		boolean state = service.idCheck(id);
		String result = "";
		if(state) {//사용자가 입력한 id가 db에 이미 저장되어 있다는 의미
			result = "사용 불가능한 아이디";
		}else {
			result = "사용 가능한 아이디";
		}
		mav.setViewName("emp/insert");
		mav.addObject("result", result);
		return mav;
	}
}
