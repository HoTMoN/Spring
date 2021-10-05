package app1;
//-main 메소드가 있으면 테스트용
/*
 * 결합도가 극도로 높은 프로그램
 * ==>  클래스의 결합도가 강하고 의존성이 높다.
 * 		사용되는 클래스(MyBeanStyleA -> MyBeanStyleB)가 변경되면 이 클래스를 사용하는 모든 곳에서 수정을 해야 한다.
 * 		수정해야하는 범위가 넓어진다. oop특성이 적용되어 있지 않다.(상속,캡슐화,다형성..)
*/
public class MySpringTest {
	public static void main(String[] args) {
		MyBeanStyleA obj = new MyBeanStyleA();
		run(obj);
		show(obj);
		
	}
	public static void run(MyBeanStyleA obj) {
		System.out.println("***********************");
		obj.testHello("장동건");
		obj.testHello("장동건");
		System.out.println("***********************");
	}
	
	public static void show(MyBeanStyleA obj) {
		obj.testHello("장동건");
		obj.testHello("장동건");
		obj.testHello("장동건");
		obj.testHello("장동건");
	}
}
