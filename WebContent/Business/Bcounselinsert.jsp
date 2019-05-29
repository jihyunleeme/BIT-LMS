<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page import = "java.util.List, com.bit.model.dto.CounselDto,com.bit.model.dto.ReplyDto" %>
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
          
    </style>
</head>
<% 
	/*
		String name = (String)session.getAttribute("name");
	*/
	
	List<CounselDto> list = (List)request.getAttribute("counsel"); 
%>

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

<!-- 테이블 시작 -->
<div class="boardcss_list_table">
     <h1>온라인 상담 답변수정</h1>
	<table class="list_table">
	<!--목록 위에 칸 넓이-->
	
<div>

		<colgroup>
			  <col width="10%" />
			  <col width="15%" />
			  <col width="15%" />
			  <col width="50%" />
			  <col width="10%" />
		</colgroup>
		
        <!--thead th 속성 값 적용-->  
		<thead>
		
			<tr>
				<th>글번호</th>
				<th>작성일</th>
				<th>작성자</th>
				<th>제목</th>
				<th>답변여부</th>
			</tr>
		</thead>
          <tbody>
          <% for(int i=0; i<list.size(); i++){ 
          		CounselDto bean = list.get(i);
          %>
			<tr>
				<td><%=bean.getNum() %></td>
				<td><%=bean.getWday() %></td>
				<td><%=bean.getWuser() %></td>
				<td><%=bean.getSub() %></td>
				<td>o</td>
		  
            </tr>
           <%} %>
		 <!--thead th 속성 값 적용-->  	
		  <thead>	
			<tr>
               <td><strong>comment</strong></td>      
               <form method="post">     
               <td colspan="4">
               <textarea name="contents" cols="150" rows="13" style="height:80px;" >
               
               </textarea>
               <button type="submit" id="rightSubmit" >수정</button>
               </td>
            </tr>
         </thead>
		
         </tbody>
         </div>
		 </table>
         </div>
  
     </body>
    </html>

    