<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<html>
<head>
</head>
<body>
	<h1>Listado de Pruebas</h1>

	<table border="1">
		<tr>
			<td>Nombre</td>			
		</tr>

		<logic:iterate id="prueba" name="dynaCustomerListForm"
			property="pruebaList">
			<tr>
				<td><bean:write name="prueba" property="nombre" /></td>				
			</tr>
		</logic:iterate>
	</table>
</body>
</html>