<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! 

public void jspInit() {
	
	String defaultUser = getServletConfig().getInitParameter("defaultUser");
	ServletContext context = getServletContext();
	context.setAttribute("defaultUser", defaultUser);
	
	
}
%>
The default userName :<%=getServletConfig().getInitParameter("defaultUser")%>
<br>

The value in the servlet context is : <%=getServletContext().getAttribute("defaultUser")%>

</body>
</html>