<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : Solicitud
    Created on : 01-12-2016, 5:36:14
    Author     : felipe
--%>
<jsp:useBean id="sesion_navegacion" scope="session" class="Controlador.Plan_navegacionBusiness" />
<jsp:useBean id="sesion_llamadas" scope="session" class="Controlador.Plan_llamadosBusiness" />
<jsp:useBean id="sesion_total" scope="session" class="Modelo.Presolicitud" />



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arma tu Plan :: Paso 1</h1>
        <form action="./CalculosServlet">
        <fieldset>
            <legend>Plan</legend>
            
            <table border="0">
                
                <tbody>
                      <tr>
                        <td>Cuota</td>
                        <td><select name="ddlLista" required="true" >
                                
                                <c:forEach var="auxiliar" items="${sesion_navegacion.listarNavegaciones()}">
                                <option>${auxiliar.getDescripcion()}</option> 
                                </c:forEach>
                           
                            </select></td>
                    </tr>
                    
                    <tr>
                        <td>Minutos</td>
                        <td></td>
                    </tr>
                    <c:forEach var="auxiliar" items="${sesion_llamadas.listarLLamados()}">
                    
                        <tr>
                            <td> </td>
                            <td><input required="true" type="radio" name="radios" value="${auxiliar.getDescripcion()}"/>${auxiliar.getDescripcion()} </td>
                        </tr>
                        
                    </c:forEach>
                    
                    <tr>
                        <td></td>
                        <td><input type="checkbox" name="chkEntrega" value="A Domicilio" />Entrega del Chip en el Domicilio</td>
                    </tr>
                    <tr>
                        <td><a href="./Lobby.jsp" onclick="CerrarSesion">Volver</a></td>
                        <td>   </td>
                        <td><input type="submit" value="Paso 2" name="paso" /></td>
                    </tr>
                    
                  
                </tbody>
            </table>

            
        </fieldset>
       </form> 
        
    </body>
</html>
