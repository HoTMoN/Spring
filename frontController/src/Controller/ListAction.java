package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListAction implements Action {


	@Override
	public void run(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("list작업을 실행하기 위한 컨트롤러 - 서블릿에서 처리했던 내용을 기술(공통작업이 빠진 내용)");

	}

}
