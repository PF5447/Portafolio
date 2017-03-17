<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : ListarSolicitudes
    Created on : 02-12-2016, 4:38:36
    Author     : felipe
--%>

<jsp:useBean id="usuario" scope="session" class="Modelo.Usuario" />
<jsp:setProperty name="usuario" property="*" />
<jsp:useBean id="sesion_solicitud" scope="session" class="Controlador.SolicitudBusiness" />
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
        <h1>Mis Planes</h1><br>
        
        <table border="1">
            <thead>
                <tr>
                    <th>Codigo</th>
                    <th>Gigas</th>
                    <th>Minutos</th>
                    <th>Entrega de Chip</th>
                    <th>Telefono</th>
                    <th>Comuna</th>
                    <th>Ingreso</th>
                    <th>Total</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="auxiliar" items="${sesion_solicitud.listarSolicitudes(usuario.getTelefono())}">
            
                <tr>
                    <td>${auxiliar.getCodigo()}</td>
                    <td>${auxiliar.getGigas()}</td>
                    <td>${auxiliar.getMinutos()}</td>
                    <td>${auxiliar.getDireccion_entrega()}</td>
                    <td>${auxiliar.getTelefono()}</td>
                    <td>${auxiliar.getComuna()}</td>
                    <td>${auxiliar.getIngreso()}</td>
                    <td>${auxiliar.getTotal()}</td>
                </tr>
                
                </c:forEach>
                

            </tbody>
        </table>

        
<a class="link_cerrar" href="./Lobby.jsp" onclick="CerrarSesion">Volver</a>
        
    </body>
</html>