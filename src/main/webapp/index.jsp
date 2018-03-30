<%-- 
    Document   : index
    Created on : 16-Mar-2018, 09:44:58
    Author     : Miriam Rodriguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp" />
        <h1>Links</h1>
        
        <p><a href="albumList.html">All Albums</a></p>
        <p><a href="artistCount.html">Artist Count</a></p>
        <p><a href="tracksByAlbum.jsp">Find Tracks By Album</a></p>
        <p><a href="addArtist.jsp">Add Artist</a></p>
        <p><a href="removeAlbum.jsp">Remove Album</a></p>
        
        <jsp:include page="footer.jsp" />
</html>
