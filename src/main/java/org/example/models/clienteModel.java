package org.example.models;

public class clienteModel {
    private String nombre;
    private String direccion;
    private String telefono;
    private int nit;

    public clienteModel(){}

    public clienteModel(String nombre, String direccion, String telefono, int nit){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
    }

    public String getNombre(){return this.nombre;}

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDireccion(){
        return this.direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public String getTelefono(){
        return  this.telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public int getNit(){
        return this.nit;
    }
    public void setNit(int nit){
        this.nit = nit;
    }
}
