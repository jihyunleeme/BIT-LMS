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
    <link rel="stylesheet" type="text/css" href="../cap.css"></head>
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
				<h1>출석수정</h1>
				<br> 날짜 <input type="date" value="2018-05-29"> <input
					type="text" placeholder="학생 이름을 검색하세요"> <input
					type="button" value="검색">
				<table class="list_table">
					<!--목록 위에 칸 넓이-->
					<colgroup>
						<col width="15%" />
						<col width="30%" />
						<col width="15%" />
						<col width="15%" />
						<col width="15%" />
					</colgroup>

					<!--thead th 속성 값 적용-->
					<thead>
						<tr>
							<th>날짜</th>
							<th>이름</th>
							<th>출석</th>
							<th>지각</th>
							<th>결석</th>
							<th>수정</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>1</td>
							<td>비비디바비디</td>
							<td><input type="radio" checked="checked" name="radio"></td>
                            <td><input type="radio"  name="radio"></td>
                            <td><input type="radio"  name="radio"></td>
							<td><button type="submit" value="수정">수정</button></td>						
						</tr>

						<tr>
							<td></td>
							<td></td>
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
							<td></td>
							<td></td>
						</tr>
						<!--thead th 속성 값 적용-->
						<!-- 표 맨 아래 오른쪽으로 붙은 버튼 생성시 button type="submit" id="rightSubmit"쓰시면 됩니다-->
					</tbody>
				</table>

			</div>
			<!-- 테이블 넣는 곳 -->
</body>
</html>