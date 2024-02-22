<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	int num=8;int ans=0;
	while(num!=0){
		ans=ans*num;
		num--;
		
	}
	out.println(ans);
%>

</body>
</html>