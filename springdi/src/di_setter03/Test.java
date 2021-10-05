package di_setter03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import di_constructor02.Player;

public class Test {
	public static void main(String[] args) {
		ApplicationContext factory =
				new GenericXmlApplicationContext("/config/setter.xml");
		
		IWriteArticleMgr mgr = (IWriteArticleMgr)factory.getBean("mgr");
		mgr.write(new ArticleDTO());
	}

}
