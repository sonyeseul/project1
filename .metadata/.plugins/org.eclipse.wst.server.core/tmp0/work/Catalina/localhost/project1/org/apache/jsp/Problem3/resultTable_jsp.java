/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2023-07-17 06:31:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Problem3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class resultTable_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

      out.write('\r');
      out.write('\n');
      jspbook.pr3.LectureBean lb = null;
      lb = (jspbook.pr3.LectureBean) _jspx_page_context.getAttribute("lb", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (lb == null){
        lb = new jspbook.pr3.LectureBean();
        _jspx_page_context.setAttribute("lb", lb, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("lb"), request);
      out.write('\r');
      out.write('\n');
      jspbook.pr3.LectureManager lm = null;
      synchronized (session) {
        lm = (jspbook.pr3.LectureManager) _jspx_page_context.getAttribute("lm", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (lm == null){
          lm = new jspbook.pr3.LectureManager();
          _jspx_page_context.setAttribute("lm", lm, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>timeTable</title>\r\n");
      out.write("<style>\r\n");
      out.write("        table {\r\n");
      out.write("            align-content: center;\r\n");
      out.write("            border: solid 1px;\r\n");
      out.write("            border-collapse: collapse;\r\n");
      out.write("            border-color: black;\r\n");
      out.write("            margin-right:auto;\r\n");
      out.write("            margin-left:auto;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        th {\r\n");
      out.write("            width: 100px;\r\n");
      out.write("            height: 60px;\r\n");
      out.write("            font-size: 20pt;\r\n");
      out.write("            font-family: \"굴림\";\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        td {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            font-family: \"굴림\";\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        h3{\r\n");
      out.write("            font-family: \"굴림\";\r\n");
      out.write("            font-size: x-large;\r\n");
      out.write("            text-align:center;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
 
int i, j;
int[][] lectureType = lm.getTypeMatrix();
int[][] consecutive = lm.getSpanMatrix();
int[][] lectureTitle = lm.getTitleMatrix();

String[] titleNames={"웹프로그래밍","운영체제","소프트웨어프로그래밍","데이터베이스개론","자료구조","네트워크","창의와감성","사회봉사"};
String[] colors={"#B7CBFB","#FAE197","#BDBDBD",""};

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div align=center>\r\n");
      out.write("<h3>강의 시간표</h3>\r\n");
      out.write("    <table border=\"1\"  width=\"600px\" height=\"300px\">\r\n");
      out.write("       <tr>\r\n");
      out.write("       <th>2학년</th>\r\n");
      out.write("       <th>월</th>\r\n");
      out.write("       <th>화</th>\r\n");
      out.write("       <th>수</th>\r\n");
      out.write("       <th>목</th>\r\n");
      out.write("       <th>금</th>\r\n");
      out.write("   </tr>\r\n");
      out.write("       ");

       for(i = 0; i < 6 ; i++) {
    	      out.println("<tr>");
    	      out.println("<th>" + (i + 1) + "</th>");
    	      for(j = 0; j < 5; j++) {
    	         if(consecutive[i][j] == 0)
    	            continue;
    	         else if(lectureTitle[i][j] == -1) {
    	            out.println("<td></td>");
    	         }
    	         else {
    	            out.println("<td rowspan='" + consecutive[i][j] + "' style='background-color:" + colors[lectureType[i][j] - 1] + "'>" + titleNames[lectureTitle[i][j]]);
    	            out.println("</td>");
    	         }
    	      }
    	      out.println("</tr>");
    	   }
       
      out.write("\r\n");
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
