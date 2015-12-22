package br.com.lucasburg.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletUsuario
 */
@WebServlet(name = "ServletUsuario", urlPatterns = {"/SvtUsuario"})
public class ServletUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration<String> headerNamesHttp = request.getHeaderNames();
		response.getWriter().println("<html>");
		response.getWriter().println("<head>");
		response.getWriter().println("<title>Dados do header HTTP</title>");
		response.getWriter().println("</head>");
		response.getWriter().println("<body>");
		response.getWriter().println("<h1>Dados do header HTTP</h1>");
		response.getWriter().println("<table>");
		while (headerNamesHttp.hasMoreElements()) {
			String headerName = headerNamesHttp.nextElement();
			String value = request.getHeader(headerName);
			response.getWriter().println("<tr>");
			response.getWriter().println("<td>" + headerName + "</td>");
			response.getWriter().println("<td>" + value + "</td>");
			response.getWriter().println("</tr>");
		}
		response.getWriter().println("</table>");
		response.getWriter().println("</body>");
		response.getWriter().println("</html>");
		
	}

}
