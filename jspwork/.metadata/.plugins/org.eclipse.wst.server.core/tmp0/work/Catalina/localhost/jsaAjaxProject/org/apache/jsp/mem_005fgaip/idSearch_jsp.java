/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-03-19 00:05:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.mem_005fgaip;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mem_gaip.model.MemgaipDao;

public final class idSearch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(1);
    _jspx_imports_classes.add("mem_gaip.model.MemgaipDao");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Dongle&family=Gaegu&family=Nanum+Myeongjo&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.7.0.js\"></script>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	function saveId(id){\r\n");
      out.write("		//alert(id);\r\n");
      out.write("		//부모창:opener\r\n");
      out.write("		opener.mfrm.m_id.value=id;\r\n");
      out.write("		\r\n");
      out.write("		window.close(); //현재창닫기\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

	String key=request.getParameter("key"); //처음호출시 null값
	if(key==null){
		//null값일때는 form을 나타내고
		
      out.write("\r\n");
      out.write("		<div style=\"margin: 10px 30px;\">\r\n");
      out.write("			<form action=\"idSearch.jsp\" method=\"post\">\r\n");
      out.write("				<b>아이디를 입력해주세요</b><br>\r\n");
      out.write("				<div class=\"d-inline-flex\">\r\n");
      out.write("				<input type=\"text\" name=\"m_id\" class=\"form-control\" style=\"width: 130px;\" required=\"required\" placeholder=\"아이디 입력\">\r\n");
      out.write("				<input type=\"hidden\" name=\"key\" value=\"yes\">\r\n");
      out.write("				<button type=\"submit\" class=\"btn btn-success\" style=\"margin-left: 10px;\">중복체크</button>\r\n");
      out.write("				</div>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("	");
}else{
		
		//액션처리
		String m_id=request.getParameter("m_id");
		//dao선언후 아이디가 db에 존재하는지 확인
		MemgaipDao dao=new MemgaipDao();
		boolean b=dao.isIdCheck(m_id);
		
		if(b){
			//존재하는경우
			
      out.write("\r\n");
      out.write("			<div style=\"margin: 50px 50px;\">\r\n");
      out.write("				<h5>");
      out.print(m_id );
      out.write("는 이미 가입된 아이디에유</h5>\r\n");
      out.write("				<img src=\"../image/jquery_img/image_01.png\" width=\"60\" align=\"left\">\r\n");
      out.write("				<button type=\"button\" class=\"btn btn-danger\" onclick=\"location.href='idSearch.jsp'\">다시입력</button>\r\n");
      out.write("			</div>\r\n");
      out.write("		");
}else{
			//존재하지 않는경우
			
      out.write("\r\n");
      out.write("			<div style=\"margin: 50px 50px;\">\r\n");
      out.write("				<h5>");
      out.print(m_id );
      out.write("사용가능한 아이디에유</h5>\r\n");
      out.write("				<img src=\"../image/jquery_img/03.png\" width=\"60\" align=\"left\">\r\n");
      out.write("				<button type=\"button\" class=\"btn btn-info\" onclick=\"saveId('");
      out.print(m_id);
      out.write("')\">적용하기</button>\r\n");
      out.write("				<button type=\"button\" class=\"btn btn-danger\" onclick=\"location.href='idSearch.jsp'\">다시입력</button>\r\n");
      out.write("			</div>\r\n");
      out.write("		");
}
	}

      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
