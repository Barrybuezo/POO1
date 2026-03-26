package org.example.models;

public class vehiculoModel {
    private String marca;
    private String tipo;
    private String modelo;
    private String placa;
    private int anio;

    public vehiculoModel(){}

    public vehiculoModel(String marca, String tipo, String modelo, String placa, int anio){
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
        this.placa = placa;
        this.anio = anio;
    }

    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getPlaca(){
        return this.placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }

    public int getAnio(){
        return this.anio;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }
}
