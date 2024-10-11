<%-- 
    Document   : index
    Created on : Oct 11, 2024, 9:33:10 AM
    Author     : ADM
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:useBean id="fDAO" class="com.dal.FileDao" scope="session"></jsp:useBean>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body class="bg-light">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="card">
                        <div class=" card-body">
                            <p class="text-center fs-3">Image Upload </p>
                            <form method="post" action="UploadFile" enctype="multipart/form-data">
                                <div class="mb-3">
                                    <label>Image</label> <input type="file" name="files" class="form-control">
                                </div>
                                <div class="mb-3">
                                    <label>Remark</label> <input type="Text" name="remark" class="form-control">
                                </div>
                                <div class="text-center">
                                    <button class="btn btn-primary">Upload</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            
            <table class="table mt-4">
                <thead>
                    <tr>
                        <th scope="col">Image</th>
                        <th scope="col">Action</th>
                        <th scope="col">Remark</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach var="image" items="${fDAO.getAll()}">
                    <tr>
                        <th scope="row"><img style="width: 300px;" alt="" src="imgs/${image.name}"></th>
                        <td>
                            <a href="DownloadFile?fileName=${image.name}" class="btn btn-sm btn-primary">Download</a>
                        </td>
                        <td>${image.remark}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
        
        
        
        
        
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    </body>
</html>
