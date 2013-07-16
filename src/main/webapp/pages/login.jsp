<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01
Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html:html>
<body>
	<center>
		<h1>Formulario de autenticación</h1>		
		<html:form action="/validar" method="POST">
			<table>
				<tr>
					<td>Usuario:</td>
					<td><html:text property="usuario" /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><html:password property="password" /></td>
				</tr>
				<tr>
					<td colspan="2"><br /> <html:submit property="submit"
							value="Validar" /> &nbsp;&nbsp; <html:reset value="Limpiar" /></td>
				</tr>
			</table>
		</html:form>
		<br />		
	</center>
</body>
</html:html>