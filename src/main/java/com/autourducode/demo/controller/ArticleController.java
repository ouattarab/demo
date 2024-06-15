package com.autourducode.demo.controller;

import com.autourducode.demo.modele.Article;
import com.autourducode.demo.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
@AllArgsConstructor
public class ArticleController {
    private final ArticleService articleService;

    @PostMapping("/create")
    public Article create(@RequestBody Article article) {
        return articleService.creer(article);
    }

    @GetMapping("/read")
    public List<Article> read() {
        return articleService.lire();
    }

    @PutMapping("/update/{id}")
    public Article update(@PathVariable Long id, @RequestBody Article article) {
        return articleService.modifier(id, article);
    }
    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable Long id){
        return articleService.supprimer(id); }

}
