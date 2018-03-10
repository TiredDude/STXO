<%@ tag language="java" pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<%@ attribute name="title" required="true" type="java.lang.String" description="page title" %>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>${title}</title>
<link rel="stylesheet" type="text/css" href="/stxo/resources/css/main.css"></link>
<link rel="stylesheet" type="text/css" href="/stxo/resources/css/jquery-ui-1.9.2.custom.css"></link>
</head>

<audio autoplay="autoplay" loop="loop" id="audio1">
  <source src="/stxo/resources/audio/empire.mp3" type="audio/mpeg"></source>
</audio>
<video id="back-video" loop="loop" preload="auto" autoplay="autoplay">
    <source src="/stxo/resources/video/rain.webm" type='video/webm' ></source>
</video>