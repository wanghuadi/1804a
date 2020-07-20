package com.wanghuadi.bean;

public class Article {
	private Integer aid;// 文章id

	private String title;// 标题

	private String content;// 内容。。。。

	private Integer status;//	审核状态(0 审核成功   1 审核失败)

	private String created;// 发布时间

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public Article(Integer aid, String title, String content, Integer status, String created) {
		super();
		this.aid = aid;
		this.title = title;
		this.content = content;
		this.status = status;
		this.created = created;
	}

	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Article [aid=" + aid + ", title=" + title + ", content=" + content + ", status=" + status + ", created="
				+ created + "]";
	}
	
	
}
