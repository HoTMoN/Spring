package exam.anno01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext factory =
				new GenericXmlApplicationContext("/config/exam.xml");
		
		IWriteArticleMgr mgr = (IWriteArticleMgr)factory.getBean("test");
		mgr.write(new ArticleDTO());
	}
}
