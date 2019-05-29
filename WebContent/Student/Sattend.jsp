<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Student 마이페이지입니다</title>
    <style>
@import url('https://fonts.googleapis.com/css?family=Nanum+Gothic');

body { font-family: 'Nanum Gothic', sans-serif;}
</style>
    <link rel="stylesheet" type="text/css" href="Student/cap.css">
    <link rel="stylesheet" type="text/css" href="../cap.css">
      <style>
    <style>        
    </style>
</head>

<body>
<header>
    </header>
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
						<li><a href="Sattend.bit"
						onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
                        onmouseout="this.style.fontWeight='';this.style.color='';">출석열람</a></li>
						<li><a href="Sscore.bit"
						onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
                        onmouseout="this.style.fontWeight='';this.style.color='';">성적열람</a></li>
			</ul>
        </div>

<!-- 테이블 시작 -->

<div class="boardcss_list_table">
<h1>출석조회</h1>
	<table class="list_table">
	<!--목록 위에 칸 넓이-->
	
<div>
	<!--목록 위에 칸 넓이-->
		<colgroup>
			<col width="20%" />
			<col width="20%" />
			<col width="20%" />
			<col width="20%" />
			<col width="20%" />
			
		</colgroup>
		<!--thead th속성 값 적용-->
		<thead>
            
			<tr>
				<th>이름</th>
				<th>출석날짜</th>
				<th>출석</th>
				<th>결석</th>
				<th>지각</th>
				
				
			</tr>
		</thead>
<tbody>
        <!--목록-->
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				
            </tr>
			
		<!--목록 아래 칸 넓이-->
		<colgroup>
			<col width="100%" />
			
		</colgroup>	
		
		<thead>
		
		    <tr>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				
			</tr>
			
		</thead>
		
		</tbody>
		 </div>
		</table>
       </div>
        
 
    </body>
    </html>
