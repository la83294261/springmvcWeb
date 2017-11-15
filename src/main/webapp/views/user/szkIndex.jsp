<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="/ext/js/jquery/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="/ext/js/jgrid/jquery.jqGrid.src.js"></script>
    <script type="text/javascript" src="/ext/js/jgrid/i18n/grid.locale-cn.js"></script>
    <link href="/ext/css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">

    <link rel="stylesheet" type="text/css" media="screen" href="/ext/css/jgrid/css/ui-lightness/jquery-ui-1.8.16.custom.css" />

    <link rel="stylesheet" type="text/css" media="screen" href="/ext/css/jgrid/ui.jqgrid.css" />

    <script src="/ext/js/bootstrap/3.3.6/bootstrap.min.js"></script>


    <script type="text/javascript">
        $(function(){
            //页面加载完成之后执行
            pageInit();
        });
        function pageInit(){
            //创建jqGrid组件
            jQuery("#list2").jqGrid(
                    {
                        url : '/test/jgrid.html',//组件创建完成之后请求数据的url
                        datatype : "json",//请求数据返回的类型。可选json,xml,txt
                        colNames : [ 'Inv No', 'Date', 'Client', 'Amount', 'Tax','Total', 'Notes' ],//jqGrid的列显示名字
                        colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
                            {name : 'invno',index : 'id',width : 55},
                            {name : 'date',index : 'invdate',width : 90},
                            {name : 'client',index : 'name asc, invdate',width : 100},
                            {name : 'amount',index : 'amount',width : 80,align : "right"},
                            {name : 'tax',index : 'tax',width : 80,align : "right"},
                            {name : 'total',index : 'total',width : 80,align : "right"},
                            {name : 'notes',index : 'note',width : 150,sortable : false}
                        ],
                        rowNum : 10,//一页显示多少条
                        rowList : [ 10, 20, 30 ],//可供用户选择一页显示多少条
                        pager : '#pager2',//表格页脚的占位符(一般是div)的id
                        sortname : 'id',//初始化的时候排序的字段
                        sortorder : "desc",//排序方式,可选desc,asc
                        mtype : "post",//向后台请求数据的ajax的类型。可选post,get
                        viewrecords : true,
                        caption : "JSON Example"//表格的标题名字
                    });
            /*创建jqGrid的操作按钮容器*/
            /*可以控制界面上增删改查的按钮是否显示*/
            jQuery("#list2").jqGrid('navGrid', '#pager2', {edit : false,add : false,del : false});
        }
    </script>

    <title>
        szkindex
    </title>
</head>
<body>
<tr><td>输入<input type="text" class="input-medium" id="myinput" placeholder="" /></td></tr>
<table id="list2"></table>
<div id="pager2"></div>
<br>
</body>
</html>