<%@page import="hanbaang.*"%>
<%@page import="DTO.*"%>
<%@page import="Data.*"%>
<%@page import="DAO.*"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.LinkedList"%>
<%@page import="java.text.SimpleDateFormat"%>


<%@ page language="java" contentType="text/json; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>

<%
	String AC_id = request.getParameter("AC_ID");
	String ID = request.getParameter("ID");
	String PW = request.getParameter("PW");
	String HOSPI_NAME = request.getParameter("HOSPI_NAME");
	String ORG_NUM = request.getParameter("ORG_NUM");
	String COMP_NUM = request.getParameter("COMP_NUM");
	String PHONE = request.getParameter("PHONE");
	String MAIL = request.getParameter("MAIL");
	String ADDR = request.getParameter("ADDR");
	String ADDR_DETAIL = request.getParameter("ADDR_DETAIL");
	
	// 날짜 설정
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	String REG = request.getParameter("REG_DATE");
	Date REG_DATE = new Date(sdf.parse(REG).getTime());
	String MOD = request.getParameter("MOD_DATE");
	Date MOD_DATE = new Date(sdf.parse(MOD).getTime());
	
	
	Connection conn = DBConnection.getConnection();
	DAO dao = DAO.getInstance();
	DTO_ACCOUNT dto_ACC = new DTO_ACCOUNT(Integer.parseInt(AC_id), ID, PW, HOSPI_NAME, ORG_NUM, COMP_NUM, PHONE,
			MAIL, ADDR, ADDR_DETAIL, REG_DATE, MOD_DATE);
	boolean result = dao.UPDATE_ACCOUNT_BY_PK(dto_ACC, conn);
%>


{ "object" : [
				 {RESULT : <%=result%>} 
				 ] 
}
<%
	conn.close();
%>
