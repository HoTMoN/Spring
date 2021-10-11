package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//tiles기반 작업
@Controller
public class TilesIndexController {
	@RequestMapping("/exam/index.do")
	public String index() {
		return "index"; //tiles설정 파일에 등록된 view의 이름
	}
	@RequestMapping("/exam/advanced.do")
	public String advancedView() {
		return "menu/advanced"; //tiles설정 파일에 등록된 view의 이름
	}
	@RequestMapping("/exam/jdbc.do")
	public String jdbcView() {
		return "menu/jdbc"; //tiles설정 파일에 등록된 view의 이름
	}
	@RequestMapping("/exam/mybatis.do")
	public String mybatisView() {
		return "menu/mybatis"; //tiles설정 파일에 등록된 view의 이름
	}
}
