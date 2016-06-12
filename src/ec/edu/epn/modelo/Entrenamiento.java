package ec.edu.epn.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the entrenamientos database table.
 * 
 */
@Entity
@Table(name="entrenamientos")
@NamedQuery(name="Entrenamiento.findAll", query="SELECT e FROM Entrenamiento e")
public class Entrenamiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ENTRENAMIENTOS")
	private int idEntrenamientos;

	@Column(name="DESCRIPCION_ENTRENAMIENTO")
	private String descripcionEntrenamiento;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_ENTRENAMIENTO")
	private Date fechaEntrenamiento;

	@Column(name="HORA_ENTRENAMIENTO")
	private Time horaEntrenamiento;

	@Column(name="LUGAR_ENTRENAMIENTO")
	private String lugarEntrenamiento;

	//bi-directional many-to-one association to Entrenador
	@ManyToOne
	@JoinColumn(name="ID_ENTRENADOR")
	private Entrenador entrenador;

	public Entrenamiento() {
	}

	public int getIdEntrenamientos() {
		return this.idEntrenamientos;
	}

	public void setIdEntrenamientos(int idEntrenamientos) {
		this.idEntrenamientos = idEntrenamientos;
	}

	public String getDescripcionEntrenamiento() {
		return this.descripcionEntrenamiento;
	}

	public void setDescripcionEntrenamiento(String descripcionEntrenamiento) {
		this.descripcionEntrenamiento = descripcionEntrenamiento;
	}

	public Date getFechaEntrenamiento() {
		return this.fechaEntrenamiento;
	}

	public void setFechaEntrenamiento(Date fechaEntrenamiento) {
		this.fechaEntrenamiento = fechaEntrenamiento;
	}

	public Time getHoraEntrenamiento() {
		return this.horaEntrenamiento;
	}

	public void setHoraEntrenamiento(Time horaEntrenamiento) {
		this.horaEntrenamiento = horaEntrenamiento;
	}

	public String getLugarEntrenamiento() {
		return this.lugarEntrenamiento;
	}

	public void setLugarEntrenamiento(String lugarEntrenamiento) {
		this.lugarEntrenamiento = lugarEntrenamiento;
	}

	public Entrenador getEntrenador() {
		return this.entrenador;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

}