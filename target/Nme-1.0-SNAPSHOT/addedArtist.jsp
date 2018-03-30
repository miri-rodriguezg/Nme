<%-- 
    Document   : addedArtist
    Created on : 16-Mar-2018, 11:50:00
    Author     : Miriam Rodriguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "uk.ac.city.acwf614.nme.domain.Artist"%>
<%@page import = "java.util.List"%>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp" />
    <h1>All Albums</h1>

    <table>
        <%
            List<Artist> artists = 
                    (List<Artist>) request.getAttribute("artists");
            for (Artist artist : artists){
                out.println("<tr><td>"+artist+"</td></tr>");
            }
        %>
        
    </table>

    <jsp:include page="footer.jsp" />
</html>
