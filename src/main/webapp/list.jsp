<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	
	<form action="list" method="post">
		标题:<input type="text" name="title"><br>
		发布时间:<input type="date" name="startTime">~<input type="date" name="endTime"><br>
		<input type="submit" value="搜索">
	</form>
	
	<a href="add.jsp">
		<input type="button" value="添加">
	</a>
	<table>
		<tr>
			<td>文章ID</td>
			<td>标题</td>
			<td>内容</td>
			<td>审核状态</td>
			<td>发布时间</td>
			<td>操作</td>
		</tr>
		
	<c:forEach items="${page.list }" var="a">
		<tr>
			<td>${a.aid }</td>
			<td>${a.title }</td>
			<td>${a.content  }</td>
			<td>${a.status == 0?"审核成功":"审核失败"	 }</td>
			<td>${a.created  }</td>
			<td>操作</td>
		</tr>
	</c:forEach>
	<tr>
		<td colspan="10">
			<a href="?pageNum=1">首页</a>
			<a href="?pageNum=${page.prePage }">上一页</a>
				<c:forEach begin="1" end="${page.pages }" var="num">
					<a href="?pageNum=${num }">${num }</a>
				</c:forEach>
			<a href="?pageNum=${page.nextPage }">下一页</a>
			<a href="?pageNum=${page.pages }">尾页</a>
		</td>
	</tr>
	</table>
	
</body>
</html>