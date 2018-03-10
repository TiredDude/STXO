<%@ page language="java" contentType="text/html; charset=Utf8"
	pageEncoding="Utf8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
	<tag:head title="Registration" />
	<div class="container login-block main-container">
		<div class="block container-inner ">
			<form class="block-inner-small" method="post" action="room">
				<div class="registr-block-row title-row">
					<span class="registr-row-title">[ Registration ]</span>
				</div> 
				<div class="registr-block-row">
					<span class="registr-block-row-title">EMAIL</span>
					<input type="email" required="required" title="Input your email here">
				</div>
				<div class="registr-block-row">
					<span class="registr-block-row-title">LOGIN</span>
					<input type="text" required="required" title="Input your login here" name="login">
				</div>
				<div class="registr-block-row">
					<span class="registr-block-row-title">PASS</span>
						<input type="password" required="required" name="pass">
<!-- 					<input type="password" title="Password should be min 8 chars  lenght, must contains upper and lower case letters, number or special character." required="required" pattern="((?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})"> -->
				</div>
				<div class="registr-block-row">
					<input type="submit" value="Create account" class="big-blue-button" id="registration-submit">
				</div>
			</form>
		</div>
	</div>
	<tag:footer />
</html>