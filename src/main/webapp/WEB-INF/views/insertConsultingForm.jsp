<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setCharacterEncoding("UTF-8");
%>
<c:set var="contextPath" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" action="${contextPath }/insertConsulting.do">
		<table border="1">
		  <tr>
		    <td>견적번호</td><td><input type="text" name="no"></td>
		  </tr>
		  <tr>
		    <td>요청업체 ID</td><td><input type="text" name="compId" value="userId" readonly/></td><!-- 차 후 userId 부분 request.getSession("userId")로 수정 -->
		  </tr>  
		  <tr>
		    <td>전문가 ID</td><td><input type="text" name="expId" value="<%= request.getParameter("expId") %>" readonly/></td>
		  </tr>
		  <tr>
		    <td>제목</td><td><input type="text" name="title"/></td>
		  </tr>
		  <tr>
		    <td>내용</td><td><input type="text" name="content"/></td>
		  </tr>
		  <tr>
		    <td>첨부자료</td><td><input type="text" name="fileName"/></td>
		  </tr>
		  <tr>
		    <td>컨설팅 예상금액</td><td><input type="text" name="price"></td>
		  </tr>
		  <tr>
			  <td>
			  	<input value="0" name="status" type="hidden">
			  </td>
		  </tr>
		  <tr  style="text-align: center;">
		  	<td>
		  		<input type="submit" value="견적요청" />
		  	</td>
		  	
		  	<td>
		  		<input type="reset" value="다시입력" />
		  	</td>
		  </tr>
		</table>
	</form>
</body>
</html>