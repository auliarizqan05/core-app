<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page session="true"%>
<html>
<head>
<title>Elements - Editorial by HTML5 UP</title>
<!-- META CONFIG -->
<!-- <meta charset="utf-8"> -->
<!--   <meta http-equiv="X-UA-Compatible" content="IE=edge"> -->
<!--   <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"> -->
<!--   <meta name="description" content=""> -->
<!--   <meta name="author" content=""> -->
  
<!-- Bootstrap core CSS-->
<!-- <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"> -->
<!-- <link -->
<!-- 	href="vendor/font-awesome/css/font-awesome.min.css" -->
<!-- 	rel="stylesheet" type="text/css"> -->
<!-- Custom styles for this template  -->
<!-- <link href="css/sb-admin.css" rel="stylesheet" type="text/css"> -->

<%-- <link href="${pageContext.request.contextPath}/WebContent/resources/css/sb-admin.css" rel="stylesheet" type="text/css"> --%>

 <link href="<c:url value="/resources/css/sb-admin.css" />" rel="stylesheet" >
 <link href="<c:url value="/resources/vendor/bootstrap/css/bootstrap.min.css" />" rel="stylesheet" >

<!-- Cara dengan spring -->
<%-- <spring:url value="/resources/css/sb-admin.css" var="mainCss" /> --%>
<%-- 	<spring:url value="/resources/vendor/bootstrap/css/bootstrap.min.css" var="jqueryJs" /> --%>
<%-- 	<spring:url value="/resources/vendor/font-awesome/css/font-awesome.min.css" var="mainJs" /> --%>

<%-- <link href="${jqueryJs}" rel="stylesheet" type="text/css"> --%>
<%-- <link href="${mainJs}" rel="stylesheet" type="text/css"> --%>
<%-- <link href="${mainCss}" rel="stylesheet"> --%>

</head>

<!-- <body class="fixed-nav sticky-footer bg-dark" id="page-top"> -->
<!-- <div class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" id="mainNav"> -->
<%-- 			<form:form method="post" action="/sispenduk-app/loginProcess" --%>
<%-- 				modelAttribute="user"> --%>
<!-- 				<div class="container"> -->
<!--     			<div class="card card-login mx-auto mt-5"> -->
<!-- 				<table> -->
<!-- 					<tr> -->
<!-- 						<td>Username :</td> -->
<%-- 						<td><form:input type="text" path="username" name="username" /></td> --%>
<!-- 					</tr> -->
<!-- 					<tr> -->
<!-- 						<td>Password :</td> -->
<%-- 						<td><form:input type="password" path="password" name="pwd" /></td> --%>
<!-- 					</tr> -->
<!-- 				</table> -->
<!-- 				<tr> -->
<!-- 					<button type="submit" class="btn btn-primary btn-block" >Login</button> -->
<!-- 				</tr> -->
<!-- 				</div> -->
<!-- 				</div> -->
<%-- 			</form:form> --%>

<!-- 		</div> -->

<!-- </body> -->


<body class="bg-dark">

  <div class="container">
    <div class="card card-login mx-auto mt-5">
      <div class="card-header">Login</div>
      <div class="card-body">
<%--         <form> --%>
<form:form method="post" action="/core-app/loginProcess" 
				modelAttribute="user">
          <div class="form-group">
            <label for="exampleInputEmail1">Username</label>
            <form:input type="text" path="username" name="username" class="form-control" placeholder="Enter username"/>
          </div>
          <div class="form-group">
            <label for="exampleInputPassword1">Password</label>
            <form:input type="password" path="password" name="pwd" class="form-control"  placeholder="Password"/>
          </div>
          <div class="form-group">
            <div class="form-check">
              <label class="form-check-label">
                <input class="form-check-input" type="checkbox"> Remember Password</label>
            </div>
          </div>
<!--           <a class="btn btn-primary btn-block" href="/sispenduk-app/loginProcess">Login</a> -->
          <button type="submit" class="btn btn-primary btn-block" >Login</button> 
<%--         </form> --%>
</form:form>
      </div>
    </div>
  </div>
  <!-- Bootstrap core JavaScript-->
  <script src="resources/vendor/jquery/jquery.min.js"></script>
  <script src="resources/vendor/popper/popper.min.js"></script>
  <script src="resources/vendor/bootstrap/js/bootstrap.min.js"></script>
  <!-- Core plugin JavaScript-->
  <script src="resources/vendor/jquery-easing/jquery.easing.min.js"></script>
</body>

</html>