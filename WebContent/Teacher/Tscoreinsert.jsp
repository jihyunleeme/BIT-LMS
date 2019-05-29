<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Teacher 마이페이지입니다</title>
    <style>
@import url('https://fonts.googleapis.com/css?family=Nanum+Gothic');

body { font-family: 'Nanum Gothic', sans-serif;}
</style>
  <link rel="stylesheet" type="text/css" href="Teacher/cap.css">
    <link rel="stylesheet" type="text/css" href="../cap.css">
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
       
 

 
<!-- 테이블 시작 -->
<div class="boardcss_list_table">
<h1>성적입력</h1>
 	<div class="nameButtonNsubmit">
<input type="text" class="nameButton" placeholder="학생명을 검색하세요">
<button type="submit">검색</button>
</div><!-- nameButtonNsubmit end -->
	<table class="list_table">
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
				<th>아이디</th>
				<th>이름</th>
				<th>java</th>
				<th>web</th>
				<th>db</th>
				
			</tr>
		</thead>
<tbody>
        <!--목록-->
        <form action="" method="post">
        <%for(int i=0; i<20; i++){ %>
			<tr>
				<td name="id"<%=i %>>id </td>
				<td name="name"<%=i %>>name </td>
				
				<td>
				<input type="text" class="contButton" placeholder="내용을 입력하세요" name="java<%=i %>>">
				</td>
				
				<td>
				<input type="text" class="contButton" placeholder="내용을 입력하세요" name="web<%=i %>">
				</td>
				
				<td>
				<input type="text" class="contButton" placeholder="내용을 입력하세요" name="db<%=i %>">
				</td>
				
            </tr>
        <%} %>
        </form>
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
		</table>
      <button id="rightSubmit" type="submit">저장</button>

       </div>
    
     </body>
    </html>