package com.wanghuadi.mapper;

import java.util.List;
import java.util.Map;

import com.wanghuadi.bean.Article;

public interface ArticleMapper {
	public List<Article> queryAll(Map<String,Object> map);
	public void insertArticle(Article article);
}
