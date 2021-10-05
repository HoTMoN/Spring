package app3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/*
spring을 이용해서 처리하기
=> 스프링 프레임워크 내부에 있는 컨테이너를 통해서 생성된 객체를 받아서 사용
BeanFactory의 하위 클래스를 이용
1. XML파일을 스프링내부에서 파싱할 수 있도록 처리
*/
public class MySpringTest {
	public static void main(String[] args) {
		//1. xml설정 파일을 읽어서 분석할 수 있도록 제공되는 스프링 객체를 설정
		Resource res = new ClassPathResource("/config/bean.xml");
		//2. 파싱된 xml문서에서 객체를 찾아올 수 있는 factory클래스 즉, IoC컨테이너 클래스를 만든다.
		BeanFactory factory = new XmlBeanFactory(res);
		//3. factory(IoC컨테이너)가 관리하는 객체를 전달받는다.
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("mybean");
		
		run(obj);
		show(obj);
	}
	
	public static void run(MyBeanStyle obj) {
		System.out.println("***********************");
		obj.testHello("장동건");
		obj.testHello("장동건");
		System.out.println("***********************");
	}
	
	public static void show(MyBeanStyle obj) {
		obj.testHello("장동건");
		obj.testHello("장동건");
		obj.testHello("장동건");
		obj.testHello("장동건");
	}
}
