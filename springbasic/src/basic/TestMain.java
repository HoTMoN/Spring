package basic;
public class TestMain {
	public static void main(String[] args) {
		
		MemberDAO dao = new MemberDAO();
		//InsaImpl insa = new InsaImpl(dao); //1번 방법 - 생성자를 통해서 외부에서 InsaImpl의 멤버변수인 dao객체를 전달
		InsaImpl insa = new InsaImpl();
		insa.setDao(dao); //2번방법 - setter메소드를 통해서 외부에서 InsaImpl의 멤버변수인 dao객체를 전달
		MemberDTO user = new MemberDTO("jang","1234","장동건");
		insa.addUser(user);

	}

}
