<%-- 
    Document   : artistCount
    Created on : 16-Mar-2018, 10:26:04
    Author     : Miriam Rodriguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp" />
        <h1>Artist Count</h1>
        
        <p>Nme offers 
            <%
                int artistCount = (Integer) request.getAttribute("artistCount");
                out.print(artistCount + " ");
            
            %>
            artists.
        </p>
        
        <jsp:include page="footer.jsp" />
</html>
