<%@ page language="java" contentType="text/html; charset=Utf8"
	pageEncoding="Utf8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<tag:head title="login" />
<div class="container login-block main-container">
	<div class="block container-inner ">
		<form class="block-inner-small" method="post" action="room"
			id="login-form">
			<div class="login-block-row">
				<span class="login-block-row-title">LOGIN</span> 
				<input type="text"	name="login" id="login" required="required" autocomplete="off" title="Input your login here">
			</div>
			<div class="login-block-row">
				<span class="login-block-row-title">PASS</span> 
				<input name="pass"	type="password" id="pass" required="required" autocomplete="off" title="Input your password here">
			</div>
			<div class="login-block-row">
				<input type="submit" name="login-button" value="Log In"
					class="big-blue-button" id="login-submit">
			</div>
			<div class="login-block-row">
				<a href="registration" id="registration-link">[
					Registration ]</a>
			</div>
		</form>
	</div>
</div>
<tag:footer />
</html>