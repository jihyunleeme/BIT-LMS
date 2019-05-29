<%@page import="com.bit.model.dto.UsersDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>강의수정 페이지</title>
<style>
@import url('https://fonts.googleapis.com/css?family=Nanum+Gothic');

body { font-family: 'Nanum Gothic', sans-serif;}
</style>
<link rel="stylesheet" type="text/css" href="Admin/cap.css">
<link rel="stylesheet" type="text/css" href="../cap.css">
<style>
/* 강의 수정 폼*/
#popup {
	width: 600px;
	margin: auto;
}

#popup .popup_table .write_table {
	position: relative;
}

#search {
	text-align: center;
	border: 1px solid #cfcfcf;
	vertical-align: middle;
	line-height: 29px;
}

.addButton {
	width: 85px;
	text-align: center;
	display: inline-block;
	border: 1px solid #bebebe;
	padding: 6px 0 6px;
	cursor: pointer;
	font-weight: bold;
	float: right;
	margin-right: 15px;
}
</style>
</head>

<body>
	<header> </header>


	         <div class="mainMenu">
                <div style="position:relative;left:850px;top:-25px; width:200px;">
             <span><a href="./Mlogout.bit" style=" font-weight:normal; color:gray;"
             onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
             onmouseout="this.style.fontWeight='';this.style.color='gray';">로그아웃</a></span>
        </div>
             <span style="position: relative;top:-23px;">
               <a href="./Mintroduce.bit"
             onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
             onmouseout="this.style.fontWeight='';this.style.color='';">학원소개</a></span>
             <span style="position: relative;top:-23px;">
               <a href="./Medu.bit"
             onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
             onmouseout="this.style.fontWeight='';this.style.color='';">교육과정</a></span> 
             <span style="position: relative;top:-23px;">
               <a href="./Mnotice.bit"
             onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
             onmouseout="this.style.fontWeight='';this.style.color='';">공지사항</a></span> 
             <span style="position: relative;top:-23px;">
               <a href="./Mreview.bit"
             onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
             onmouseout="this.style.fontWeight='';this.style.color='';">수료생후기</a></span>
             <span style="position: relative;top:-23px;">
               <a href="./Mcounselview.bit"
             onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
             onmouseout="this.style.fontWeight='';this.style.color='';">온라인상담</a></span>
		</div>
	<div class="adminBg">
		<!--사람모양 그림-->
		<div class="Img">
			<div class="adminImgCircle"></div>
			<div class="adminImg"></div>

		</div>
		<!--메뉴버튼-->


		<ul>
			<li style="margin-bottom: 5px;"><a href="./Aedu.bit"
			        onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
                    onmouseout="this.style.fontWeight='';this.style.color='';">강의관리</a></li>
				<ul style="width: 100px; margin: 0px;">
					<li style="margin-bottom: 0px;"><a href="./Aedu.bit"
					onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
            	    onmouseout="this.style.fontWeight='';this.style.color='';">강의목록</a></li>
					<li style="margin-bottom: 0px;"><a href="./Aeduadd.bit"
					onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
                    onmouseout="this.style.fontWeight='';this.style.color='';">강의개설</a></li>
					<li style="margin-bottom: 30px;"><a href="./Astudentok.bit"
					onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
                    onmouseout="this.style.fontWeight='';this.style.color='';">학생승인</a></li>
			</ul>
		<ul style="margin:0px; padding:0px;">
			<li style="margin-bottom:30px;"><a href="./Aattend.bit"
			onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
             onmouseout="this.style.fontWeight='';this.style.color='';">출석조회</a></li>
		</ul>
		<ul style="margin:0px; padding:0px;">
			<li style="margin-bottom:5px;"><a href="./Areview.bit"
			onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
             onmouseout="this.style.fontWeight='';this.style.color='';">수료후기</a></li>		
				<ul style="width: 100px; margin: 0px;">
					<li style="margin-bottom: 0px;"><a href="./Areview.bit"
					onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
                    onmouseout="this.style.fontWeight='';this.style.color='';">후기목록</a></li>
					<li style="margin-bottom:30px"><a href="./Areviewinsert.bit"
					onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
                    onmouseout="this.style.fontWeight='';this.style.color='';">후기작성</a></li>
				</ul>
		</ul>	
			<li style="margin-bottom:30px;"><a href="./Apower.bit"
			 onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
             onmouseout="this.style.fontWeight='';this.style.color='';">권한설정</a></li>
		</ul>
		<ul style="margin:0px">
			<li style="margin-bottom:0px;"><a href="./Anotice.bit"
			 onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
             onmouseout="this.style.fontWeight='';this.style.color='';">공지사항</a></li>
				<ul style="width: 100px; margin: 0px;">
					<li style="margin-bottom: 0px;"><a href="./Anotice.bit"
					onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
                    onmouseout="this.style.fontWeight='';this.style.color='';">공지목록</a></li>
					<li style="margin-bottom:30px"><a href="./Anoticeinsert.bit"
					onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
                    onmouseout="this.style.fontWeight='';this.style.color='';">공지작성</a></li>
				</ul>
		</ul>
	</div>
	<!-- 테이블 넣는 곳 -->
	<!-- 테이블 시작 -->
	<div class="boardcss_list_table">
		<h1>권한설정</h1>
		<table class="list_table">
			<!--목록 위에 칸 넓이-->
			<form method="post">
			<input type="text" class="idButton" placeholder="아이디를 검색하세요" name="select">
			<input type="submit" value="검색">
			</form>

			<colgroup>
				<col width="35%" />
				<col width="35%" />
				<col width="30%" />
			</colgroup>

			<!--thead th 속성 값 적용-->
			<thead>
				<tr>
					<th>권한</th>
					<th>아이디</th>
					<th>이름</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<form method="post">
					<td><select class="powerOption" size="1" name="power">
							<option value="1">학생</option>
							<option value="2">행정</option>
							<option value="3">강사</option>
							<option value="4">영업</option>
							
							<%UsersDto dto=(UsersDto)request.getAttribute("select");
							if(dto!=null){
							%>
							<td><%=dto.getId() %></td>
							<td><%=dto.getName() %></td>
							<%} %>
					</select></td>
				</tr>


			</tbody>
		</table>
		<% dto=(UsersDto)request.getAttribute("select");
		if(dto!=null){%>
		<input type="hidden" value="<%=dto.getId()%>" name="id">
		<input type="hidden" value="<%=dto.getName()%>" name="name">
		<input type="submit">
		</form>
		<%} %>
	</div>
	</div>
	</div>


	<!-- 테이블 넣는 곳 -->

</body>
</html>