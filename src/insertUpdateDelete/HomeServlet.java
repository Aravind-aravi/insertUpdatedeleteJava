package insertUpdateDelete;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HomeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);		
		checker checking = new Checkerimp();
		
		String adminname = request.getParameter("AdName");
		String adminpassword = request.getParameter("AdPassword");
		String agentname = request.getParameter("AgName");
		String agentpassword = request.getParameter("AgPassword");
		String submitType = request.getParameter("submit");
		
		LoginGS check = new LoginGS(adminname, adminpassword, agentname, agentpassword);
		check.setAdminName(adminname);
		check.setAdminPassword(adminpassword);
		check.setAgentName(agentname);
		check.setAgentPassword(agentpassword);
		
		if(submitType.equals("AdminLogin")) {
		if(checking.CheckAdmin(adminname, adminpassword)) {
			System.out.println("admin success");
			RequestDispatcher rd1 = request.getRequestDispatcher("login.jsp");
			rd1.forward(request, response);		
		}else {
			System.out.println("admin failed");
		}
		}else if(submitType.equals("AgentLogin")) {
			System.out.println("agent success");
			response.sendRedirect("iup.jsp");
		}else {
			System.out.println("agent failed");
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		doGet(request, response);

	}

}
