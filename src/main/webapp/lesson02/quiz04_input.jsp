<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>길이 변환</title>
<!-- bootstrap CDN -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<h1>길이 변환</h1>
		
		<form method="post" action="/lesson02/quiz04_result.jsp">
			<div class="d-flex align-items-end">
				<input type="text" name="length" class="form-control col-2">
				<span>cm</span>
			</div>
			
			<div>
				<label>인치<input type="checkbox" name="type" value="inch"></label>
				<label class="ml-2">야드 <input type="checkbox" value="yard" name="type"></label>
				<label class="ml-2">피트 <input type="checkbox" value="feet" name="type"></label>
				<label class="ml-2">미터 <input type="checkbox" value="meter" name="type"></label>
			</div>
			
			<button type="submit" class="btn btn-success">변환하기</button>
		</form>
	</div>
</body>
</html>