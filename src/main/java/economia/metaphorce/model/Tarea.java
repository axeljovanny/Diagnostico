package economia.metaphorce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tarea")
public class Tarea {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String titulo;
	private String descripcion;
	private boolean finalizada;
	
	public Tarea(int id, String titulo, String descripcion, boolean finalizada) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.finalizada = finalizada;
	}

	public Tarea() {
		super();
	}

	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isFinalizada() {
		return finalizada;
	}

	public void setFinalizada(boolean finalizada) {
		this.finalizada = finalizada;
	}

	@Override
	public String toString() {
		return "Tarea [id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", finalizada=" + finalizada
				+ "]";
	}
	
	
	
}

