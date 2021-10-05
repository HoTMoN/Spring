package di_constructor02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
	public static void main(String[] args) {
		/*
		 * Player p = new Player(); p.play();
		 * System.out.println("세번 굴린 주사위의 합:"+p.getTotalValue());
		 */
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("/config/bean.xml");
		
		Player p = (Player)factory.getBean("player");
		p.play();
		System.out.println("세번 굴린 주사위의 합 : "+p.getTotalValue());
	}

}
