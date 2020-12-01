package insertUpdateDelete;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class iudServlet
 */
@WebServlet("/iudServlet")
public class iudServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public iudServlet() {
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

		Resdata cd = new resimp();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String url = request.getParameter("url");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String location = request.getParameter("location");
		String cusine = request.getParameter("cusine");
		String dishes = request.getParameter("dishes");
		String p = request.getParameter("price");
		float price = Float.parseFloat(p);
		String r = request.getParameter("ratings");
		float ratings = Float.parseFloat(r);
		String v = request.getParameter("votes");
		int votes = Integer.parseInt(v);
		String uqkey = request.getParameter("uqkey");
		int UniqueKey = Integer.parseInt(uqkey);
		String submitType = request.getParameter("submit");

		DataObjects i = new DataObjects(url, name, address, location, cusine, dishes, price, ratings, votes, UniqueKey);
		i.setUrl(url);
		i.setName(name);
		i.setAddress(address);
		i.setLocation(location);
		i.setCusine(cusine);
		i.setDishes(dishes);
		i.setPrice(price);
		i.setRatings(ratings);
		i.setVotes(votes);
		i.setUniqueKey(UniqueKey);

		if (submitType.equals("insert")) {
			cd.insertResData(i);
		} else if (submitType.equals("update")){
		cd.updateResData(i);
		} else if (submitType.equals("delete")){
			cd.deleteResData(i);
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
