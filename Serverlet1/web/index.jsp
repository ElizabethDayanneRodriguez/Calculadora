<%-- 
    Document   : index
    Created on : 29/08/2017, 07:57:16 AM
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
    #button 
    {
    background-color: darkmagenta;
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 24px;
    }
    #button:hover
    {
     background-color: darkcyan;   
    }
    
    </style>
    <body>
        <form action="login" method="post">
            <center>
            <font face="Calibri" color="violet" size="10"> Escribe tu Usuario:&nbsp;  </font>
            <br>
           <input type="text" style="width:400px; height:30px;" name="usuario">
           <br><br>
           <font face="Calibri" color="violet" size="10"> Escribe tu contraseña:&nbsp;  </font>
           <br>
           <input type="password" style="width:400px; height:30px;"name="clave">
           <br><br><br>
           <input type="submit" value="Enviar" id="button">
            </center>
        </form>
    </body>
</html>
