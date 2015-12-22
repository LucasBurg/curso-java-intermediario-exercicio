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
 * Servlet implementation class ServletVerificaEmail
 */
@WebServlet(name = "ServletVerificaEmail", urlPatterns = {"/SvtVerificaEmail"})
public class ServletVerificaEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ServletContext contexto;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletVerificaEmail() {
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
		String email = request.getParameter("email");
		contexto.setAttribute("email1", email);
		response.getWriter().println("<html>");
		response.getWriter().println("<head>");
		response.getWriter().println("<title>E-mail</title>");
		response.getWriter().println("</head>");
		response.getWriter().println("<body>");
		
		String form = "<form action=\"SvtConfirmaEmail\" method=\"post\">" +
					  	"<fieldset>" +
					  		"<label>Informe o e-mail</label>" +
					  		"<input type=\"email\" name=\"email\">" +
					  		"<input type=\"submit\" value=\"Enviar\">" +
					  	"</fieldset>" +
					  "</form>";
		
		response.getWriter().println(form);
		response.getWriter().println("</body>");
		response.getWriter().println("</html>");
	}

}
