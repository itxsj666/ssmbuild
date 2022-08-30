<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ct
  Date: 2022/3/24
  Time: 9:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示</title>
    <style type="text/css">
        table {
            border-collapse: collapse;
            margin: 0 auto;
            text-align: center;
        }

        table td, table th {
            border: 1px solid #cad9ea;
            color: #666;
            height: 30px;
        }

        table thead th {
            background-color: #CCE8EB;
            width: 100px;
        }

        table tr:nth-child(odd) {
            background: #fff;
        }

        table tr:nth-child(even) {
            background: #F5FAFA;
        }
        /*搜索框1*/
        .bar1 {background: #A3D0C3;}
        .bar1 input {
            border: 2px solid #7BA7AB;
            border-radius: 5px;
            background: #F9F0DA;
            color: #9E9C9C;
        }
        .bar1 button {
            top: 0;
            right: 0;
            background: #7BA7AB;
            border-radius: 0 5px 5px 0;
        }
        .bar1 button:before {
            content: "\f002";
            font-family: FontAwesome;
            font-size: 16px;
            color: #F9F0DA;
        }
    </style>
</head>
<body>
<table width="90%" class="table">
    <caption>
        <h2>书籍展示</h2>
    </caption>
    <caption>
        <div style="text-align: left;"><a href="/bookins">添加</a></div>
        <div class="search bar1">
            <form action="${pageContext.request.contextPath}/bookList" method="post">
                <input type="text" name="bookName" placeholder="请输入您要搜索的名称...">
                <button type="submit"></button>
            </form>
        </div>
    </caption>
    <thead>
    <tr>
        <th>书籍id</th>
        <th>书籍名称</th>
        <th>书籍数量</th>
        <th>书籍描述</th>
        <th>操作</th>
    </tr>
    </thead>
    <c:forEach var="book" items="${booksList}">
        <tr>
            <td>${book.bookID}</td>
            <td>${book.bookName}</td>
            <td>${book.bookcounts}</td>
            <td>${book.detail}</td>
            <td><a href="/bookupd?id=${book.bookID}">修改</a>&nbsp;|&nbsp;<a href="/bookdel?id=${book.bookID}">删除</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
