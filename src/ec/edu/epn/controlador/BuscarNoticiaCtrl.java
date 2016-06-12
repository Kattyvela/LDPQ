package ec.edu.epn.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.epn.modelo.Noticia;

import ec.edu.epn.modelo.servicios.GestorNoticias;

@WebServlet("/Vistas/Noticias/BuscarNoticiaCtrl")
public class BuscarNoticiaCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public BuscarNoticiaCtrl() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//preparar la información
				
				String nombreBusqueda = request.getParameter("nombreBusqueda");
				
				//llamar al modelo
				System.out.print("deporteID");
				GestorNoticias gn = new GestorNoticias();
				List<Noticia> noticias=null;
				noticias = gn.buscarNoticias(nombreBusqueda);
				//publicar la informacion
				request.setAttribute("NOTICIAS", noticias);
				//redireccionar a la vista
				System.out.print("2");
				RequestDispatcher rd = 
						request.getServletContext().getRequestDispatcher(
								"/Vistas/Noticias/Noticias.jsp");
				rd.forward(request, response);
				System.out.print("3");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}