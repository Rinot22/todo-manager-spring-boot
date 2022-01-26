<%--
  Created by IntelliJ IDEA.
  User: darya
  Date: 23.01.2022
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>

<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">

    <div class="panel panel-primary">
        <div class="panel-heading">Home Page</div>
        <div class="panel-body">
            Welcome ${name}!! <a href="/list-todos">Click here</a> to manage your
            todo's.
        </div>
    </div>
</div>
<%@ include file="common/footer.jspf"%>