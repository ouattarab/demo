package com.autourducode.demo.service;

import com.autourducode.demo.modele.Article;

import java.util.List;

public interface ArticleService {
    Article creer(Article article);

    List<Article> lire();
    Article modifier(Long id, Article article);

    String supprimer(Long id);

}
