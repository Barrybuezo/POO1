package org.example.models;

public class repuestosModel {
    private String id;
    private String nombre;
    private String fechaIngreso;
    private double precio;


    public repuestosModel(){}

    public repuestosModel(String id, String nombre, String fechaIngreso, Double precio){
        this.id = id;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.precio = precio;
    }

    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getFechaIngreso(){
        return this.fechaIngreso;
    }
    public void setFechaIngreso(String fechaIngreso){
        this.fechaIngreso = fechaIngreso;
    }

    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
