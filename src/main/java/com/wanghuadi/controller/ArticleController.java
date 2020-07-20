package com.wanghuadi.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wanghuadi.bean.Article;
import com.wanghuadi.service.ArticleService;

@Controller
public class ArticleController {
	
	@Resource
	private ArticleService articleService;
	
	@RequestMapping("list")
	public String list(@RequestParam(defaultValue="1")Integer pageNum,Model model,
			String title,String startTime,String endTime
			){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("title", title);
		map.put("startTime", startTime);
		map.put("endTime", endTime);
		PageHelper.startPage(pageNum, 3);
		List<Article> list = articleService.queryAll(map);
		PageInfo<Article> page = new PageInfo<Article>(list);
		////
		model.addAttribute("page", page);
		return "list";
	}

	
	@RequestMapping("add")
	@ResponseBody
	public boolean add(Article article){
		try {
			//添加数据库
			articleService.insertArticle(article);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
