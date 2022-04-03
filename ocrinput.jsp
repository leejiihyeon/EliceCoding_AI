<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		
		//jquery code
	});
</script>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>


<%
String[] imageext = {"jpg", "jpeg", "png", "jfif","gif"};
String[] filelist = (String[])request.getAttribute("filelist"); //모든확장자파일
for(int i = 0; i < filelist.length; i++){//모든파일 대상
	String onefile = filelist[i];
	String[] onefilesplit = onefile.split("[.]");
	String ext = onefilesplit[onefilesplit.length-1];//각 파일의 확장자

	for(int j = 0; j < imageext.length; j++){
		if(ext.equals(imageext[j])){
%>			
			<a href="/ocrresult?fontfile=<%=onefile%>"> <%=onefile%> </a>
			<img src="/naverimages/<%=onefile%>" width=100 height=100><br>
<%		}//if end
	}//inner for
}//outer for
%>

</body>
</html>

