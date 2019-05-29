<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
       @import url(http://fonts.googleapis.com/earlyaccess/nanumgothic.css);
      /* logo space */
        h1 {
            background-image: url(../imgs/logo.png);
            background background-repeat: no-repeat;
            position: relative;
            position: center;
            height: auto;
            color: rgba(100, 0, 0, 1);
            width: 318px;
            height: 86px;
            text-indent: -999px;
            margin: 0px 35%;
            margin-bottom: 10px;
            clear: both;
        }

        
        .container {
            background-color: rgb(255, 255, 255);
        }

        
        /* skyblueBox */
        .innerContainer {
            padding: 30px;
            background-color: rgb(209, 215, 219);
            position: relative;
            
            margin: 0% 30%;
            max-width: 500px;
            min-width: 350px;
        }
        
        .row{
            width: 100%
        }
        
        label{
            width: 20%
        }
        
        
        input[type=text],
        input[type=password] {
            position: relative;
            max-width: 100%;
            padding: 12px 20px;
            margin: 8px;
            display: inline-block;
            border: 1px solid #ccc;
            width: 
        }
        
   
        #label {
            width: 20%
        }
        
        #input {
            width: 60%
        }
        
        .Button{
        }
        
        /* LoginButton color */
        #loginButton {
            background-color: rgb(4, 73, 120);
            color: white;
            padding: 14px 20px;
            margin: none;
            border: none;
            cursor: pointer;
            width: 49%;
      
        }
        
        /* cancleButton color */
        #cancleButton {
            background-color: rgb(114, 114, 114);
            color: white;
            padding: 14px 20px;
            margin: none;
            border: none;
            cursor: pointer;
            width: 49%;

        }

        /* IdPwSignUp 아이디/비밀번호찾기 버튼*/
        .IdPwSignUp{
            position: center;
            padding: 10px 0px ;
            margin-top: 10px;
            margin-bottom: 10px;
           
        }
        
        /* IdPwButton와 signUpButton 아이디/비밀번호찾기 회원가입; */
         a {
            text-decoration: none;
            font-size: 16px;
            color: rgb(157, 157, 157);
        }
    
        .IdPwButton{
            position: relative;
            float: left;
           
            
        }
        
        .signUpButton{
            position: static;
            float: right;
           
        }
   
    </style>
</head>

<body>
    <header>
        <h1>로고자리</h1>
    </header>

    <div class="container">
        <!-- for 아이디/비번찾기 회원가입 -->
        <div class="innerContainer">
            <!-- skyblue area -->
            <div id="table">
                <div class="row">
                    <span class="cellcol1"><label for="ID" id="label">아이디&nbsp;&nbsp;&nbsp;</label></span>
                    <span><input type="text" name="ID" id="input"></span>

                </div>
                <!-- row end -->
                <div class="row">
                    <span class="cellcol1"><lable for="PW" id="label">비밀번호</lable></span>
                   
                    <span><input type="text" name="PW" id="input"></span>

                </div>
                <!-- row end -->
            </div>
            <!-- table end -->

            <div class="button">
                <button type="submit" id="loginButton">로그인</button>
                <a href="/GuroBitLms/Main.bit"><button type="reset" id="cancleButton">취소</button></a>
            </div>
            <!--botton end -->
               <div class="IdPwSignUp">
            <span class="IdPwButton"><a href="#">아이디/비밀번호 찾기</a></span>
            <span class="signUpButton"><a href="#" name="join">회원가입</a></span>
        </div>
        </div><!-- innerContainer -->

 

    </div>
    <!-- container end -->

</body>
</html>
