package models;

public class Alumno {
    private int idalumno;
    private String nombre;
    private String ape_pat;
    private String ape_mat;
    private String domicilio;
    private String municipio;
    private int bachillerato;
    private double prombach;
    private char genero;
    private int cuatrimestre;
    private int carrera;
    private double promgra1;


    public int getIdalumno() {
        return idalumno;
    }
    public void setIdalumno(int idalumno) {
        this.idalumno = idalumno;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApe_pat() {
        return ape_pat;
    }
    public void setApe_pat(String ape_pat) {
        this.ape_pat = ape_pat;
    }
    public String getApe_mat() {
        return ape_mat;
    }
    public void setApe_mat(String ape_mat) {
        this.ape_mat = ape_mat;
    }
    public String getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public String getMunicipio() {
        return municipio;
    }
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    public int getBachillerato() {
        return bachillerato;
    }
    public void setBachillerato(int bachillerato) {
        this.bachillerato = bachillerato;
    }
    public double getPrombach() {
        return prombach;
    }
    public void setPrombach(double prombach) {
        this.prombach = prombach;
    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public int getCuatrimestre() {
        return cuatrimestre;
    }
    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }
    public int getCarrera() {
        return carrera;
    }
    public void setCarrera(int carrera) {
        this.carrera = carrera;
    }
    public double getPromgra1() {
        return promgra1;
    }
    public void setPromgra1(double promgra1) {
        this.promgra1 = promgra1;
    }
}
