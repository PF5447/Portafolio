<%-- 
    Document   : MisPlanesJsp
    Created on : 01-12-2016, 6:31:59
    Author     : felipe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>




<jsp:useBean id="sesion_total" scope="session" class="Modelo.Presolicitud" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Solicitar Plan :: Paso 2</h1>
              
        <form action="./SolicitarPlan">
        <fieldset>
            <legend>Confirmar Plan</legend>
            <table border="0">
                
                <tbody>
                    <tr>
                        <td>${sesion_total.getGigas()}</td>
                    </tr>
                    <tr>
                        <td>${sesion_total.getCuota()}</td>
                    </tr>
                    <tr>
                        <td>Total : ${sesion_total.getTotal()}</td>
                    </tr>
                    <tr>
                        <td>${sesion_total.getEntrga()}</td>
                    </tr>
                    <tr>
                        <td><a href="./Solicitud.jsp" onclick="CerrarSesion">Volver</a></td>
                        <td>   </td>
                        <td> <input type="submit" value="Solicitar Plan" name="btnSolicitar" /></td>
                    </tr>
                </tbody>
            </table>

            
        </fieldset>
                    </form>
        <h4><a href="./Lobby.jsp" onclick="CerrarSesion">Ir al Menu</a></h4>
    </body>
</html>
