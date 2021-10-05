package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	void run(HttpServletRequest req, HttpServletResponse res);
}
