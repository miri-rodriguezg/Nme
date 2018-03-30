<%-- 
    Document   : tracksByAlbum
    Created on : 16-Mar-2018, 10:53:58
    Author     : Miriam Rodriguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp" />
    <h1>Find Tracks On Album</h1>
    
    <form action="tracksByAlbum.html" method="GET">
        <label>Enter an album ID: <input type="text" name="albumId"> </label>
        <br />
        <input type="submit" value="Find Tracks" />
        
    </form>

    <jsp:include page="footer.jsp" />
</html>
