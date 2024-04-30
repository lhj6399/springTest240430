<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../layout/header.jsp" />
<div class="container-md">
<h1>Member Login Page</h1>
<form action="/member/login" method="post">
		<div class="mb-3">
		  <label for="i" class="form-label">ID</label>
		  <input type="text" class="form-control" name="id" id="i" placeholder="ID...">
		</div>
		<div class="mb-3">
		  <label for="p" class="form-label">PassWord</label>
		  <input type="password" class="form-control" name="pw" id="p" placeholder="PassWord...">
		</div>
	<button type="submit" class="btn btn-primary">등록</button>
</form>

<jsp:include page="../layout/footer.jsp" />