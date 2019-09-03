<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"    
"http://www.w3.org/TR/html4/loose.dtd">    
<html>    
<head>    
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">    
<title><tiles:insertAttribute name="title" ignore="true" /></title>    
</head>    
<body>    
        <div  style="float:left;width:100%;top:0;text-align:right;position:fixed;"><tiles:insertAttribute name="header" /></div>    
          
       <div  style="padding:10px;width:100%;display:inline;"><tiles:insertAttribute name="body" /></div>    
        <div style="width:100%;height:50px;bottom:0;background-color:yellow;color:black;position:fixed;text-align:center;"><tiles:insertAttribute name="footer" /></div>       
</body>    
</html>