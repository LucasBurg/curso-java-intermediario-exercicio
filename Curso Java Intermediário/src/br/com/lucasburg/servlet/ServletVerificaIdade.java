package br.com.lucasburg.servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletVerificaIdade
 */
@WebServlet(name = "ServletVerificaIdade", urlPatterns = { "/SvtVerificaIdade" })
public class ServletVerificaIdade extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletVerificaIdade() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nome = request.getParameter("nome");
		int idade   = Integer.parseInt(request.getParameter("idade"));
		
		response.getWriter().write("<html>");
		response.getWriter().write("<head>");
		response.getWriter().write("<title>Resultado Verifica Idade</title>");
		response.getWriter().write("</head>");
		response.getWriter().write("<body>");
		response.getWriter().write("<p>Seu nome é : " + nome + "</p>");
		if (idade >= 18) {
			response.getWriter().write("<p>Você é maior de idade</p>");
		} else {
			response.getWriter().write("<p>Você é menor de idade</p>");
		}
		response.getWriter().write("</body>");
		response.getWriter().write("</html>");
	}

}
