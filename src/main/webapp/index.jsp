<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="rest/hello/info" method="POST">
            <p>
                First Name: <input type="text" name="fname"/>
            </p>
            <p>
                Last Name: <input type="text" name="lname"/>
            </p>
            <input type="submit" value="Submit" />
        </form>
    </body>
</html>