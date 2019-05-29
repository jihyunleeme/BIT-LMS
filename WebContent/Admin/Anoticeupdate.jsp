<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Admin 마이페이지입니다</title>
    <style>
@import url('https://fonts.googleapis.com/css?family=Nanum+Gothic');

body { font-family: 'Nanum Gothic', sans-serif;}
</style>
     <link rel="stylesheet" type="text/css" href="Admin/cap.css">
<link rel="stylesheet" type="text/css" href="../cap.css">
    <style>
        /* 강의 수정 폼*/
     #popup { width: 600px; margin: auto;}
        #popup .popup_table .write_table { position:relative;}
        #search {text-align:center;  border: 1px solid #cfcfcf; vertical-align:middle; line-height:29px; }
        #buttonsize input {width: 60px; height: 30px; margin-top: 5px;}
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
	<table class="list_table">
	<!--목록 위에 칸 넓이-->
		<colgroup>
			<col width="15%" />
			<col width="50%" />
			<col width="15%" />
			<col width="25%" />
		</colgroup>
		
        <!--thead th 속성 값 적용-->  
		<thead>
		    <h1>공지사항 수정</h1>
			<tr>
				<th>No.</th>
				<th>제목</th>
				<th>작성일</th>
			</tr>
		</thead>
          <tbody>
			<tr>
				<td>1</td>
				<td>최진기</td>
                <td>2018-06-01</td> 
            </tr>
		 <!--thead th 속성 값 적용-->  	
	
		 </tbody>
		</table>
        <div id="popup">
     <table >
      <caption></caption>
       <colgroup>
        <col style="width:100px;" />
        <col />
       </colgroup>
       <tbody>
        <tr>

         <th>제목</th>
         <td colspan="4"><input id="search" type="text" name="" style="width:100%"></td>
        </tr>

         <th>내용</th>
         <td colspan="4"><textarea name="contents" cols="65" rows="13" style="height:300px;"></textarea></td>
        </tr>
        
       </tbody>
     </table>
        <div style="float: right" id="buttonsize">
     <input type="submit" value="목록">
     <input type="submit" value="저장">
     </div>  
   </div>
  </div>

      <!-- 테이블 넣는 곳 -->
  
</body>
</html>