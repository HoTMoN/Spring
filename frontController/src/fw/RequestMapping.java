package fw;

import Controller.Action;
import Controller.InsertAction;
import Controller.ListAction;

/*
* FrontServlet이 넘겨준 요청정보를 가지고 실제 어떤 클래스(컨트롤러)를 실행할 것인지 실행할 클래스객체를 리턴해주는 역할
* 미리 요청 path에 따라서 실행할 객체를 properties파일이나 xml파일이나 설정파일에 등록해놓고 이 파일을 parsing하도록 처리
* 지금은 코드가 길어지므로 if문으로 처리
*/
public class RequestMapping {
	public Action mapping(String requestpath) {
		Action action = null;
		//요청 path에 따라서 실행할 객체를 만들어서 리턴
		if(requestpath.equals("/member/insert.sds")) {
			System.out.println("/member/insert.sds요청");
			action = new InsertAction();
		}else if(requestpath.equals("/member/list.sds")) {
			System.out.println("/member/list.sds요청");
			action = new ListAction();
		}
		return action;
	}
}
