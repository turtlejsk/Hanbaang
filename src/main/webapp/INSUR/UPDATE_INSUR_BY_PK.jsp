<%@page import="hanbaang.*"%>
<%@page import="DTO.*"%>
<%@page import="Data.*"%>
<%@page import="DAO.*"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.LinkedList"%>


<%@ page language="java" contentType="text/json; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>

<%
	Connection conn = DBConnection.getConnection();
	DAO dao = DAO.getInstance();
	DTO_INSUR dto_IN = new DTO_INSUR();
	boolean result = dao.UPDATE_INSUR_BY_PK(dto_IN, conn);
%>


{ "object" : [

{}

	]
}
<%
	conn.close();
%>