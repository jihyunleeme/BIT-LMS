<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>비트교육센터입니다</title>
  <link rel="stylesheet" type="text/css" href="Main/maincap.css">
  <link rel="stylesheet" type="text/css" href="../maincap.css">
    <style>
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
            <li><a href="./Mcounselview.bit">온라인 상담</a></li>
            <li><a href="./Mcounselview.bit">온라인 상담</a></li>
        </ul>
        </div>
    </section>
    
    
    <div class="list_table">
    <div style="display: inline-block; margin: 0 0 0 250px">
     <table>
       <tbody>
       <h1>온라인 상담</h1>
        <form method="post">
        <tr>
         <th>이름</th>
         <td><input type="text" name="name"></td>
         <th>비밀번호</th>
         <td><input type="password" name="pw"></td>
        </tr>
        <tr>
         <th>제목</th>
         <td colspan="3"><input type="text" name="sub" style="width:447px"></td> 
        </tr>
        <tr>
         <th>내용</th>
         <td colspan="4"><textarea name="contents" cols="65" rows="13" style="height:300px;"></textarea></td>
        </tr>   
       </tbody>
     </table>
     <div style="float: right" id="buttonsize">
         <input type="submit" value="상담신청">
         </div>  
    </form>
    </div>
    </div>
    <footer>
        <div>
            <p>
                비트캠프 서울시 서초구 서초동 1327-15 비트아카데미빌딩｜ 사업자등록번호 : 214-85-24928 (주)비트컴퓨터 서초지점 대표이사 : 조현정 / 문의 : 02-3486-9600 / 팩스 : 02-6007-1245 통신판매업 신고번호 : 제 서초-00098호 / 개인정보보호관리책임자 : 권도혁 Copyright (c) 비트캠프 All rights reserved.
            </p>
        </div>
    </footer>
    </body>
</html>