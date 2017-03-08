<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/taglibs.jsp" %>
<layout:template>
    <jsp:attribute name="main">
        <div class="row">
            <div class="col-md-12">
                <div class="page-header">
                    <h1>
                        客户编辑
                        <a href="/" class="btn btn-primary pull-right"> 返回</a>
                    </h1>
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <form action="/customer/save" method="post">
                            <div class="form-group">
                                <label for="firstName">First Name</label>
                                <input type="text" class="form-control" id="firstName" name="firstName" placeholder="firstName">
                            </div>
                            <div class="form-group">
                                <label for="lastName">Last Name</label>
                                <input type="text" class="form-control" id="lastName" name="lastName" placeholder="lastName">
                            </div>
                            <button type="submit" class="btn btn-default">Submit</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </jsp:attribute>
</layout:template>