<%@page import="java.math.BigDecimal"%>
<%@page import="org.json.JSONArray"%>
<%@page import="org.json.JSONObject"%>
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
		
		//$("#output").html('${poseresult}');//json전체결과출력
		var json = JSON.parse('${poseresult}');
		
		var canvas = document.getElementById("canvas");
		var context = canvas.getContext("2d");
		
		var image = new Image();
		image.src="/naverimages/${param.image}";
		image.onload = function(){
			context.drawImage(image, 0, 0, image.width, image.height);
		
		var poseinforms = ['코','목', '오어깨', '오팔굼치', '오손목','왼어깨','왼팔굼치', '왼손목'];
		
		//var poseinforms=[];
		var colorinforms = ['red', 'blue', 'yellow', 'yellow','yellow', "green", "green", "green"];
		//var colorinforms = ["red", "blue", "yellow", "yellow", "yellow", "green", "green", "green",
		//					"skyblue", "skyblue", "skyblue", "black", "black", "black",
		//					"pink", "gold", "orange", "brown"];
		
		for(var j = 0; j < json.predictions.length; j++){//사람수만큼 반복
		for(var i = 0; i < poseinforms.length; i++){//현재 8개 신체부위만
		//for(var i in poseinforms.length){
			if(json.predictions[j][i] != null){//신체부위이름 출력
			context.fillStyle=colorinforms[i];
			context.fillText(poseinforms[i],
				json.predictions[j][i].x * image.width, 
				json.predictions[j][i].y * image.height);
			}//if end
		}//inner for end
		}//outer for end
		}//image onload
		
	});
</script>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<div id="output" style="2px solid green"></div>
<canvas id="canvas" style="2px solid pink" width=500 height=500 ></canvas>

</body>
</html>