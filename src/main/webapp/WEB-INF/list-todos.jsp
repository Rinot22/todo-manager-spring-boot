<%--
  Created by IntelliJ IDEA.
  User: darya
  Date: 23.01.2022
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
    <div>
        <a type="button" class="btn btn-primary btn-md" href="/add-todo">Add Todo</a>
    </div>
    <br>
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h3>List of TODO's</h3>
        </div>
        <div class="panel-body">
            <table class="table table-striped">
                <thead>
                <tr>
                    <th width="40%">Description</th>
                    <th width="40%">Target Date</th>
                    <th width="20%"></th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${todos}" var="todo">
                    <tr>
                        <td>${todo.description}</td>
                        <td><fmt:formatDate value="${todo.targetDate}"
                                            pattern="dd/MM/yyyy" /></td>
                        <td><a type="button" class="btn btn-success"
                               href="/update-todo?id=${todo.Id}">Update</a>
                            <a type="button" class="btn btn-warning"
                               href="/delete-todo?id=${todo.Id}">Delete</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

</div>
<%@ include file="common/footer.jspf"%>
