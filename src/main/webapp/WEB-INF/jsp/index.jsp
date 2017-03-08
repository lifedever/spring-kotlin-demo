<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/taglibs.jsp" %>
<layout:template>
    <jsp:attribute name="main">
        <div class="row">
            <div class="col-md-12">
                <div class="page-header">
                    <h1>
                        客户列表
                        <a href="/customer/add" class="btn btn-primary pull-right"> 添加</a>
                    </h1>
                </div>
                <table class="table">
                    <thead>
                    <tr>
                        <th>No</th>
                        <th>FirstName</th>
                        <th>LastName</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${customers}" var="customer" varStatus="i">
                        <tr>
                            <td>${i.index + 1}</td>
                            <td>${customer.firstName}</td>
                            <td>${customer.lastName}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </jsp:attribute>
</layout:template>