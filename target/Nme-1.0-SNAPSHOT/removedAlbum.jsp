<%-- 
    Document   : removedAlbum
    Created on : 16-Mar-2018, 12:25:27
    Author     : Miriam Rodriguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "uk.ac.city.acwf614.nme.domain.Album"%>
<%@page import = "java.util.List"%>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp" />
    <h1>All Albums</h1>

    <table>
        <%
            List<Album> albums = 
                    (List<Album>) request.getAttribute("albums");
            for (Album album : albums){
                out.println("<tr><td>"+album+"</td></tr>");
            }
        %>
        
    </table>

    <jsp:include page="footer.jsp" />
</html>
