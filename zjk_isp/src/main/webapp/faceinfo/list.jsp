<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
 <%@ include file="../user/nav.jsp" %>
 <title>套餐信息列表</title>
  <table width="100%" class="layui-table" lay-even="" lay-skin="row">
         <tr>
             <th>序号</th>
             <th>申请人</th>
             <th>套餐名称</th>
             <th>几年</th>
             <th>价格</th>
             <th>状态</th>
             <th>开始时间</th>
             <th>有效时间</th>
             <th>操作</th>
         </tr>
<c:forEach items="${data.rows }" var="d" varStatus="s">
<tr class="table_tr">
	<td>${s.index+1 }</td>
	<td>${d.user }</td>
	<td>${d.tao }</td>
	<td>${d.years }</td>
	<td>${d.money }</td>
	<c:if test="${d.status==null }"><td>未审核</td></c:if>
	<c:if test="${d.status==0 }"><td>已失效</td></c:if>
	<c:if test="${d.status==1 }"><td>正常</td></c:if>
	<td>${d.start }</td>
	<td>${d.last }</td>
	<td>
		<a href="faceinfo/show.jmy?id=${d.id }" class="layui-btn layui-btn-mini">查看</a>
	</td>
        	</tr>
</c:forEach>
     </table>
     <div id="pagedata"></div>
     <input type="hidden" value="${data.count }" id="datacount">
     <input type="hidden" value="${param.page }" id="page">
     <script>
layui.use(['laypage', 'layer'], function(){
  var laypage = layui.laypage
  ,layer = layui.layer;
  
  laypage({
    cont: 'pagedata'
    ,pages: document.getElementById("datacount").value //总页数
    ,groups: 5 //连续显示分页数
    ,skin: '#1E9FFF'
    ,curr: function(){ //通过url获取当前页，也可以同上（pages）方式获取
	    var page = location.search.match(/page=(\d+)/);
	    return page ? page[1] : 1;
	 }() 
    ,jump: function(obj, first){
      if(!first){
        layer.msg('第 '+ obj.curr +' 页');
        location.href="faceinfo/list.jmy?page=" +obj.curr;
      }
    }
    ,skip: true
  });
  
});
</script>
  <%@ include file="../common/tail.jsp" %>