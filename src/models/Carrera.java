package models;

public class Carrera {
    private int id;
    private String nombre;
    private double monto;

    public Carrera(int id, String nombre, double monto) {
        this.id = id;
        this.nombre = nombre;
        this.monto = monto;
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

    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
}
