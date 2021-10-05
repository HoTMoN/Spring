package exam;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import app3.MyBeanStyle;

public class TVtest {
	public static void main(String[] args) {
		Resource res = new ClassPathResource("/config/bean.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		
		SamsungTV obj = (SamsungTV)factory.getBean("SamsungTV");
		LgTV obj2 = (LgTV)factory.getBean("LgTV");
		
		SamsungTV(obj);
		LgTV(obj2);
	}
	
	public static void SamsungTV(SamsungTV obj) {
		obj.powerOn();
		obj.powerOff();
		obj.volumeUp();
		obj.volumeDown();
		System.out.println("경계선===========");
	}
	
	public static void LgTV(LgTV obj2) {
		obj2.powerOn();
		obj2.powerOff();
		obj2.volumeUp();
		obj2.volumeDown();
	}
}
