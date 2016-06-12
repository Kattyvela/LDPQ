package ec.edu.epn.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the entrenador database table.
 * 
 */
@Entity
@NamedQuery(name="Entrenador.findAll", query="SELECT e FROM Entrenador e")
public class Entrenador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ENTRENADOR")
	private int idEntrenador;

	@Column(name="NOMBRE_ENTRENADOR")
	private String nombreEntrenador;

	@Column(name="TIPO_ENTRENADOR")
	private String tipoEntrenador;

	//bi-directional many-to-one association to Deporte
	@ManyToOne
	@JoinColumn(name="ID_DEPORTE")
	private Deporte deporte;

	//bi-directional many-to-one association to Entrenamiento
	@OneToMany(mappedBy="entrenador")
	private List<Entrenamiento> entrenamientos;

	public Entrenador() {
	}

	public int getIdEntrenador() {
		return this.idEntrenador;
	}

	public void setIdEntrenador(int idEntrenador) {
		this.idEntrenador = idEntrenador;
	}

	public String getNombreEntrenador() {
		return this.nombreEntrenador;
	}

	public void setNombreEntrenador(String nombreEntrenador) {
		this.nombreEntrenador = nombreEntrenador;
	}

	public String getTipoEntrenador() {
		return this.tipoEntrenador;
	}

	public void setTipoEntrenador(String tipoEntrenador) {
		this.tipoEntrenador = tipoEntrenador;
	}

	public Deporte getDeporte() {
		return this.deporte;
	}

	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}

	public List<Entrenamiento> getEntrenamientos() {
		return this.entrenamientos;
	}

	public void setEntrenamientos(List<Entrenamiento> entrenamientos) {
		this.entrenamientos = entrenamientos;
	}

	public Entrenamiento addEntrenamiento(Entrenamiento entrenamiento) {
		getEntrenamientos().add(entrenamiento);
		entrenamiento.setEntrenador(this);

		return entrenamiento;
	}

	public Entrenamiento removeEntrenamiento(Entrenamiento entrenamiento) {
		getEntrenamientos().remove(entrenamiento);
		entrenamiento.setEntrenador(null);

		return entrenamiento;
	}

}