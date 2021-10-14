
package animalitos.mesa10.entity;


public class Pato {

    private Integer id;
    private String nombre;
    private String especie;
    private String color;
    private String comida;
    private int edad;
    
   
    public Pato() {
    }

    public Pato(Integer id, String nombre, String especie, String color, String comida) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.color = color;
        this.comida = comida;
        
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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    
}
