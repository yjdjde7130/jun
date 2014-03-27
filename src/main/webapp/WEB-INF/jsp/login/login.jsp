<%@ page language="java" contentType="text/html;charset=utf-8"%>
<!DOCTYPE html>
<html lang="zh-cn" ng-app>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>系统登录</title>

<!-- Bootstrap -->
<link href="assets/css/bootstrap.min.css" rel="stylesheet">
<link href="assets/css/login.css" rel="stylesheet">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

	<div class="container">
		<form class="loginForm" role="form" action="login">
			<h2 class="loginForm-heading">系统登录</h2>
			<div class="form-group">
				<label for="username">用户名</label> <input type="text" id="username"
					name="username" class="form-control" placeholder="username"
					required autofocus>
			</div>
			<div class="form-group">
				<label for="username">密码</label> <input type="password"
					id="password" name="password" class="form-control"
					placeholder="password" required> <label
					class="login-field-icon fui-lock" for="login-pass"></label>
			</div>
			<div class="checkbox">
				<label> <input type="checkbox"> 记住我
				</label>
			</div>
			<button type="submit" class="btn btn-lg btn-primary btn-block">登录</button>
		</form>
	</div>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="assets/js/jquery-1.11.0.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="assets/js/bootstrap.min.js"></script>
	<script src="assets/js/angular.min.js"></script>
</body>
</html>