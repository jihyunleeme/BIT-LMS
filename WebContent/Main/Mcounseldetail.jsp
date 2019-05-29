<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page import = "java.util.List, com.bit.model.dto.CounselDto,com.bit.model.dto.ReplyDto" %>
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
	<% 

		List<CounselDto> list1 = (List)request.getAttribute("counsel"); 
	  	List<ReplyDto> list2 = (List)request.getAttribute("reply");
	%>  

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
    
        
       <div class="boardcss_list_table" >
	<table class="list_table">
	<!--목록 위에 칸 넓이-->
		<colgroup>
			<col width="10%" />
			<col width="10%" />
			<col width="10%" />
			<col width="60%" />
			<col width="10%" />
		</colgroup>
		
        <!--thead th 속성 값 적용-->  
		<thead>
		    <h1>온라인상담</h1>
			<tr>
				<th>No.</th>
                <th>날짜</th>
				<th>이름</th>
				<th>제목</th>
				<th>답변여부</th>
			</tr>
		</thead>
          <tbody>
          <%
          		for(int i=0; i<list1.size(); i++){
          			CounselDto bean = list1.get(i);
		  %>          
			<tr>
				<td><%=bean.getNum() %></td>
				<td><%=bean.getWday() %></td>
				<td><%=bean.getWuser() %></td>
				<td><%=bean.getSub() %></td>
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
		 <!--thead th 속성 값 적용-->  	
		 	</tbody>  
           </table>
           <div style="text-align: left; font-size: 20px; margin-bottom: 10px">
               		<strong>글내용</strong>
               </div>
           <div class="detailview" id="bord" style="text-align: center; border-bottom: solid 1px #EAEAEA; padding-bottom: 10px;">
        		<%=bean.getCont() %>
    	 </div>
     		<%
          		}
            %> 
     <table class="list_table">
	<!--목록 위에 칸 넓이-->
		<colgroup>
			<col width="10%" />
			<col width="80%" />
			<col width="10%" />
		</colgroup>
		
        <!--thead th 속성 값 적용-->  
          <tbody>
			<%
          		for(int i=0; i<list2.size(); i++){
          			ReplyDto bean2 = list2.get(i);
		  	%>       
            <tr>
             <td><%=bean2.getWuser() %></td>
             <td colspan="4"><%=bean2.getCont() %></td>
             <td style="width: 115px"><%=bean2.getWday() %></td>
            </tr>
			<%
          		}
			%>                   
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
