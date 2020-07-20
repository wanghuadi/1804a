package com.wanghuadi.service;

import java.util.List;
import java.util.Map;

import com.wanghuadi.bean.Article;

public interface ArticleService {
	public List<Article> queryAll(Map<String,Object> map);
	public void insertArticle(Article article);
}
