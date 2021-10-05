package app2;
//-main 메소드가 있으면 테스트용
/*
 * OOP특성을 적용을 해서 소스를 변경
 * OOP특성을 적용하기 위해서 상위클래스를 선언하고 MyBeanStyleXX클래스를 사용하는 메소드의 매개변수타입을 상위타입으로 선언하기
 * 상위타입으로 선언했으므로 다형성이 적용되어 코드를 수정할 필요가 없어진다.
 * 그러나 실제 객체를 생성해서 전달하는 부분은 객체가 바뀔때마다 수정해야 한다.
*/
public class MySpringTest {
	public static void main(String[] args) {
		MyBeanStyleA obj = new MyBeanStyleA();
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
