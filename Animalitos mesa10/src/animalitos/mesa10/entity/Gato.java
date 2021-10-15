// Ejercicio 4 - Guia GIT con GITHUB - rama mario
package animalitos.mesa10.entity;

// aporte Mario
public class Gato {
    
    // ATRIBUTOS
    private int id;
    private String nombre;
    private String raza;
    private String color;
    private int edad; 
    
    // CONSTRUCTORES
    public Gato() {}
    public Gato(int id, String nombre, String raza, String color, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }
    
    // GETTER & SETTER
    public int getId() {
        return id;
    }
    public void setId(int id) {
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

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    // metodo para MOSTRAR los ATRIBUTOS de un Objeto
    @Override
    public String toString() {
        return "Gato{" + "id=" + id + ", nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", edad=" + edad + '}';
    }
    
    
    
}
