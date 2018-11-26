<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/css.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/easyui.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/icon.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui-lang-zh_CN.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>

    <script type="text/javascript" src="${pageContext.request.contextPath}/admin/js/global/js.js"></script>
    <script type="text/javascript">

        $(function () {
            // 分页查询图书
            $("#prodatagrid").datagrid({
                url: "${pageContext.request.contextPath}/selectAll",
                pagination: true,
                title: "图书列表",
                columns: [[
                    {checkbox: true, field: ""},
                    {title: "编号", field: "book_id", width: 100},
                    {title: "书名", field: "book_name", width: 100},
                    {
                        title: "图书封面", field: "product_image", width: 100,
                        formatter: function (value, row, index) {
                            return "<img width='60%' height='60px' src='${pageContext.request.contextPath}/productImages/" + row.product_image + "'/>";
                        }
                    },
                    {title: "原价", field: "book_price", width: 100},
                    {title: "出版社", field: "press", width: 100},
                    {title: "作者", field: "author", width: 100},
                    {title: "页数", field: "page_count", width: 100},
                    {title: "包装", field: "pack", width: 100},
                    {title: "类型", field: "category_name", width: 100}

                ]],
                toolbar: "#myToolbar",
            });
            // 分页查询图书=====END====


            //添加窗口
            $("#addProdia").dialog({
                title: "添加信息",
                width: 600,
                height: 600,
                closed: true,
            });
            //结束的添加窗口
        });

        //批量删除
        function doMultiDelete() {
            //alert(0)
            //1.获取到所有选中的行：通过datagrid的getSelections方法获取到
            var allSelectedRows = $("#prodatagrid").datagrid("getSelections");
            if (allSelectedRows.length == 0) {
                $.messager.alert("提示框", "请选中要删除的数据", "warning");
            } else {
                //确认是否删除
                $.messager.confirm("确认框", "确认真的要删除选中的内容吗？", function (result) {
                    alert(result + "resulttttttttttttttttttttt");
                    if (result) {
                        //alert(0);
                        //执行删除操作
                        //alert("执行删除操作");
                        //1.获取到所有选中的id
                        var ids = new Array(allSelectedRows.length);
                        for (var i = 0; i < allSelectedRows.length; i++) {
                            ids[i] = allSelectedRows[i].book_id;
                        }

                        //2.发送ajax请求到后台，执行删除操作
                        $.ajax({
                            url: "${pageContext.request.contextPath}/deletes",
                            //data:"ids="+ids,
                            data: {"ids": ids},
                            //不让jquery做深度序列化
                            traditional: true,

                            success: function (data) {
                                //alert(data);
                                if (data) {
                                    alert("删除成功");
                                    $("#prodatagrid").datagrid("reload");
                                } else {
                                    alert("删除失败");
                                }
                            }
                        });

                    }

                });
            }

        }

        //批量删除====END====

        //添加按钮
        function add() {
            $("#addProdia").dialog("open");
            $.ajax({
                url: "${pageContext.request.contextPath}/select",
                async: false,
                success: function (data) {
                    var list = data.list;
                    alert(list.length);
                    for (var i = 0; i < list.length; i++) {
                        //alert(ilist[i].o_option+ilist[i].o_id);
                        $("#prosele1").append("<option value='" + list[i].category_id + "'>" + list[i].category_name + "</option>");

                    }

                },
                //dataType:"json"
            });
        }

        //执行添加操作
        function clickAdd() {
            $("#prof1").form("submit", {
                url: "${pageContext.request.contextPath}/add",
                success: function (data) {
                    if (data == "true") {
                        //刷新当前页
                        $("#prodatagrid").datagrid("load");
                    } else {
                        alert("添加失败");
                    }
                }
            });
        }

        //结束的添加操作

    </script>


</head>
<body>

<div style="overflow-y:auto;height:200">
    <table id="prodatagrid"></table>
</div>

<div id="myToolbar">
    <a href="JavaScript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-add'" onclick="add()">添加</a>
    <a href="JavaScript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-remove'"
       onclick="doMultiDelete()">批量删除</a>
