package exam.anno01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//service의 역할을 하는 클래스

@Service("test")
public class WriteArticleMgr implements IWriteArticleMgr {
	@Autowired
	@Qualifier("oracle")
	IArticleDAO articleDAO;
	//생성자 - dao를 컨테이너로 부터 전달받을 수 있도록
	
	public WriteArticleMgr() {
	
	}
	
	public WriteArticleMgr(IArticleDAO articleDAO) {
		super();
		this.articleDAO = articleDAO;
	}

	@Override
	public void write(ArticleDTO article) {
		articleDAO.insert(article);
	}
}
