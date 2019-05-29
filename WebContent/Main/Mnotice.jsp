<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page import = "java.util.List, com.bit.model.dto.NoticeDto" %>
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
<% List<NoticeDto> list = (List)request.getAttribute("notice"); %>

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
            <li><a href="./Mnotice.bit">공지사항&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a></li>
        </ul>
        </div>
    </section>
    
    
       <div class="boardcss_list_table" >
	<table class="list_table">
	<!--목록 위에 칸 넓이-->
		<colgroup>
			<col width="15%" />
			<col width="70%" />
			<col width="15%" />
		</colgroup>
		
        <!--thead th 속성 값 적용-->  
		<thead>
		    <h1>공지사항</h1>
			<tr>
				<th>No.</th>
				<th>제목</th>
				<th>작성일</th>

			</tr>
		</thead>
          <tbody>
			<%
				for(int i=0; i<list.size(); i++){
					NoticeDto bean = list.get(i);
			%>
          
			<tr>
				<td><a href="Mnoticedetail.bit?idx=<%=bean.getNum() %>"><%=bean.getNum() %></a></td>
				<td><a href="Mnoticedetail.bit?idx=<%=bean.getNum() %>"><%=bean.getSub() %></a></td>
				<td><a href="Mnoticedetail.bit?idx=<%=bean.getNum() %>"><%=bean.getWday() %></a></td>
            </tr>
			<%} %>
		 <!--thead th 속성 값 적용-->  	
		 </tbody>
		</table> 
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