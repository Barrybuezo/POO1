package org.example.models;

public class mecanicoModel {
    private String nombre;
    private String direccion;
    private String telefono;
    private String dpi;
    private String especialidad;
    private int edad;

    public mecanicoModel(){}

    public mecanicoModel(String nombre, String direccion, String telefono, String dpi, String especialidad, int edad){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dpi = dpi;
        this.especialidad = especialidad;
        this.edad = edad;
    }

    public mecanicoModel(String nombre){
        this.nombre = nombre;
    }


    //metodo get para obtener informacion
    public String getNombre(){
        return this.nombre;
    }

    //setear
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
        return this.telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getDpi(){
        return this.dpi;
    }
    public void setDpi(String dpi){
        this.dpi = dpi;
    }

    public String getEspecialidad(){
        return this.especialidad;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }

    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }


}
