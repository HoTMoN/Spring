package exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		//TV tv = new SamsungTV();
		//TV tv = new LgTV();
		ApplicationContext context = new ClassPathXmlApplicationContext("/config/bean.xml");
		TV tv = (TV) context.getBean("tv");
		test(tv);
	}
	public static void test(TV tv){
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}

}
