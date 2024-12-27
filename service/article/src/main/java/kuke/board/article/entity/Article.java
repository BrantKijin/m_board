package kuke.board.article.entity;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "article")
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article {
	@Id
	private Long articleId;
	private String title;
	private String content;
	private Long boardId;
	private Long writerId;

	private LocalDateTime createdAt;
	private LocalDateTime modifiedAt;

	public static  Article create(Long articleId, String title, String content, Long boardId, Long writerId
		) {
		Article article = new Article();
		article.articleId = articleId;
		article.title = title;
		article.content = content;
		article.boardId = boardId;
		article.writerId = writerId;
		article.createdAt = LocalDateTime.now();
		article.modifiedAt = LocalDateTime.now();
		return article;
	}

	public void update(String title, String content){
		this.title = title;
		this.content = content;
		modifiedAt = LocalDateTime.now();
	}
}
