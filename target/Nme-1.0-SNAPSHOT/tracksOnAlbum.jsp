<%-- 
    Document   : tracksOnAlbum
    Created on : 16-Mar-2018, 11:02:33
    Author     : Miriam Rodriguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "uk.ac.city.acwf614.nme.domain.Track"%>
<%@page import = "java.util.List"%>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp" />
    <h1>Track on Album <% request.getParameter("albumId");%></h1>

    <table>
        <%
            List<Track> tracks = 
                    (List<Track>) request.getAttribute("tracks");
            for (Track track : tracks){
                out.println("<tr><td>"+track+"</td></tr>");
            }
        %>
        
    </table>

    <jsp:include page="footer.jsp" />
</html>
