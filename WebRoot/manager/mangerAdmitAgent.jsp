<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="./managerMemu.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>开设代理商账户</title>
</head>

<body>
	<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
		<ul class="breadcrumb">
			<li><a href="<%=basePath%>/index.jsp">主页</a></li>
			<li class="active">注册代理商</li>
			<li><a href="#">注册成功</a></li>
		</ul>

		<form
			action="<%=basePath%>Manager/ManagerAgentManage_change.action?uid=<%=request.getParameter("uid")%>"
			id="form" method="post">
			<div class="form-group">
				<label for="aname">账户名</label><input class="form-control" id="aname"
					type="text" name="aname" />
			</div>
			<div class="form-group">
				<label for="name">姓名</label><input class="form-control" id="name"
					type="text" name="name" />
			</div>
			<div class="form-group">
				<label for="qq">qq</label><input class="form-control" id="qq"
					type="number" name="qq" />
			</div>
			<div class="form-group">
				<label for="phone">电话</label><input class="form-control" id="phone"
					type="number" name="phone" size="11" />
			</div>
			<div class="form-group">
				<label for="role">选择代理商级别:</label> <select name="selectRole"
					class="form-control">
					<option>鲸艺代理商</option>
					<option>1级代理商</option>
					<option>2级代理商</option>
				</select>
			</div>

			<div class="col-md-12 column">${request.info}</div>
			<button type="submit" class="btn btn-default">提交</button>
		</form>
	</div>
</body>
</html>


