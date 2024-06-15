package com.autourducode.demo.service;

import com.autourducode.demo.modele.Article;
import com.autourducode.demo.repository.ArticleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ArticleServiceImpl implements  ArticleService{

   private  final ArticleRepository articleRepository;
    @Override
    public Article creer(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public List<Article> lire() {
        return articleRepository.findAll();
    }

    @Override
    public Article modifier(Long id, Article article) {
        return articleRepository.findById(id)
                .map(m -> {
                    m.setPrix(article.getPrix());
                    m.setNom(article.getNom());
                    m.setDescription(article.getDescription());
                    return articleRepository.save(m);
                }).orElseThrow(()-> new RuntimeException("Article non trouver"));
    }

    @Override
    public String supprimer(Long id) {
        articleRepository.deleteById(id);
        return "Article supprimer";
    }
}
