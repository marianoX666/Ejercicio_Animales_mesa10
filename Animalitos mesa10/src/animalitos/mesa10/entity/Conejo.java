package animalitos.mesa10.entity;

/**
 *
 * @author marya
 */
public class Conejo {
    private String nombre;
    private String color;
    private String raza;

    public Conejo() {
    }

    public Conejo(String nombre, String color, String raza) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public String toString() {
        return "Conejo{ \n" 
          + "nombre = " + nombre 
          + "color = " + color 
          + "raza = " + raza + '}';
    }
    
    
}
