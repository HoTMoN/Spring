package multi.erp.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import multi.erp.emp.EmpDAO;
import multi.erp.emp.EmpVO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	@Autowired
	SqlSession SqlSession;
	@Override
	public BoardVO read(String board_no) {
		// sql실행결과가 레코드 하나 인 경우
		return SqlSession.selectOne("erp.board.read", board_no);
	}
	@Override
	public List<BoardVO> boardList() {//전체목록 조회
		return SqlSession.selectList("erp.board.list");
	}

	@Override
	public int insert(BoardVO board) {
		int result = SqlSession.insert("erp.board.insert", board);
		return result;
	}

	@Override
	public List<BoardVO> searchList(String search) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardVO> searchList(String tag, String search) {
		//SqlSession의 여러 메소드를 호출하면서 VO객체, 문자열, Map등에 데이터를 저장해서 전달할 수 있다.
		Map<String,String> map = new HashMap<String, String>();
		map.put("tag", tag);
		map.put("search", search);
		return SqlSession.selectList("erp.board.dynamicsql", map);
	}

	@Override
	public List<BoardVO> pageList() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int update(BoardVO board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String board_no) {
		// TODO Auto-generated method stub
		return 0;
	}
	//게시글에서 카테고리별로 검색하기 위한 메소드
	@Override
	public List<BoardVO> categorySearch(String category) {
		return SqlSession.selectList("erp.board.category", category);
	}
	

}


