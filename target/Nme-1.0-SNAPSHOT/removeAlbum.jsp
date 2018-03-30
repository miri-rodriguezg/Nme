<%-- 
    Document   : removeAlbum
    Created on : 16-Mar-2018, 12:04:07
    Author     : Miriam Rodriguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp" />
    <h1>Remove an Album</h1>
    
    <form action="removeAlbum.html" method="GET">
        <label>Enter an album ID: <input type="text" name="albumId"> </label>
        <br />
        <input type="submit" value="Show Albums" />
        
    </form>

    <jsp:include page="footer.jsp" />
</html>
