<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Teacher 마이페이지입니다</title>
<style>
@import url('https://fonts.googleapis.com/css?family=Nanum+Gothic');

body { font-family: 'Nanum Gothic', sans-serif;}
</style>
  <link rel="stylesheet" type="text/css" href="Teacher/cap.css">
    <link rel="stylesheet" type="text/css" href="../cap.css">
</head>
<body>
	<header></header>

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
                <li style="margin-bottom: 5px;"><a href=""
                           onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
                           onmouseout="this.style.fontWeight='';this.style.color='';">출석관리</a></li>
                    <ul style="width: 100px; margin: 0px;">
                        <li style="margin-bottom: 0px;"><a href=""
                           onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
                           onmouseout="this.style.fontWeight='';this.style.color='';">출석조회</a></li>
                        <li style="margin-bottom: 0px;"><a href=""
                           onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
                           onmouseout="this.style.fontWeight='';this.style.color='';">출석체크</a></li>
                        <li><a href=""
                           onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
                           onmouseout="this.style.fontWeight='';this.style.color='';">출석수정</a></li>
                    </ul>
                <li style="margin-bottom: 5px;"><a href=""
                           onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
                           onmouseout="this.style.fontWeight='';this.style.color='';">성적관리</a></li>
                    <ul style="width: 100px; margin: 0px;">
                        <li style="margin-bottom: 0px;"><a href=""
                           onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
                           onmouseout="this.style.fontWeight='';this.style.color='';">성적조회</a></li>
                        <li style="margin-bottom: 0px;"><a href=""
                           onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
                           onmouseout="this.style.fontWeight='';this.style.color='';">성적 입력 
                         &nbsp;&nbsp;&nbsp;및 수정</a></li>
                    </ul>
            </ul>
			</div>
			<!-- 테이블 넣는 곳 -->
			<!-- 테이블 시작 -->
			<div class="boardcss_list_table">
				<h1>출석체크</h1>
					<br> 날짜 <input type="date" value="2018-05-29"><input
					type="button" value="검색">
				<table class="list_table">

					<!--목록 위에 칸 넓이-->
					<colgroup>
						<col width="15%" />
						<col width="30%" />
						<col width="15%" />
						<col width="15%" />
					</colgroup>

					<!--thead th 속성 값 적용-->
					<thead>
						<tr>
							<th>이름</th>
							<th>출석</th>
							<th>지각</th>
							<th>결석</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>이정현</td>
							<td><input type="radio" name="nameMakesAgroup" checked=checked value="출석"></td>
							<td><input type="radio" name="nameMakesAgroup" value="지각"></td>
							<td><input type="radio" name="nameMakesAgroup" value="결석"></td>
			
						</tr>

						<tr>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
						</tr>

						<tr>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
						</tr>

						<!--thead th 속성 값 적용-->
					</tbody>
				</table>
				
			<div>
					<button id="rightSubmit" type="submit" value="저장">저장</button>
			</div>
			</div>
			<!-- 테이블 넣는 곳 -->
	

</body>
</html>