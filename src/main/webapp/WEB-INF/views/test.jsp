<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href='<c:url value="/css/text.css"/>'>
    <script type="text/javascript" 
        src='<c:url value="/javascript/test.js"/>'>
    </script>
</head>
<body>
    <div id="container">
        <div id="canvasArea">
          <canvas id="mainCanvas"></canvas>
          <button id="addCanvasButton">새 캔버스 추가</button>
        </div>
        <div id="stickerArea">
          <input type="file" id="stickerUpload" accept="image/*" multiple>
          <div id="stickerGallery"></div>
          <div id="stickerPreview"></div>
        </div>
      </div>
      <div id="canvasGallery"></div>
      <button id="createButton">제작</button>
    </div>
</body>

</html>

