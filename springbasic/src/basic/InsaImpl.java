package basic;
public class InsaImpl implements Insa {
	MemberDAO dao;// null - 참조변수를 멤버변수로 선언하면 초기값은 null
	
	public InsaImpl() {
	}
		
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
	}

	public MemberDAO getDao() {
		return dao;
	}

	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}

	@Override
	public void addUser(MemberDTO user) {
		dao.add(user);
	}

	@Override
	public MemberDTO getUser(String id) {
		dao.getUser("id");
		return null;
	}

}
