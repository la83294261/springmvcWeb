<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="/ext/js/jquery/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="/ext/js/jgrid/jquery.jqGrid.src.js"></script>
    <script type="text/javascript" src="/ext/js/jgrid/i18n/grid.locale-cn.js"></script>
    <link rel="stylesheet" type="text/css" media="screen"
          href="/ext/css/jgrid/css/ui-lightness/jquery-ui-1.8.16.custom.css"/>
    <link rel="stylesheet" type="text/css" media="screen" href="/ext/css/jgrid/ui.jqgrid.css"/>

    <script src="/ext/js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <link href="/ext/css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript">

    </script>

    <title>
        statement
    </title>
</head>
<body>


<div class="jqGrid_wrapper">
    <div class="pull-left">文字浮动到左边</div>
    <table  id="dataTable">
    </table>
        <div id="datapager"></div>
</div>



<script type="text/javascript">
    jQuery(function ($) {

        jQuery("#dataTable").jqGrid({
            url: "/test/jgrid.html",
            datatype: "json",
            mtype: "POST",
            height: "100%",
            styleUI: 'Bootstrap',
            colNames: ['对账截止日期', '银行简称', '银行账号', '银行账单余额', '企收银未收', '创建日期', '备注',],
            colModel: [
                {name: 'pamount', index: 'amount', width: 15, align: "left"},
                {name: 'namount', index: 'amount', width: 15, align: "left"},
                {name: 'rfidType', index: 'rfidType', width: 40, align: "left"},

                {name: 'rfid', index: 'rfid', width: 30, align: "left"},
                {name: 'operator', index: 'operator', width: 20, align: "left"},
                {name: 'dateCreate', index: 'dateCreate', width: 35, align: "left"},

                {name: 'noteInner', index: 'noteInner', width: 150, align: "left"},
            ],

            viewrecords: true,
            rowNum: 10,
            rowList: [10, 20, 50],
            pager: "#datapager",
            multiselect: true,
            caption: "结果",
            autowidth: true

        });


        jQuery("#dataTable").jqGrid('navGrid', "#datapager", {   //navbar options
            edit: false,
            add: false,
            del: false,
        }).jqGrid('navButtonAdd',  "#datapager", {
                    caption: "导出可用余额明细(最大1万条)",
                    buttonicon: "icon-save",
                    onClickButton: excelLoad,
                    position: "last",
                    title: "excel格式数据导出",
                    cursor: "pointer"
                }
        );
    });
    function excelLoad(){
        alert("download!");
    }
</script>
</body>
</html>