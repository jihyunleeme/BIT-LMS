<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>강사마이페이지</title>
<style>
@import url('https://fonts.googleapis.com/css?family=Nanum+Gothic');

body { font-family: 'Nanum Gothic', sans-serif;}
</style>
  <link rel="stylesheet" type="text/css" href="Teacher/cap.css">
    <link rel="stylesheet" type="text/css" href="../cap.css">
    <style>
        #popup { width: 600px; margin: auto;}
#popup .popup_table .write_table { position:relative;}

#search {text-align:center;  border: 1px solid #cfcfcf; vertical-align:middle; line-height:29px; }

 #buttonsize input {width: 60px; height: 30px; margin-top: 5px;}
        
        .boardcss_list_table{
            padding: 50px 0px 0px 300px;
            margin-top: 120px;
        }
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
        <!-- 테이블 넣는 곳 -->
        <!-- 테이블 시작 -->
       <div class="boardcss_list_table" >
	<table class="list_table">
	<!--목록 위에 칸 넓이-->
		<colgroup>
			<col width="50%" />
			<col width="50%" />
		</colgroup>
       <tbody>
       <table style="border-spacing: 13px; width:1000px;">
       <tr>
       <td><a href="Tscore.bit"
       onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
       onmouseout="this.style.fontWeight='';this.style.color='';">성적관리</a></td>
       <td><a href="Tattend.bit"
       onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
       onmouseout="this.style.fontWeight='';this.style.color='';">출석관리</a></td>
       </tr>
       <tr>
       <td><a href="Tscore.bit"><img src="./imgs/grade.png" width="300px" height="300px" padding=" 0px;"></a></td>
       <td><a href="Tattend.bit"><img src="./imgs/attend.png" width="300px" height="300px"></a></td>
       </tr>
       </table>
       </tbody>
       
     </table>
           
  </div>

      <!-- 테이블 넣는 곳 -->
     </nav>
  </nav>
</body>
</html>