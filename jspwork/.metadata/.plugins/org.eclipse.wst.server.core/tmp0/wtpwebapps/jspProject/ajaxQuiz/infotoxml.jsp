<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="mysql.db.DbConnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<data>
<%
	DbConnect db=new DbConnect();
	Connection conn=db.getConnection();
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	String sql="select * from info order by num";
	
	try{
		pstmt=conn.prepareStatement(sql);
		rs=pstmt.executeQuery();
		
		while(rs.next()){
		
			String num=rs.getString("num");
			String name=rs.getString("name");
			String hp=rs.getString("hp");
			String age=rs.getString("age");
			String photo=rs.getString("photo");
			%>
			
			<info num="<%=num %>">
				<name><%=name %></name>
				<hp><%=hp %></hp>
				<age><%=age %></age>
				<photo><%=photo %></photo>
			</info>
	<%}		
		
	}catch(SQLException e){
		
	}finally{
		db.dbClose(rs, pstmt, conn);
	}
%>
<<<<<<< HEAD
<<<<<<< HEAD
</data>
=======
</data>
>>>>>>> 5d1692f77e6cf40a0a83f743137a408426ce9f3f
=======
</data>
>>>>>>> 2f32182e4b4bad3d0217dd61f4b340ef556cf143