<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

  <title>비트교육센터입니다</title>
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
    #buttonstyle{width: 100px; height: 45px; margin-top: 65px; float: right;}
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
            <li><a href="./Medu.bit">교육과정&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>
            <li><a href="./Medu.bir">교육과정</a></li>
            <li><a href="./Medudetail.bit">강사진소개</a></li>

        </ul>
        </div>
    </section>
    <div>
        <div class="boardcss_list_table" style="background: #EAEAEA; padding: 0px 30px 30px 30px">
	<table class="list_table">
	<!--목록 위에 칸 넓이-->
		<colgroup>
			<col width="20%" />
			<col width="30%" />
			<col width="50%" />
		</colgroup>
		
        <!--thead th 속성 값 적용-->  
		<thead>
		    <h1>교육과정 상세보기</h1>
				<h3>강의</h3>
			<tr>
				<th>강의명</th>
                <th>강사명</th>
				<th>강의기간</th>
			</tr>
		</thead>
          <tbody>
			<tr>
                <td>자바</td>
				<td>최진기</td>
                <td>2018/04/20 ~ 2018/10/20</td>
            </tr>
            
		 <!--thead th 속성 값 적용-->  	
		 
		 </tbody>
          
           </table>
           <div>
           <h4>교과과정 내용</h4>
            </div>
            
            <!-- 교과과정 내용 넣는 곳-->
           <div>
        그것은 바로 그것은 바로그것은 바로그것은 바로그것은 바로그것은 바로그것은 바로그것은 바로그것은 바로그것은 바로
        그것은 바로 그것은 바로그것은 바로그것은 바로그것은 바로그것은 바로그것은 바로그것은 바로그것은 바로그것은 바로
        그것은 바로 그것은 바로그것은 바로그것은 바로그것은 바로그것은 바로그것은 바로그것은 바로그것은 바로그것은 바로    그것은 바로 그것은 바로그것은 바로그것은 바로그것은 바로그것은 바로그것은 바로그것은 바로그것은 바로그것은 바로   
        그것은 바로 그것은 바로그것은 바로그것은 바로그것은 바로그것은 바로그것은 바로그것은 바로그것은 바로그것은 바로   그것은 바로 그것은 바로그것은 바로그것은 바로그것은 바로그것은 바로그것은 바로그것은 바로그것은 바로그것은 바로
     </div>
     
    <div>
        <h4>강사소개</h4>
        <table style="width: 100%">
        <colgroup>
			<col width="33%" />
			<col width="40%" />
			<col width="40%" />
		</colgroup>
       <tr>
           <td><img src="./imgs/yu.jpg"></td>
           <td><img src="./imgs/seol.jpg"></td>
           <td><img src="./imgs/choi.jpg" style="width:92px;height: 136px"></td>
       </tr>
        <tr>
            <td>강사명: 유시민</td>
            <td>강사명: 설민석</td>
            <td>강사명: 최진기</td>
       </tr>
       <tr>
           <td>경력사항<br>
                SK고객행복주식회사 - CRM 모듈개발<br>
                탑앤와이즈(주) - SI 및 CMS 개발<br>
                삼성SDS - 시스템 운영 및 개선<br>
                교육경력사항<br>
                한국오라클교육센터 - JSP, JAVA, 방법론, JVM<br>
                한국철도공사 - JAVA, JSP<br>
                포스데이터 - JAVA, JSP<br>
                증권전산원 - JSP, EJB<br>
                비트교육센터 - JAVA고급반 강의 및 PM
            </td>
           <td>경력사항<br>
                (주)코오롱 - 사내 시스템유지관리<br>
                교육경력사항<br>
                (주)에스아이에스티 - 프로그래밍강의<br>
                삼성SDS멀티캠퍼스 - 프로그래밍강의<br>
                비트교육센터 - 단기과정 및 Java고급반 강의<br>
                비트교육센터 - JAVA고급반 강의 및 PM<br>
                쌍용정보통신 교육센터 - Java, JSP, EJB, XML, SQL<br>
                현재진행상황<br>
                정부지원 자바취업과정
            </td>
           <td>경력사항<br>
                (주)경일정보시스템 - 웹개발<br>
                (주)에프원코리아 - 웹메일개발<br>
                (주)현대정보기술 - 교육개발<br>
                (주)제이엔메디텍 - 솔루션개발<br>
                (주)IDSTRUST - ECM연구소/연구개발<br>
                (주)유와이즈원 - ECM연구소/BPI팀<br>
                현대정보기술 - Java, C/C++, JSP<br>
                저 서<br>
                열혈강의 자바 웹 개발 워크북
            </td>
       </tr>
       </table>
    </div>
    <div>
        
    </div>
    <button type="submit" id="buttonstyle">수강신청</button>
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