<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
        <script type="text/javascript" src="/ext/js/jquery/jquery-3.1.1.min.js"></script>

    <link href="/ext/css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="/ext/js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            $(".button").click(function(){
                $("p").hide();
            });
        });
    </script>

    <title>
        szktest
    </title>
</head>
<body>

<button class="btn btn-success" id="kkkk">按钮</button>
<form method="post" action="<c:url value="/user.html"/> ">
    <table>
        <tr>
            <td>
                username:
            </td>
            <td><input type="text" name="userName"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" name="submit"/></td>
        </tr>
    </table>
</form>
<div class="title">充值信息查询</div>
#*隐藏域*#
<div style="display: none">
    <input type="text" name="pageNumber" id="pageNumber" value="$!result.pageNumber"> #*当前页码，当点击下一页的时候，需要+1/点击查询按钮时需要置为1*#
    <input type="text" name="totalPage" id="totalPage" value="$!result.totalPage"> #*总页数*#
</div>

<h2>This is a heading</h2>
<p>This is a paragraph.</p>
<p>This is another paragraph.</p>
<button type="button">Click me</button>
</body>
</html>