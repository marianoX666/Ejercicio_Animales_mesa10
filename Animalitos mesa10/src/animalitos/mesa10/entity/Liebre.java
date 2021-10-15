/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalitos.mesa10.entity;

/**
 *
 * @author 54261
 */
public class Liebre    }
 {
    private String nombre;
    private String color;
    private Integer anios;

    public Liebre() {

    public Liebre(String nombre, String color, Integer anios) {
        this.nombre = nombre;
        this.color = color;
        this.anios = anios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAnios() {
        return anios;
    }

    public void setAnios(Integer anios) {
        this.anios = anios;
    }

    @Override
    public String toString() {
        return "Liebre{" + "nombre=" + nombre + ", color=" + color + ", anios=" + anios + '}';
    }
    
}
