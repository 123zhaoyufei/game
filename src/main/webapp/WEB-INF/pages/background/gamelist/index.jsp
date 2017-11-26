<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="/staticfile/background/Css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="/staticfile/background/Css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="/staticfile/background/Css/style.css" />
    <script type="text/javascript" src="/staticfile/background/Js/jquery.js"></script>
    <script type="text/javascript" src="/staticfile/background/Js/jquery.sorted.js"></script>
    <script type="text/javascript" src="/staticfile/background/Js/bootstrap.js"></script>
    <script type="text/javascript" src="/staticfile/background/Js/ckform.js"></script>
    <script type="text/javascript" src="/staticfile/background/Js/common.js"></script>

    <style type="text/css">
        body {
            padding-bottom: 40px;
        }
        .sidebar-nav {
            padding: 9px 0;
        }

        @media (max-width: 980px) {
            /* Enable use of floated navbar text */
            .navbar-text.pull-right {
                float: none;
                padding-left: 5px;
                padding-right: 5px;
            }
        }

        img{
            width:120px;
            height:80px;
        }

    </style>
</head>
<body>
<form class="form-inline definewidth m20" action="index.html" method="get">  
    游戏名称：
    <input type="text" name="rolename" id="rolename"class="abc input-default" placeholder="" value="">&nbsp;&nbsp;  
    <button type="submit" class="btn btn-primary">查询</button>&nbsp;&nbsp;
    <button type="button" class="btn btn-success" id="addnew">新增游戏</button>
</form>
<table class="table table-bordered table-hover definewidth m10" >
    <thead>
    <tr>
        <th>序号</th>
        <th>游戏名称</th>
        <th>游戏图片</th>
        <th>管理操作</th>
    </tr>
    </thead>
    <c:forEach items="${games}" var="g" varStatus="status">
        <tr>
            <td>${status.index+1}</td>
            <td>${g.gName}</td>
            <td>
                <img src="${g.gPic}">
            </td>
            <td>
                <a href="edit.jsp">编辑</a>
            </td>
        </tr>
    </c:forEach>
	     </table>
<div class="inline pull-right page">
         10122 条记录 1/507 页  <a href='#'>下一页</a>     <span class='current'>1</span><a href='#'>2</a><a href='/chinapost/index.php?m=Label&a=index&p=3'>3</a><a href='#'>4</a><a href='#'>5</a>  <a href='#' >下5页</a> <a href='#' >最后一页</a>    </div>
</body>
</html>
<script>
    $(function () {
        
		$('#addnew').click(function(){

				window.location.href="add.jsp";
		 });


    });

	function del(id)
	{
		
		
		if(confirm("确定要删除吗？"))
		{
		
			var url = "index.jsp";
			
			window.location.href=url;		
		
		}
	
	
	
	
	}
</script>