package repository;

import data.Article;
import data.Member;

import java.util.ArrayList;
import java.util.List;

public class ArticleRepository {

    private int articleId = 0;

    private List<Article> store = new ArrayList<>();

    public Article getById(int id) {

        for(Article article : store){
            if(article.getId() == id){
                return article;
            }
        }
        return null;

    }

    public int write(String title, String body, String author) {

        articleId += 1;
        Article article = new Article(articleId, title, body, author);
        store.add(article);

        return articleId;

    }

    public void delete(Article article) {
        store.remove(article);
    }

    public List<Article> getArticles() {
        return store;
    }
}
