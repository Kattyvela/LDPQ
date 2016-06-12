package ec.edu.epn.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the noticias database table.
 * 
 */
@Entity
@Table(name="noticias")
@NamedQuery(name="Noticia.findAll", query="SELECT n FROM Noticia n")
public class Noticia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_NOTICIAS")
	private int idNoticias;

	@Column(name="AUTOR_NOTICIA")
	private String autorNoticia;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_NOTICIA")
	private Date fechaNoticia;

	@Column(name="HORA_NOTICIA")
	private Time horaNoticia;

	@Lob
	private String informacion;

	@Column(name="TITULO_NOTICIA")
	private String tituloNoticia;

	//bi-directional many-to-one association to Deporte
	@ManyToOne
	@JoinColumn(name="ID_DEPORTE")
	private Deporte deporte;

	public Noticia() {
	}

	public int getIdNoticias() {
		return this.idNoticias;
	}

	public void setIdNoticias(int idNoticias) {
		this.idNoticias = idNoticias;
	}

	public String getAutorNoticia() {
		return this.autorNoticia;
	}

	public void setAutorNoticia(String autorNoticia) {
		this.autorNoticia = autorNoticia;
	}

	public Date getFechaNoticia() {
		return this.fechaNoticia;
	}

	public void setFechaNoticia(Date fechaNoticia) {
		this.fechaNoticia = fechaNoticia;
	}

	public Time getHoraNoticia() {
		return this.horaNoticia;
	}

	public void setHoraNoticia(Time horaNoticia) {
		this.horaNoticia = horaNoticia;
	}

	public String getInformacion() {
		return this.informacion;
	}

	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}

	public String getTituloNoticia() {
		return this.tituloNoticia;
	}

	public void setTituloNoticia(String tituloNoticia) {
		this.tituloNoticia = tituloNoticia;
	}

	public Deporte getDeporte() {
		return this.deporte;
	}

	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}

}