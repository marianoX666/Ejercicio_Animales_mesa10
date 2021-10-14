
package animalitos.mesa10.entity;

/**
 *
 * @author MARIANO
 */
public class Tortuga {
    
    private Integer id;
    private String nombre;
    private String tamaño;
    private Integer edad;
   

    public Tortuga() {
    }

    public Tortuga(Integer id, String nombre, String tamaño, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.edad = edad;
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

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Tortuga{" + "id=" + id + ", nombre=" + nombre + ", tama\u00f1o=" + tamaño + ", edad=" + edad + '}';
    }
    
    
    
    
    
    
    
    
}
