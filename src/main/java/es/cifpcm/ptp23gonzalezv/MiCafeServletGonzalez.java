package es.cifpcm.ptp23gonzalezv;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MiCafeServletGonzalez
 */
@WebServlet("/miscafesGonzalez")
public class MiCafeServletGonzalez extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MiCafeServletGonzalez() {
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
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		// fecha de hoy
		GregorianCalendar calendario = new GregorianCalendar();
		calendario.setTime(calendario.getTime());
		int mesactual = calendario.get(Calendar.MONTH);
		int anio = calendario.get(Calendar.YEAR);
		int dia = calendario.get(Calendar.DAY_OF_MONTH);

		String tipo = request.getParameter("tipo");
		String cafe = request.getParameter("cafe");

		PrintWriter writer = response.getWriter();
		// construir Código HTML
		String htmlResponse = "<html>";
		htmlResponse += "<h2>Ha seleccionado usted: " + cafe + " con " + tipo + "</h2><br/>";
			try {
				switch (tipo) {
				case "cafe": {
					htmlResponse += "<img src=\'uploads/cafe.jpeg\'>";
					htmlResponse += "<h4>El precio es de: 2,50 euros</h4><br/>";
					break;
				}
				case "nada": {
					htmlResponse += "<img src=\'uploads/cafedescafeinado.jpeg\'>";
					htmlResponse += "<h4>El precio es de: 2,80 euros</h4><br/>";
					break;
				}
				case "infusion": {
					htmlResponse += "<img src=\'uploads/infusion.jpeg\'>";
					htmlResponse += "<h4>El precio es de: 0,80 euros</h4><br/>";
					break;
				}
				default:
					htmlResponse = "Error";
					break;
				}
			} catch (Exception e) {

			}

		htmlResponse += "<p>" + dia + "/" + mesactual + "/" + anio + "</p>";
		htmlResponse += "</html>";
		// respuesta de response
		writer.println(htmlResponse);
	}
}
