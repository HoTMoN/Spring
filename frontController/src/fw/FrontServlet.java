package fw;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.Action;

@WebServlet(
		name = "front", urlPatterns = { "*.jsp", "*.do", "*.html", "*.sds" })
public class FrontServlet extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doPost(request, response);
		}	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 요청정보를 분석해서 추출
			System.out.println("요청받기");
			System.out.println("request.getContextPath()=>"+request.getContextPath());
			System.out.println("request.getRequestURI()=>"+request.getRequestURI());
			System.out.println("request.getRemoteAddr()=>"+request.getRemoteAddr());
			
			String contextPath = request.getContextPath();
			String requestUri = request.getRequestURI();
			String requestpath = requestUri.substring(contextPath.length());
			
			System.out.println("requestpath=>"+requestpath);
			System.out.println("공통의 기능을 처리하기----1.로그기록하기");
			System.out.println("공통의 기능을 처리하기----2.보안적용하기");
			
			//2. 실제 실행할 컨트롤러가 무엇인지 찾아올 수 있도록 RequestMapping에 의뢰
			//	=> 요청정보나 응답정보에 한글셋팅하기, 클라이언트가 어떤 서블릿에서 넘어왔는지 정보추출, 로그기록
			//2. 실제 실행할 컨트롤러가 무엇인지 찾아올 수 있도록 RequestMapping에 의뢰
			
			RequestMapping handler = new RequestMapping();
			Action action = handler.mapping(requestpath);
			
			//3. RequestMapping 찾은 Action객체 실행
			action.run(request, response);
			
			//4. Action객체의 실행결과를 받아서 view로 넘기기
			//5. 실행할 뷰정보를 보고 뷰를 찾아와서 만들어주기
			//6. forward나 redirect될 수 있도록 처리하기...
			//......
		}
}
