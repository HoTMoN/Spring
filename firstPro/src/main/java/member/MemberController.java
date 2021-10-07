package member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	//요청뷰보기 - 회원가입페이지 보기
	//
	@RequestMapping(value = "/member/insert.do", method = RequestMethod.GET)
	public String showPage() {
		return "member/register";
	}
	
	//회원가입이 끝나고 ??? index.do 로 redirect하자.
	@RequestMapping(value = "/member/insert.do", method = RequestMethod.POST)
	public String insert() {
		System.out.println("회원가입하는 비즈니스 메소드 콜!!!!!!!!!!");
		return "redirect:/index.do";
	}
}
