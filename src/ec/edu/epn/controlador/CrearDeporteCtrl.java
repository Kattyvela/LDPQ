package ec.edu.epn.controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;

import ec.edu.epn.modelo.Deporte;
import ec.edu.epn.modelo.servicios.GestorDeportes;

@WebServlet ("/Vistas/CrearDeporteCtrl")
public class CrearDeporteCtrl extends HttpServlet{
	private static final long serialVersionUID =1L;
	public CrearDeporteCtrl(){
		super();
	}
	protected void doPost (HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		String nombre = request.getParameter("txtNombre");
		String descripcion = request.getParameter("txtDescripcion");
		
		Deporte deporte = new Deporte();
		deporte.setNombreDeporte(nombre);
		deporte.setDescripcionDeportes(descripcion);
		
		GestorDeportes gp = new GestorDeportes ();
		String resultado ="";
		try {
			gp.crearDeporte(deporte);
			resultado = "Creacion Exitosa";
		} catch (Exception e){
			resultado = "Error en la creación " + e.getMessage();
			e.printStackTrace();
		}
		request.setAttribute("RESULTADO",resultado);
		
		RequestDispatcher rd =
				request.getServletContext().getRequestDispatcher("/Vistas/Deportes.jsp");
				rd.forward(request, response);
	}
}
