package com.autourducode.demo.repository;

import com.autourducode.demo.modele.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article,Long> {
}
