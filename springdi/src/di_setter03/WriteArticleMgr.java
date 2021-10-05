package di_setter03;
//service의 역할을 하는 클래스
public class WriteArticleMgr implements IWriteArticleMgr {
	IArticleDAO articleDAO;
	//생성자 - dao를 컨테이너로 부터 전달받을 수 있도록
	
	public WriteArticleMgr() {
		super();
	}
	
	public WriteArticleMgr(IArticleDAO articleDAO) {
		super();
		this.articleDAO = articleDAO;
	}

	@Override
	public void write(ArticleDTO article) {
		articleDAO.insert(article);
	}

	public void setArticleDAO(IArticleDAO articleDAO) {
		this.articleDAO = articleDAO;
	}
	
}
