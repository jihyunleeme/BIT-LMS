<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <style>
      .logoNmenu{
            display:block
        }
        header {
            background-image: url('./imgs/relogosize.png');
            background-repeat: none;
            max-width: 255px;
            width: 30%;
            height: 69px;
            margin-top: 20px;
            text-indent: -999px;
            display: inline-block;
            float: left;
            
        }

        .menu {
            display: inline;
            float: right;
            width: 70%;
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
   

        a {
            text-decoration: none;
            font-weight: bold;
        }
        
        .leftMenu{
            display: inline-block;
            float: left;
            clear: both;
            margin-top: 60px;
        }
        
        ul>li{
            background-color: rgb(132, 170, 196);
            list-style: none;
            padding: 15px;
        }
        
        ul> li:first-child{
            
            background-color: rgb(199,199,199);
            margin-bottom: 10px;
            padding: 15px;
        }
        
        footer {
            display: block;
            float: right;
            bottom: 0px;
            background: rgb(199, 199, 199);
            color: white;
            padding: 0px 30px;
        }

        footer>p {
            text-align: center;
        }
        
    /* boardcss_list 에서 사용하는 글 목록 테이블 크기*/
    .boardcss_list_table {
	display: inline-block;
	width: 70%;
    margin-bottom: 30px;
    }

    /* 화면에 보여지는 글 목록 테이블 */
    .list_table {
	width: 100%;
    }

    /* 화면에 보여지는 caption */
    .list_table caption {
	display: none;
    }

    /* list_table 에서 사용되는 thead */
    .list_table thead th {
	text-align: center;
	border-top: 1px solid #82b5df;
	border-bottom: 1px solid #82b5df;
	padding: 8px 0;
	background: white;
    }

    /* list_table 에서 사용되는 tbody */
    .list_table tbody td {
	text-align: center;
	border-bottom: 3px solid white;
	padding: 5px 0;
    }

        

/* boardcss_list 에서 사용하는 글 목록 테이블 크기*/
.boardcss_list_table {
	display: inline-block;
	width: 70%;
	position: absolute;
}

/* 화면에 보여지는 글 목록 테이블 */
.list_table {
	width: 100%;
}

/* 화면에 보여지는 caption */
.list_table caption {
	display: none;
}

/* list_table 에서 사용되는 thead */
.list_table thead th {
	text-align: center;
	border-top: 1px solid #82b5df;
	border-bottom: 1px solid #82b5df;
	padding: 8px 0;
	background: #faf9fa;
}

/* list_table 에서 사용되는 tbody */
.list_table tbody td {
	text-align: center;
	border-bottom: 1px solid #e5e5e5;
	padding: 5px 0;
}
        
.color{ background-color: #e5e5e5}        
    </style>
</head>


<body>
 
    <div class="logoNmenu">
	<a href="./Main.bit"></a>
    <header>
    </header>


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
    
    <section class="leftMenu">
       <div class="leftMenulist">
        <ul>
            <li><a href="./Medu.bit">교육과정</a>
            <li><a href="./Medu.bit">교육과정</a></li>
			<li><a href="./Medudetail.bit">강사진 보기</a></li>
        </ul>
        </div>
    </section>
    
    <div class="list_table">
    <div style="display: inline-block; margin: 0 0 0 250px">
     <table class="color" style="margin: 240px 0 0px 0; width:480px;">
       <tbody>
       <h1 class="color">교육과정</h1>
            <tr>
             <div>
            <img src="./imgs/yu.jpg" style="padding:0px 0px 0px 20px; position: absolute; height: 200px">
            <img src="./imgs/seol.jpg" style="padding:0px 0px 0px 173px; position: absolute; height: 200px">
            <img src="./imgs/choi.jpg" style="padding:0px 0px 0px 325px; position: absolute; height: 200px">
            </div>
            
        </tr>
        <tr>
         <th><h2>강의명:자바</h2></th>
         <th><h2>강의명:웹</h2></th>
         <th><h2>강의명:디비</h2></th>
        </tr>
        <tr>
         <th>강사진:유시민</th>
         <th>강사진:설민석</th>
         <th>강사진:최진기</th>
        </tr>
        <tr>
         <th>모집인원:20명</th>
         <th>모집인원:20명</th>
         <th>모집인원:20명</th>
        </tr>   
        <tr>
         <th>강의기간:<br> 2018/05/22<br> ~ 2018/08/22</th>
         <th>강의기간:<br> 2018/05/22<br> ~ 2018/08/22</th>
         <th>강의기간:<br> 2018/05/22<br> ~ 2018/08/22</th>
        </tr>
        <div class="color">
     <tr> 
       <td><a href="" style="margin: 0px 0 0px 30">강의자세히보기</a></td>
       <td><a href="" style="margin: 0px 0 0px 50">강의자세히보기</a></td>
       <td><a href="" style="margin: 0px 0 0px 50">강의자세히보기</a></td>
		</div>
	</tr>	
	<tr>
     <div class="color" style="float:none;" id="buttonsize" >
     	<td><input type="submit" value="모집완료" style="margin: 0px 0 0px 45"></td>
		<td><input type="submit" value="모집완료" style="margin: 0px 0 0px 85"></td>
		<td><input type="submit" value="모집완료" style="margin: 0px 0 0px 80"></td>
	</div>
	</tr>     
       </tbody>
     </table>
     
    </div>
    </div>
    <footer style="position:fixed;">
        <div>
            <p>
                비트캠프 서울시 서초구 서초동 1327-15 비트아카데미빌딩｜ 사업자등록번호 : 214-85-24928 (주)비트컴퓨터 서초지점 대표이사 : 조현정 / 문의 : 02-3486-9600 / 팩스 : 02-6007-1245 통신판매업 신고번호 : 제 서초-00098호 / 개인정보보호관리책임자 : 권도혁 Copyright (c) 비트캠프 All rights reserved.
            </p>
        </div>
    </footer>
    </body>
</html>