package animalitos.mesa10.entity;

public class Pajaro {
    
    private int id;
    private String nombre;
    private String alimento;
    private String dueno;
    private String chiquito;

    
    public Pajaro() {
    }

    public Pajaro(int id, String nombre, String alimento, String dueno, String chiquito) {
        this.id = id;
        this.nombre = nombre;
        this.alimento = alimento;
        this.dueno = dueno;
        this.chiquito = chiquito;
    }

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

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public String getChiquito() {
        return chiquito;
    }

    public void setChiquito(String chiquito) {
        this.chiquito = chiquito;
    }

    @Override
    public String toString() {
        return "Pajaro{" + "id=" + id + ", nombre=" + nombre + ", alimento=" + alimento + ", due\u00f1o=" + dueno + ", chiquito=" + chiquito + '}';
    }
    
}
