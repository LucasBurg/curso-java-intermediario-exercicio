package br.com.lucasburg.servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfirmaEmail
 */
@WebServlet(name = "ServletConfirmaEmail", urlPatterns = {"/SvtConfirmaEmail"})
public class ServletConfirmaEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ServletContext contexto;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConfirmaEmail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		contexto = config.getServletContext();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email2 = request.getParameter("email");
		String email1 = contexto.getAttribute("email1").toString();
		String result;
		
		
		response.getWriter().println("<html>");
		response.getWriter().println("<head>");
		response.getWriter().println("<title>E-mail</title>");
		response.getWriter().println("</head>");
		response.getWriter().println("<body>");
		
		if(email1.equals(email2)) {
			result = "<p>Os e-mails são iguais !</p>";
		} else {
			result = "<p>Os e-mails <strong>NÃO</strong> são iguais !</p>";
		}
		
		response.getWriter().println(result);
		
		response.getWriter().println("</body>");
		response.getWriter().println("</html>");
		
	}

}
