<%@page import="hanbaang.DBConnection"%>

<%@page import="DTO.*"%>
<%@page import="hanbaang.*"%>
<%@page import="Data.*"%>
<%@page import="DAO.*"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.LinkedList"%>


<%@ page language="java" contentType="text/json; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%
	
	LinkedList<DTO_RECEP> dto_R = (LinkedList<DTO_RECEP>)request.getAttribute("result");
%>


{ "object" : [
<%
	Iterator<DTO_RECEP> iterator = dto_R.iterator();
	while (iterator.hasNext()) {
		DTO_RECEP outer = iterator.next();
%>
{"R_id" : "<%=outer.R_ID%>", "PA_id" : "<%=outer.PA_ID%>", "SA_id" : "<%=outer.SA_ID%>", "PATNT_NAME" : "<%=outer.PATNT_NAME%>", "RECEP_DATE" : "<%=outer.RECEP_DATE%>", "STATE" : "<%=outer.STATE%>", "MEMO" : "<%=outer.MEMO%>", "MDOC" : "<%=outer.MDOC%>", "STAFF_NAME" : "<%=outer.STAFF_NAME%>"}<%=iterator.hasNext() ? "," : ""%>
<%
	}
%>
	]
}
