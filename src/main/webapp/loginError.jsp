<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="/header.jsp" />
    <h2>Sorry your login details were not recognised. Please try again:</h2>
    <br><br>
    <form action="j_security_check" method=post>
        <p><strong>Please Enter Your User Name: </strong>
            <input type="text" name="j_username" />
        <p><p><strong>Please Enter Your Password: </strong>
            <input type="password" name="j_password" />
        <p><p>
            <input type="submit" value="Submit" />
    </form> 

    <jsp:include page="/footer.jsp" />
</html>
