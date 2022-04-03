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
		
		var json = JSON.parse('${ocrresult}');
		
		var canvas = document.getElementById("canvas");
		var context = canvas.getContext("2d");
		
		var image = new Image();
		image.src = "/naverimages/${param.fontfile}";
		image.onload = function(){
			context.drawImage(image, 0, 0, image.width, image.height);
			context.strokeStyle="green";
			context.lineWidth=2;
			
			
		var fieldslist = json.images[0].fields; //이미지 내부 글씨 공백 분리 단어 형태 여러개 배열
		
		for(var i in fieldslist){
			if(fieldslist[i].lineBreak == true){
				$("#result2").append(" " + fieldslist[i].inferText + "<br>");
			}
			else{
				$("#result2").append(" " + fieldslist[i].inferText);
			}
			
			//캔버스 위 텍스트위치박스화.사각형(4개점-1개점좌표(x,y))
			//fieldslist[i].boundingPoly 내부 포함 정보 이용
			
			var canvas_x = fieldslist[i].boundingPoly.vertices[0].x;
			var canvas_y = fieldslist[i].boundingPoly.vertices[0].y;
			var width = fieldslist[i].boundingPoly.vertices[1].x - canvas_x;
			var height = fieldslist[i].boundingPoly.vertices[3].y - canvas_y;
			context.strokeRect(canvas_x, canvas_y, width, height);
			
			
		}//for end
		}//image.onload end
		

	});
</script>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<div id="result" style="border:2px solid green">${ocrresult }</div>
<div id="result2" style="border:2px solid blue"></div>
<canvas id="canvas" style="border:2px solid red" width=500 height=500></canvas>
</body>
</html>




