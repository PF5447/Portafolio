
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="CSS/login_principal.css" rel="stylesheet" type="text/css">
         <script type="text/javascript" src="JS/md5.js"></script>
        <title>DEJ Movile</title>
    </head>
    <body>
        <h1>DEJ Movile</h1>
        <form  class="tabla_login" action="./LoginServlet" method="POST">
            
            <fieldset style="width:30%" class="field" >
                <legend>Registro</legend>
            <table title="Registro" >
            <tbody>
                <tr>
                    <td colspan="2">Rut</td>
                    <td><input type="text" name="rut" value="" /></td>
                </tr>
                <tr>
                    <td colspan="2">Password</td>
                    <td><input type="password" name="pass" onkeyup="this.form.pass2.value=md5(this.form.pass.value)"
                               value=""/>
                    <input type="hidden" name="pass2" size="50"></td>
                </tr>
                <tr>
                    <td colspan="1"></td>
                    <td><input type="submit" value="Aceptar" name="btnAceptar" /></td>
                    <td>Usuario o clave incorrectas</td>
                </tr>
               
                <tr>
                    <td colspan="2"></td>
                    <td><a href="./Cargar" onclick="CerrarSesion">Registrarse</a></td>
                </tr>
            </tbody>
        </table>
           </fieldset> 
            </form>
        
    </body>
</html>
