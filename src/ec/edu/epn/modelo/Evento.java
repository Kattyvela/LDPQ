package ec.edu.epn.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the eventos database table.
 * 
 */
@Entity
@Table(name="eventos")
@NamedQuery(name="Evento.findAll", query="SELECT e FROM Evento e")
public class Evento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_EVENTOS")
	private int idEventos;

	@Column(name="DESCRIPCION_EVENTO")
	private String descripcionEvento;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_EVENTO")
	private Date fechaEvento;

	@Column(name="HORA_EVENTO")
	private Time horaEvento;

	@Column(name="LUGAR_EVENTO")
	private String lugarEvento;

	@Column(name="NOMBRE_EVENTO")
	private String nombreEvento;

	//bi-directional many-to-one association to Deporte
	@ManyToOne
	@JoinColumn(name="ID_DEPORTE")
	private Deporte deporte;

	public Evento() {
	}

	public int getIdEventos() {
		return this.idEventos;
	}

	public void setIdEventos(int idEventos) {
		this.idEventos = idEventos;
	}

	public String getDescripcionEvento() {
		return this.descripcionEvento;
	}

	public void setDescripcionEvento(String descripcionEvento) {
		this.descripcionEvento = descripcionEvento;
	}

	public Date getFechaEvento() {
		return this.fechaEvento;
	}

	public void setFechaEvento(Date fechaEvento) {
		this.fechaEvento = fechaEvento;
	}

	public Time getHoraEvento() {
		return this.horaEvento;
	}

	public void setHoraEvento(Time horaEvento) {
		this.horaEvento = horaEvento;
	}

	public String getLugarEvento() {
		return this.lugarEvento;
	}

	public void setLugarEvento(String lugarEvento) {
		this.lugarEvento = lugarEvento;
	}

	public String getNombreEvento() {
		return this.nombreEvento;
	}

	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}

	public Deporte getDeporte() {
		return this.deporte;
	}

	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}

}