</div>
<div id="addProdia" class="easyui-dialog" data-options="closed:true">
    <form id="prof1" style="margin:30px" enctype="multipart/form-data" method="post">
        <table>
            <tr>
                <td>
                    图书名字：<input class="easyui-validatebox" name="book_name"
                                data-options="required:true,missingMessage:'请填写商品名字'"/><br/><br/>
                    <%--图书封面：<input class="easyui-filebox" data-options="required:true,missingMessage:'请选择封面'"/><br/><br/>--%>
                    <%--</td>
                        <td>
                            图书原价：<input class="easyui-validatebox"  type="number" step="0.1" data-options="required:true,missingMessage:'请输入价格'"/> <br/><br/>
                            当当价格：<input class="easyui-validatebox"   type="number" step="0.1" data-options="required:true,missingMessage:'请输入价格'"/><br/><br/>
                        </td></tr>
                    <tr><td>
                        库存：&nbsp;&nbsp;<input class="easyui-validatebox"   data-options="required:true,missingMessage:'请输入库存'"/><br/><br/>
                        作者：&nbsp;&nbsp;<input class="easyui-validatebox" name="author" data-options="required:true,missingManage:'请输入作者名称'"/><br/><br/>
                    </td>
                        <td>
                            出版社：&nbsp;<input class="easyui-validatebox"  name="press" data-options="required:true,missingManage:'请输入出版社名称'"/><br/>
                            &nbsp;销量：&nbsp;&nbsp;<input class="easyui-validatebox"  type="number"  data-options="required:true,missManage:'请输入销量记录'" /><br/><br/>
                        </td></tr>--%>
            <tr>
                <td>
                    <%--顾客评分：<input class="easyui-validatebox"   data-options="required:true,missingManage:'请输入顾客评分'"/><br/><br/>--%>
                    <%--编辑推荐：<input class="easyui-validatebox"   data-options="required:true,missManager:'请输入编辑推荐'"><br/><br/>--%>
                </td>
                <td>
                    类别所属：<select id="prosele1" name="cid"></select><br/><br/>
                    <%--简介内容：<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<textarea rows="5" cols="22" name="messages" ></textarea><br/><br/>--%>
                </td>
            </tr>
        </table>
        <%--<center>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-save" onClick="pro1()">确认</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel">取消</a>
        </center>--%>
        <input type="button" onclick="clickAdd()" value="添加"/>
    </form>
</div>
<div id="updateProdia" class="easyui-dialog" data-options="closed:true">
    <form id="prof2" style="margin:30px" enctype="multipart/form-data" method="post">
        <table>
            <tr>
                <td>
                    <input id="proId" name="book_id" type="hidden"/>
                    图书名字：<input class="easyui-validatebox" id="proName" name="book_name"
                                data-options="required:true,missingMessage:'请填写商品名字'"/><br/><br/>
                    <%--图书封面：<input class="easyui-filebox"  name="uploadFile" data-options="required:true,missingMessage:'请选择封面'"/><br/><br/>--%>
                </td>
                <%--<td>
                    图书原价：<input class="easyui-validatebox" id="proPrice" name="book_price" type="number" step="0.1" data-options="required:true,missingMessage:'请输入价格'"/> <br/><br/>
                    当当价格：<input class="easyui-validatebox" id="dangPrice" name="Dangprice" type="number" step="0.1" data-options="required:true,missingMessage:'请输入价格'"/><br/><br/>
                </td>
            </tr>
            <tr><td colspan="2"><p id="image"></p></td></tr>
            <tr><td>
                库存：&nbsp;&nbsp;<input class="easyui-validatebox" id="inventory" name="inventory" data-options="required:true,missingMessage:'请输入库存'"/><br/><br/>
                作者：&nbsp;&nbsp;<input class="easyui-validatebox" id="author" name="author" data-options="required:true,missingManage:'请输入作者名称'"/><br/><br/>
            </td>
                <td>
                    出版社：&nbsp;<input class="easyui-validatebox" id="press" name="press" data-options="required:true,missingManage:'请输入出版社名称'"/><br/>
                    销量：&nbsp;&nbsp;<input class="easyui-validatebox" id="salenum" type="number" name="salenum" data-options="required:true,missManage:'请输入销量记录'" /><br/><br/>
                </td></tr>
            <tr><td>
                顾客评分：<input class="easyui-validatebox" id="custome_core" name="custome_score" data-options="required:true,missingManage:'请输入顾客评分'"/><br/><br/>
                编辑推荐：<input class="easyui-validatebox" id="recommend" name="recommend" data-options="required:true,missManager:'请输入编辑推荐'"><br/><br/>
            </td><td>--%>
                <td>
                    类别所属：<select id="prosele" name="cid"></select><br/><br/>
                    简介内容：<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<textarea rows="5" cols="22" name="messages"
                                                                      id="messages"></textarea><br/><br/>
                </td>
            </tr>
        </table>
        <center>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-save" onClick="pro();">确认</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onClick="exit();">取消</a>
        </center>
    </form>
</div>
<script type="text/javascript">

</script>
</body>
</html>
