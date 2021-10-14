package animalitos.mesa10.entity;


public class Caballo {
	
	private Integer id;
	private String nombre;
	private String raza;
	private String color;
	
        
	
	public Caballo(Integer id, String nombre, String raza, String color) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
	}


	public Caballo() {
		super();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Caballo [id=" + id + ", nombre=" + nombre + ", raza=" + raza + ", color=" + color + "]";
	}
	
	
	
	
	
	
}
