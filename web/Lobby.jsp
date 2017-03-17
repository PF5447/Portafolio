<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : Lobby
    Created on : 30-11-2016, 18:30:38
    Author     : felipe
--%>
<jsp:useBean id="usuario" scope="session" class="Modelo.Usuario" />
<jsp:setProperty name="usuario" property="*" />

<jsp:useBean id="Usuario_get" scope="request" class="Modelo.Usuario" />
${Usuario_get.getNombre()}
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/login.css" rel="stylesheet" type="text/css">
        <title>JSP Page</title>
    </head>
    <body>
        <h4 class="Bienvenida">Bienvenido(a)
            ${usuario.getNombre()} 
            ${usuario.getApellido_paterno()}
            ${usuario.getApellido_materno()}|
        <a   href="./ServletLogOut" onclick="CerrarSesion">Cerrar Sesion</a>
        </h4>
        
        
        <br>
        <hr />
        <h1>Dej Movile :: Menu</h1><br>
        
        <h2>
        <a class="link_cerrar" href="./Solicitud.jsp" onclick="CerrarSesion">Solicitar un Plan</a><br>
        <a class="link_cerrar" href="./ListarSolicitudes.jsp" onclick="CerrarSesion">Ver mis Planes</a>
        </h2>
        
    </body>
</html>
