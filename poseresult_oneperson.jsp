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
		
		for(var i = 0; i < poseinforms.length; i++){//8
		//for(var i in poseinforms.length){
			if(json.predictions[0][i] != null){//신체부위이름 출력
			context.fillStyle=colorinforms[i];
			context.fillText(poseinforms[i],
				json.predictions[0][i].x * image.width, 
				json.predictions[0][i].y * image.height);
			}//if end
		
		
		//왼손목과 오손목 연결 라인 그려라
		/*	poseinforms[i]	'오손목' 있으면 오른쪽손목 위치 알아온다
			poseinforms[i]	'왼손목' 있으면 왼쪽손목 위치 알아온다
			두 점을 연결하여 선을 그린다
		*/
		/*if(poseinforms[i].indexOf("왼손목")>=0){
			var leftx = json.predictions[0][i].x * image.width;
			var lefty = json.predictions[0][i].y * image.height;		
		}
		if(poseinforms[i].indexOf("오손목")>=0){
			var rightx = json.predictions[0][i].x * image.width;
			var righty = json.predictions[0][i].y * image.height;		
		}
			
		//선그리기
			context.beginPath();
			context.moveTo(leftx, lefty);
			context.lineTo(rightx, righty);
			context.closePath();
			context.strokeStyle="red";
			context.lineWidth = 5;
			context.stroke();*/
		}//for end	
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