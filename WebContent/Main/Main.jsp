<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>비트교육센터입니다</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>

<style type="text/css">

body {overflow-y: hidden; overflow-x: hidden;}
.logoNmenu {
	display: block
}

header {
	background-image: url('../imgs/relogosize.png');
	background-repeat: none;
	max-width: 255px;
	width: 30%;
	height: 69px;
	margin-top: 40px;
	text-indent: -999px;
	display: inline-block;
	float: left;
}

.menu {
	display: inline;
	float: right;
	width: 70%;
	padding-right: 5%;
}
.menuo1{
}

ol {
	list-style: none;
	display: inline-block;
	float: right;
}

ol>li {
	margin: 0px 20px;
	margin-top: 35px;
	color: black;
	display: inline-block;
}

li> span>a {
	text-decoration: none;
	font-weight: bold;
	color: black;
}

span> a {
	text-decoration: none;
	font-weight: normal;
	color: gray;
}
.loginsection {
	width: 100%;
	display: block;
	padding-left: 85%;
}
.span{ 
color:gray;}


footer {

  display: block;
            float: right;
            position: fixed;
            bottom: 0px;
            background: rgb(199, 199, 199);
            color: white;
            padding: 0px 30px;

}

footer>p {
	text-align: center;
}

.container {
	padding-top: 200px;
	margin-left: 20%;
}

.bxslider {
	width: 100%;
	height: 345px;
}

}
img {
	width: 960px;
	height: 345px;
	display: block;
	margin-left: auto;
	margin-right: auto;
	width: 50%;
}
</style>

<script>
	$(document).ready(function() {
		$('.bxslider').bxSlider({
			auto : true,
			autoControls : true,
			stopAutoOnClick : true,
			pager : true,
			slideWidth : 960,
			speed : 300
		});
	});
</script>
</head>
<body>
	<div class="loginsection">
		<span class="beforelogin">
			<a href="">로그인&nbsp;&nbsp;&nbsp;&nbsp;회원가입</a>
		</span>
	</div>

	<header> </header>

	<div class="logoNmenu">
		<a href="./Main.bit"></a>

		<div class="menu">
			<ol id="menuol">
				            
                        <li><span style="position: relative;top:-23px;">
               <a href="./Mintroduce.bit"
             onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
             onmouseout="this.style.fontWeight='';this.style.color='';">학원소개</a></span></li>
              <li><span style="position: relative;top:-23px;">
               <a href="./Medu.bit"
             onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
             onmouseout="this.style.fontWeight='';this.style.color='';">교육과정</a></span> </li>
              <li><span style="position: relative;top:-23px;">
               <a href="./Mnotice.bit"
             onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
             onmouseout="this.style.fontWeight='';this.style.color='';">공지사항</a></span> </li>
             <li><span style="position: relative;top:-23px;">
               <a href="./Mreview.bit"
             onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
             onmouseout="this.style.fontWeight='';this.style.color='';">수료생후기</a></span></li>
              <li><span style="position: relative;top:-23px;">
               <a href="./Mcounselview.bit"
             onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
             onmouseout="this.style.fontWeight='';this.style.color='';">온라인상담</a></span></li>
             </ol>

		
		</div>
		<!--menu end -->
	</div>
	<!--logoNmenu end -->


	<div class="container">
		<div class="bxslider">
			<img class="slide"
				src="http://www.bitacademy.com/Images/Banners/MainPage_Banner__Summer2018.png">
			<img class="slide"
				src="http://www.bitacademy.com/Images/Banners/MainPage_Banner__Industry40_IoTSelfDriving.png" />
			<img class="slide"
				src="http://www.bitacademy.com/Images/Banners/widebanner_Bitacademy.png">
			<img class="slide"
				src="http://www.bitacademy.com/Images/Banners/MainPage_Banner__BITsupporters.jpg" />
		</div>
	</div>
	<!-- container -->


	<footer>
		<div>
			<p>비트캠프 서울시 서초구 서초동 1327-15 비트아카데미빌딩｜ 사업자등록번호 : 214-85-24928
				(주)비트컴퓨터 서초지점 대표이사 : 조현정 / 문의 : 02-3486-9600 / 팩스 : 02-6007-1245
				통신판매업 신고번호 : 제 서초-00098호 / 개인정보보호관리책임자 : 권도혁 Copyright (c) 비트캠프 All
				rights reserved.</p>
		</div>
	</footer>
</body>
</html>