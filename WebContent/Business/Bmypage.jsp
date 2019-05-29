<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>마이페이지입니다</title>
    <style>
@import url('https://fonts.googleapis.com/css?family=Nanum+Gothic');

body { font-family: 'Nanum Gothic', sans-serif;}
</style>
  <link rel="stylesheet" type="text/css" href="Business/cap.css">
    <link rel="stylesheet" type="text/css" href="../cap.css">
    <style>
        #popup { width: 600px; margin: auto;}
#popup .popup_table .write_table { position:relative;}

#search {text-align:center;  border: 1px solid #cfcfcf; vertical-align:middle; line-height:29px; }

 #buttonsize input {width: 60px; height: 30px; margin-top: 5px;}
        
        .boardcss_list_table{
            padding: 50px 0px 0px 500px;
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
                <li><a href="./Bcounsel.bit"
                onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
                onmouseout="this.style.fontWeight='';this.style.color='';">온라인 상담</a></li>
            </ul>
        </div>
        <!-- 테이블 넣는 곳 -->
        <!-- 테이블 시작 -->
       <div class="boardcss_list_table" >
	<table class="list_table">
	<!--목록 위에 칸 넓이-->
		<colgroup>
			<col width="100%" />
		</colgroup>
       <tbody>
       <table style="border-spacing: 13px;">
       <tr>
       <td><a href="./Bcounsel.bit"
       onmouseover="this.style.fontWeight='bold';this.style.color='#82b5df';"
       onmouseout="this.style.fontWeight='';this.style.color='';">온라인상담</a></td>
       </tr>
       <tr>
       <td><a href="../Bcounsel.bit"><img src="../imgs/consult.png" width="250px" height="250px" padding=" 0px;"></a></td>
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

    