<%-- 
    Document   : addArtist
    Created on : 16-Mar-2018, 11:35:35
    Author     : Miriam Rodriguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp" />
    <h1>Add a new artist</h1>
    
    <form action="addArtist.html" method="POST">
        <label>Artist ID: <input type="text" name="artistId"> </label>
        <br />
        <label>Name: <input type="text" name="artistName"> </label>
        <br />
        <label>Genre: <input type="text" name="genre"> </label>
        <br />
        <label>Sales : <input type="text" name="sales"> </label>
        <br />
        
        <input type="submit" value="Add Artist" />
        
    </form>

    <jsp:include page="footer.jsp" />
</html>
