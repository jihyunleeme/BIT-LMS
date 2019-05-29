<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
       @import url(http://fonts.googleapis.com/earlyaccess/nanumgothic.css);
	  
        header {
            
            background-image: url(../imgs/logo.png);
            background background-repeat: no-repeat;
            background-size: 90%;
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
            background-color: rgb(209, 215, 219);
            position: relative;
            position: center;
            margin: 0% 30%;
            max-width: 500px;
        }

        .insideContainer {
            padding: 40px 40px;

        }

        input[type=text],
        input[type=password] {
            width: 99%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            box-sizing: border-box;
        }

        button {
            background-color: rgb(4, 73, 120);
            color: white;
            padding: 14px 20px;
            margin: none;
            border: none;
            cursor: pointer;
            width: 49%;

        }

        #cancleButton {
            background-color: rgb(114, 114, 114)
        }

        a {
            text-decoration: none;
            font-size: 16px;
            color: rgba(204, 204, 204, 0.76);
        }

        .bottomLine1 {
            background-color: white;

        }

        .bottomLine2 {
            padding: 0px 40px;
        }

        .majorDetail {
            display: inline-block;
        }

          /* table css */

        table {
       font-family: "Nanum Gothic", sans-serif;
            width: 100%;
            
        }

        table,
        th,
        td {
            border: none;
            
        }
        
        .jb-th-1{
            width: 120px;
        }

        .jb-th-3{
            width: 70px;
        }
        
        .buttonSpace{
            margin-top: 40px;
        }
        
        button{
        font-family: "Nanum Gothic", sans-serif;
        }
        
    </style>

</head>

<body>
    <header>
        <h1>로고자리</h1>
    </header>

    <div class="container">
        <div class="insideContainer">
            <table border="1">
                <thead>
                    <th class="jb-th-1"></th>
                    <th class="jb-th-2"></th>
                </thead>
                <tbody>
                         <tr>
                       <td>아이디</td>
                        <td colspan="3"> <input type="text" name="ID" ></td>
                    </tr>
                    <tr>
                       <td>비밀번호</td>
                       <td colspan="3">  <input type="text" name="ID" ></td>
                    </tr>
                    <tr>
                        <td>비밀번호 확인</td>
                        <td colspan="3"> <input type="text" name="ID" ></td>
                    </tr>
                    <tr>
                        <td>이메일</td>
                        <td colspan="3"> <input type="text" name="ID" ></td>
                    </tr>
                     <tr>
                        <td>생년월일</td>
                        <td colspan="3"> <input type="text" name="ID" ></td>
                    </tr>
            </table>
                <div class="buttonSpace">
                <a href="./Main.bit"><button type="reset" id="cancleButton">취소</button></a>
                <button type="submit">회원가입</button>
            </div>
        </div>
    </div>

</body>

</html>
