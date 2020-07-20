package com.wanghuadi.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wanghuadi.bean.Article;
import com.wanghuadi.mapper.ArticleMapper;

@Service
public class ArticleServiceImpl implements ArticleService {
	
	@Resource
	private ArticleMapper articleMapper;

	public List<Article> queryAll(Map<String, Object> map) {
		return articleMapper.queryAll(map);
	}

	public void insertArticle(Article article) {
		articleMapper.insertArticle(article);
	}

}
