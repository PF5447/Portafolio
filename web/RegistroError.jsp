<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : RegistroError
    Created on : 04-12-2016, 15:45:51
    Author     : anibal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="ComboSesion"  class="Controlador.ComunaBusiness" />
<jsp:useBean id="Usuario_Registro" scope="application" class="Controlador.UsuarioBusiness" />
<jsp:setProperty name="Usuario_Registro" property="*" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="JS/md5.js"></script>
    </head>
    <body>
        <h1>DEJ Movile :: Registro</h1>
        <form action="./AgregarUsuarioServlet" method="POST">   
        <fieldset>
            <legend>Regitro</legend>
            <table border="0">
                <tbody>
                    <tr>
                        <td>Rut</td>
                        <td><input type="text" name="txtRut" value="" placeholder="Ingrese RUT" required/></td>
                        <td>Debe ingresar un rut correcto(Ej: 11111111-1)</td>
                    </tr>
                    <tr>
                        <td>Clave</td>
                        <td><input type="password" name="txtClave" onkeyup="this.form.txtClave2.value=md5(this.form.txtClave.value)"
                                   value=""  required/>
                        <input type="hidden" name="txtClave2" size="50"></td>
                    </tr>
                    <tr>
                        <td>Confirmar Clave</td>
                        <td><input type="password" name="txtConfirmar" value="" required/></td>
                        <td>Las claves no coinciden</td>
                    </tr>
                    <tr>
                        <td>Nombre</td>
                        <td><input type="text" name="txtNombre" value="" required/></td>
                    </tr>
                    <tr>
                        <td>Apellido Paterno</td>
                        <td><input type="text" name="txtApellidoPaterno" value="" required/></td>
                    </tr>
                    <tr>
                        <td>Apellido Materno</td>
                        <td><input type="text" name="txtApellidoMaterno" value="" required/></td>
                    </tr>
                    <tr>
                        <td>Direccion</td>
                        <td><input type="text" name="txtDireccion" value="" required/></td>
                    </tr>
                    <tr>
                        <td>Numeracion</td>
                        <td><input type="number" name="txtNumeracion" value="" required/></td>
                    </tr>
                    <tr>
                        <td>Comuna</td>
                        <td><select name="ddlComuna">
                                
                                <c:forEach var="C" items="${ComboSesion.ListarComunas()}">
                                <option>${C.getNombreComuna()}</option>
                                
                                </c:forEach>
                                
                                
                                
                            </select></td>
                    </tr>
                    <tr>
                        <td>Telefono</td>
                        <td><input type="number" name="txtNumeroTelefono" value="" required/></td>
                    </tr>
                    <tr>
                        <td><a href="./Login.jsp" onclick="CerrarSesion">Volver</a></td>
                        <td><input type="submit" value="Enviar"/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>

        </fieldset>
        </form> 
    </body>
</html>
