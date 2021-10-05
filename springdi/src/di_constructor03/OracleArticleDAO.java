package di_constructor03;

public class OracleArticleDAO implements IArticleDAO {
	@Override
	public void insert(ArticleDTO article) {
		System.out.println("oracle로 insert");
	}

}
