/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-03-18 11:11:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.simpleboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import simpleboard.model.SimpleBoardDto;
import simpleboard.model.SimpleBoardDao;

public final class contentView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(3);
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("simpleboard.model.SimpleBoardDto");
    _jspx_imports_classes.add("simpleboard.model.SimpleBoardDao");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Dongle&family=Gaegu&family=Nanum+Myeongjo&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.7.0.js\"></script>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	body *{\r\n");
      out.write("		font-family: 'gaegu';\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	span.day{\r\n");
      out.write("		color: #ccc;\r\n");
      out.write("		font-size: 0.8em;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	span.aday{\r\n");
      out.write("		float: right;\r\n");
      out.write("		font-size: 0.8em;\r\n");
      out.write("		color: #bbb;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	div.alist{\r\n");
      out.write("		margin-left: 20px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	i.amod{\r\n");
      out.write("    	margin-left: 20px;\r\n");
      out.write("    	color: green;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    i.adel{\r\n");
      out.write("    	color: red;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  $(function(){\r\n");
      out.write("	  \r\n");
      out.write("	  list();\r\n");
      out.write("	  \r\n");
      out.write("	  //ajax insert\r\n");
      out.write("	  var num=$(\"#num\").val();\r\n");
      out.write("	  //alert(num);\r\n");
      out.write("	  \r\n");
      out.write("	  $(\"#btnasend\").click(function(){\r\n");
      out.write("		  \r\n");
      out.write("		  var nickname=$(\"#nickname\").val().trim();\r\n");
      out.write("		  var content=$(\"#content\").val().trim();\r\n");
      out.write("		  \r\n");
      out.write("		   if(nickname=='')\r\n");
      out.write("			{\r\n");
      out.write("			   alert(\"닉네임을 입력후 저장해주세요\");\r\n");
      out.write("			   return;\r\n");
      out.write("			}\r\n");
      out.write("		   if(content=='')\r\n");
      out.write("			{\r\n");
      out.write("			   alert(\"댓글내용을 입력후 저장해주세요\");\r\n");
      out.write("			   return;\r\n");
      out.write("			}\r\n");
      out.write("		  \r\n");
      out.write("		  $.ajax({\r\n");
      out.write("			  \r\n");
      out.write("			  type:\"get\",\r\n");
      out.write("			  url:\"../simpleboardanswer/insertAnswer.jsp\",\r\n");
      out.write("			  dataType:\"html\",\r\n");
      out.write("			  data:{\"num\":num,\"nickname\":nickname,\"content\":content},\r\n");
      out.write("			  success:function(){\r\n");
      out.write("				 //기존입력값 지우기\r\n");
      out.write("				 $(\"#nickname\").val('');\r\n");
      out.write("				 $(\"#content\").val('');\r\n");
      out.write("				 \r\n");
      out.write("				 list();\r\n");
      out.write("			  }\r\n");
      out.write("		  });\r\n");
      out.write("	  });\r\n");
      out.write("	  \r\n");
      out.write("	  //리스트의 삭제버튼클릭시 삭제\r\n");
      out.write("	  $(document).on(\"click\",\".adel\",function(){\r\n");
      out.write("		 \r\n");
      out.write("		  var idx=$(this).attr(\"idx\");\r\n");
      out.write("		  //alert(idx);\r\n");
      out.write("		  var ans=confirm(\"댓글을 삭제할거에유?\");\r\n");
      out.write("		  \r\n");
      out.write("		  if(ans){\r\n");
      out.write("			  $.ajax({\r\n");
      out.write("				type:\"get\",\r\n");
      out.write("				url:\"../simpleboardanswer/deleteAnswer.jsp\",\r\n");
      out.write("				dataType:\"html\",\r\n");
      out.write("				data:{\"idx\":idx},\r\n");
      out.write("				success:function(){\r\n");
      out.write("					alert(\"삭재했어유\");\r\n");
      out.write("					list();\r\n");
      out.write("				}\r\n");
      out.write("			  })\r\n");
      out.write("		  }\r\n");
      out.write("	  });\r\n");
      out.write("	  \r\n");
      out.write("	  //수정\r\n");
      out.write("	  $(\"#btnaUsend\").click(function(){\r\n");
      out.write("		 \r\n");
      out.write("		  var idx=$(\"#idx\").val();\r\n");
      out.write("		  var nick=$(\"#unickname\").val();\r\n");
      out.write("		  var content=$(\"#ucontent\").val();\r\n");
      out.write("		  \r\n");
      out.write("		  //alert(idx+\",\"+nick+\",\"+content);\r\n");
      out.write("		  \r\n");
      out.write("		  $.ajax({\r\n");
      out.write("			\r\n");
      out.write("			  type:\"get\",\r\n");
      out.write("			  url:\"../simpleboardanswer/updateAnswer.jsp\",\r\n");
      out.write("			  dataType:\"html\",\r\n");
      out.write("			  data:{\"idx\":idx,\"nickname\":nick,\"content\":content},\r\n");
      out.write("			  success:function(){\r\n");
      out.write("				  list();\r\n");
      out.write("				  $(\"div.aupdateform\").hide();\r\n");
      out.write("				  $(\"div.aform\").show();\r\n");
      out.write("			  }\r\n");
      out.write("		  })\r\n");
      out.write("	  });\r\n");
      out.write("  });\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  function list()\r\n");
      out.write("  {\r\n");
      out.write("	  console.log(\"list num=\"+$(\"#num\").val());\r\n");
      out.write("	  \r\n");
      out.write("	  $.ajax({\r\n");
      out.write("		  \r\n");
      out.write("		  type:\"get\",\r\n");
      out.write("		  url:\"../simpleboardanswer/listAnswer.jsp\",\r\n");
      out.write("		  dataType:\"json\",\r\n");
      out.write("		  data:{\"num\":$(\"#num\").val()},\r\n");
      out.write("		  success:function(res){\r\n");
      out.write("			 \r\n");
      out.write("			  //댓글갯수출력\r\n");
      out.write("			  $(\"b.acount>span\").text(res.length);\r\n");
      out.write("			  \r\n");
      out.write("			  var s=\"\";\r\n");
      out.write("			  $.each(res,function(idx,item){\r\n");
      out.write("				  \r\n");
      out.write("				  s+=\"<div>\"+item.nick+\":  \"+item.content;\r\n");
      out.write("				  s+=\"<span class='aday'>\"+item.writeday+\"</span>\";\r\n");
      out.write("				  s+=\"<i class='bi bi-pencil-square amod' idx=\"+item.idx+\"></i>\";\r\n");
      out.write("				  s+=\"<i class='bi bi-trash adel' idx=\"+item.idx+\"></i>\";\r\n");
      out.write("			  });\r\n");
      out.write("			  $(\"div.alist\").html(s);\r\n");
      out.write("		  }\r\n");
      out.write("	  });\r\n");
      out.write("	  \r\n");
      out.write("	  //댓글 글자 누르면 댓글창 나오게\r\n");
      out.write("	  $(\"b.acount\").click(function(){\r\n");
      out.write("		 \r\n");
      out.write("		  $(\"div.aupdateform\").hide();\r\n");
      out.write("		  $(\"div.aform\").toggle();\r\n");
      out.write("	  });\r\n");
      out.write("	  \r\n");
      out.write("	  //수정창 안보이게\r\n");
      out.write("	  $(\"div.aupdateform\").hide();\r\n");
      out.write("	  \r\n");
      out.write("	  //댓글리스트의 수정아이콘 누르면 수정댓글창에 해당 idx의 내용 띄우기\r\n");
      out.write("	  $(document).on(\"click\",\".amod\",function(){\r\n");
      out.write("		 \r\n");
      out.write("		  $(\"div.aform\").hide();\r\n");
      out.write("		  $(\"div.aupdateform\").show();\r\n");
      out.write("		  \r\n");
      out.write("		  var idx=$(this).attr(\"idx\");\r\n");
      out.write("		  //alert(idx);\r\n");
      out.write("		  $(\"#idx\").val(idx);\r\n");
      out.write("		  \r\n");
      out.write("		  $.ajax({\r\n");
      out.write("			\r\n");
      out.write("			  type:\"get\",\r\n");
      out.write("			  dataType:\"json\",\r\n");
      out.write("			  url:\"../simpleboardanswer/oneDataAnswer.jsp\",\r\n");
      out.write("			  data:{\"idx\":idx},\r\n");
      out.write("			  success:function(res){\r\n");
      out.write("				  \r\n");
      out.write("				  $(\"#idx\").val(res.idx);\r\n");
      out.write("				  $(\"#unickname\").val(res.nick);\r\n");
      out.write("				  $(\"#ucontent\").val(res.content);\r\n");
      out.write("			  }\r\n");
      out.write("		  })\r\n");
      out.write("	  });\r\n");
      out.write("	  \r\n");
      out.write("  }\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");

	String num=request.getParameter("num");
	SimpleBoardDao dao=new SimpleBoardDao();
	//dto
	SimpleBoardDto dto=dao.getContent(num);
	//조회수 1증가
	dao.updateReadCount(num);
	//날짜
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");

      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<input type=\"hidden\" id=\"num\" value=\"");
      out.print(num);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("<div style=\" margin: 50px 100px; width: 500px;\">\r\n");
      out.write("	<table class=\"table table-bordered\">\r\n");
      out.write("		<caption align=\"top\"><b style=\"font-size: 20pt;\">");
      out.print(dto.getSubject() );
      out.write("</b></caption>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td>\r\n");
      out.write("				<b>작성자: ");
      out.print(dto.getWriter() );
      out.write("</b>\r\n");
      out.write("				<span class=\"day\">");
      out.print(sdf.format(dto.getWriteday()) );
      out.write("</span>\r\n");
      out.write("				&nbsp;&nbsp;&nbsp;&nbsp;조회: ");
      out.print(dto.getReadcount() );
      out.write("\r\n");
      out.write("			</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr height=\"200\">\r\n");
      out.write("			<td>\r\n");
      out.write("				");
      out.print(dto.getContent().replace("\n", "<br>") );
      out.write("\r\n");
      out.write("			</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		\r\n");
      out.write("		<!-- 댓글 -->\r\n");
      out.write("		<tr>\r\n");
      out.write("		<td>\r\n");
      out.write("		<b class=\"acount\">댓글<span>0</span></b>\r\n");
      out.write("		<div class=\"alist\" id=\"alist\">\r\n");
      out.write("			댓글목록\r\n");
      out.write("		</div>\r\n");
      out.write("        <div class=\"aform input-group\">\r\n");
      out.write("           <input type=\"text\" id=\"nickname\" class=\"form-control\" style=\"width: 80px;\" placeholder=\"닉네임\">\r\n");
      out.write("           <input type=\"text\" id=\"content\" class=\"form-control\" style=\"width: 300px; margin-left: 10px;\" placeholder=\"댓글메세지\">\r\n");
      out.write("           <button type=\"button\" id=\"btnasend\" class=\"btn btn-info btn-sm\">저장</button>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 수정창 -->\r\n");
      out.write("        <div class=\"aupdateform input-group\">\r\n");
      out.write("       	   <input type=\"hidden\" id=\"idx\">\r\n");
      out.write("           <input type=\"text\" id=\"unickname\" class=\"form-control\" style=\"width: 80px;\" placeholder=\"닉네임\">\r\n");
      out.write("           <input type=\"text\" id=\"ucontent\" class=\"form-control\" style=\"width: 300px; margin-left: 10px;\" placeholder=\"댓글메세지\">\r\n");
      out.write("           <button type=\"button\" id=\"btnaUsend\" class=\"btn btn-warning btn-sm\">수정</button>\r\n");
      out.write("        </div>\r\n");
      out.write("        </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("		\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td align=\"center\">\r\n");
      out.write("				<button type=\"button\" class=\"btn btn-outline-info\" onclick=\"location.href='addForm.jsp'\"><i class=\"bi bi-pencil\"></i>글쓰기</button>\r\n");
      out.write("				<button type=\"button\" class=\"btn btn-outline-success\" onclick=\"location.href='boardList.jsp'\"><i class=\"bi bi-list-ul\"></i>목록</button>\r\n");
      out.write("				<button type=\"button\" class=\"btn btn-outline-primary\" onclick=\"location.href='updatepassForm.jsp?num=");
      out.print(num);
      out.write("'\"><i class=\"bi bi-pencil-square\"></i>수정</button>\r\n");
      out.write("				<button type=\"button\" class=\"btn btn-outline-danger\" onclick=\"location.href='deletepassForm.jsp?num=");
      out.print(num);
      out.write("'\"><i class=\"bi bi-trash\"></i>삭제</button>\r\n");
      out.write("			</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("	</table>\r\n");
      out.write("</div>\r\n");
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
