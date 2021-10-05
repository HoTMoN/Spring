package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertAction implements Action {

	@Override
	public void run(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("insert기능을 실행하기 위해 만들어진 컨트롤러");
	}

}
