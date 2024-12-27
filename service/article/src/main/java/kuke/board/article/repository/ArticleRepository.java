package kuke.board.article.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kuke.board.article.entity.Article;
import lombok.RequiredArgsConstructor;


public interface ArticleRepository extends JpaRepository<Article, Long> {
}
