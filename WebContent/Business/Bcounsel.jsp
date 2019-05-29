<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page import = "java.util.List, com.bit.model.dto.*, java.util.ArrayList" %>
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
    <link rel="stylesheet" type="text/css" href="Business/cap.css">
   <style>
   table.list_table td a{
   display:block;
    　width:100%;
      height:100%;
   }
   table.list_table tr:HOVER{
   background-color: #EAEAEA;
   }
    </style>
</head>
	<% List<CounselDto> list = (List)request.getAttribute("counsel"); 
	   List<ReplyDto> list2 = (List)request.getAttribute("reply");
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
  <h1>온라인 상담 문의</h1>
	<table class="list_table">
	<!--목록 위에 칸 넓이-->
	
<div>
		<colgroup>
			<col width="10%" />
			<col width="15%" />
			<col width="15%" />
			<col width="35%" />
			<col width="15%" />
			<col width="10%" />
		</colgroup>
		
        <!--thead th 속성 값 적용-->  
		<thead>
			<tr>
				<th>글번호</th>
				<th>작성일</th>
				<th>작성자</th>
				<th>제목</th>
				<th>답변작성하기</th>
				<th>답변여부</th>
			</tr>
		</thead>
         	 <%
				for(int i=0; i<list.size(); i++){
					CounselDto bean=list.get(i);
			 %>
			<tr>	
				<td><a href="Bcounseldetail.bit?idx=<%=bean.getNum() %>"><%=bean.getNum() %></a></td>
				<td><a href="Bcounseldetail.bit?idx=<%=bean.getNum() %>"><%=bean.getWday() %></a></td>
				<td><a href="Bcounseldetail.bit?idx=<%=bean.getNum() %>"><%=bean.getWuser() %></a></td>
				<td><a href="Bcounseldetail.bit?idx=<%=bean.getNum() %>"><%=bean.getSub() %></a></td>		
				<td>
					<button type="button" style="margin:auto;" onclick="location.href='Bcounseldetail.bit?idx=<%=bean.getNum() %>'">
						작성하기
					</button>
				</td>
			<%

				int num=0;
				for(int j=0; j<list2.size(); j++){
					ReplyDto bean2 = list2.get(j);
					int number = bean2.getNum();
					if(bean.getNum()==number){
						num = 1;
						
						break;
					}
				}
				if(num==1){
			%>		
					<td>O</td>
			<%		
				}else{
			%>
					<td>X</td>
			<%
				}
			%>
					</tr>
			<%		
			
		}
			%>
			
		 <!--thead th 속성 값 적용-->  	
       </div>
		</table>
       </div>

     </body>
    </html>
