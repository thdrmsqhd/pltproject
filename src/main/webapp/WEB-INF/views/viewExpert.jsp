<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setCharacterEncoding("UTF-8");
%>
<c:set var="contextPath" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html lang="ko">
  <head>
    <title>Publishing Company - Free Bootstrap 4 Template by Colorlib</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Lora:ital,wght@0,400;0,500;0,600;0,700;1,400;1,500;1,600;1,700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="${contextPath }/resources/css/animate.css">
    <link rel="stylesheet" href="${contextPath }/resources/css/owl.carousel.min.css">
    <link rel="stylesheet" href="${contextPath }/resources/css/owl.theme.default.min.css">
    <link rel="stylesheet" href="${contextPath }/resources/css/magnific-popup.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.13.1/css/bootstrap-select.min.css">
    <link rel="stylesheet" href="${contextPath }/resources/css/flaticon.css">
    <link rel="stylesheet" href="${contextPath }/resources/css/style.css">
  </head>
  <body>
		
	<section class="ftco-section ftco-degree-bg">
      <div class="container">
        <div class="row">
          <div class="col-lg-8 ftco-animate">
            <!--여기부터 본문 시작-->
            <div class="col-12" style="font-size: 0;">
              <div class="col-8" style="display: inline-block; vertical-align: middle;">
                <p>
                  <img src="${contextPath }/resources/images/image_1.jpg" alt="" class="img-fluid">
                </p>
              </div>메롱
              <div style="display: inline-block; vertical-align: middle; font-size: 16px; width: 150px" >
                <ul style="list-style: none;">
                  <li> ${expertVO.expName }</li>
                  <li> ${expertVO.expEmail }</li>
                  <li> ${expertVO.expBizField }</li>
                </ul>
                <a href="${contextPath }/insertConsultingForm.do?expId=${expertVO.id }" class="btn btn-primary" style="width: 150px">컨설팅 요청</a>
              </div>
            </div>
            <div style="float: left;">
              <br><br>
              <!--상단 본문 시작부-->
              <p>
                <h3>${expertVO.expName }</h3>
                <p> ${expertVO.expDetail }</p>
              <p>
                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis, eius mollitia suscipit, quisquam doloremque distinctio perferendis et doloribus unde architecto optio laboriosam porro adipisci sapiente officiis nemo accusamus ad praesentium? Esse minima nisi et. Dolore perferendis, enim praesentium omnis, iste doloremque quia officia optio deserunt molestiae voluptates soluta architecto tempora.
              </p>
              
              <!--여기까지 상단부-->
              <p>
                <img src="${contextPath }/resources/images/image_2.jpg" alt="" class="img-fluid">
              </p>
              <p> ${expertVO.expCareer }</p>
             
              <p>Voluptas dolores dignissimos dolorum temporibus, autem aliquam ducimus at officia adipisci quasi nemo a perspiciatis provident magni laboriosam repudiandae iure iusto commodi debitis est blanditiis alias laborum sint dolore. Dolores, iure, reprehenderit. Error provident, pariatur cupiditate soluta doloremque aut ratione. Harum voluptates mollitia illo minus praesentium, rerum ipsa debitis, inventore?</p>
              <!--여기까지 본문-->
            </div>
          </div> <!-- .col-md-8 -->
      	</div>
      </div>
    </section> <!-- .section -->
    <!--Qna설치-->


    
  

  <!-- loader -->
  <div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00"/></svg></div>


  <script src="${contextPath }/resources/js/jquery.min.js"></script>
  <script src="${contextPath }/resources/js/jquery-migrate-3.0.1.min.js"></script>
  <script src="${contextPath }/resources/js/popper.min.js"></script>
  <script src="${contextPath }/resources/js/bootstrap.min.js"></script>
  <script src="${contextPath }/resources/js/jquery.easing.1.3.js"></script>
  <script src="${contextPath }/resources/js/jquery.waypoints.min.js"></script>
  <script src="${contextPath }/resources/js/jquery.stellar.min.js"></script>
  <script src="${contextPath }/resources/js/owl.carousel.min.js"></script>
  <script src="${contextPath }/resources/js/jquery.magnific-popup.min.js"></script>
  <script src="${contextPath }/resources/js/jquery.animateNumber.min.js"></script>
  <script src="${contextPath }/resources/js/scrollax.min.js"></script>
  <script src="${contextPath }/resources/https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.13.1/js/bootstrap-select.min.js"></script>
  <script src="${contextPath }/resources/js/main.js"></script>
    
  </body>
</html>