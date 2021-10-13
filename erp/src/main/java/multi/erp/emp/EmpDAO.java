package multi.erp.emp;

import java.util.List;


public interface EmpDAO {
	int insert(EmpVO user);
	List<EmpVO> getMemberList();
	boolean idCheck(String id);
//boolean login(EmpVO user);
	EmpVO login(EmpVO loginUser);
}
