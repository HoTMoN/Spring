package multi.erp.emp;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//MyBatis에서 제공하는 기능을 이용해서 DB 엑세스 - CLRUD처리
@Repository
public class EmpDAOImpl implements EmpDAO {
	@Autowired
	SqlSession SqlSession;
	@Override
	public int insert(EmpVO user) {
		System.out.println("member테이블에 insert:"+user);
		SqlSession.insert("erp.emp.insert", user);
		return 0;
	}

	@Override
	public List<EmpVO> getMemberList() {
		return SqlSession.selectList("erp.emp.list");
	}

}
