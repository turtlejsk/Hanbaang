<%@page import="hanbaang.DBConnection"%>

<%@page import="DTO.*"%>
<%@page import="hanbaang.*"%>
<%@page import="Data.*"%>
<%@page import="DAO.*"%>
<%@page import="org.json.simple.*"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.LinkedList"%>


<%@ page language="java" contentType="text/json; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%
	Connection conn = DBConnection.getConnection();
	DAO dao = DAO.getInstance();
	LinkedList<DTO_SUB_ACCOUNT> dto_SA = dao.SELECT_SUB_ACCOUNT(conn);
%>


{ "object" : [
<%
	Iterator<DTO_SUB_ACCOUNT> iterator = dto_SA.iterator();
	while (iterator.hasNext()) {
		DTO_SUB_ACCOUNT outer = iterator.next();
%>
{"SA_id" : "<%=outer.SA_id%>","AC_id" : "<%=outer.AC_id%>", "ID" : "<%=outer.ID%>", "PW" : "<%=outer.PW%>", "STAFF_NAME" : "<%=outer.STAFF_NAME%>", "ORG_NUM" : "<%=outer.ORG_NUM%>", "COMP_NUM" : "<%=outer.COMP_NUM%>",  "ADDR" : "<%=outer.ADDR%>"C
<%
	}
%>
	]
}
<%
	conn.close();
%>