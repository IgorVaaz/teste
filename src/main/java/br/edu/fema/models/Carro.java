package br.edu.fema.models;

import br.edu.fema.annotations.NameString;
import br.edu.fema.annotations.Placa;
import br.edu.fema.components.ClassUtils;

public class Carro {

    @NameString(min = 1,max = 15)
    private String marca;

    @NameString(min = 1,max = 15)
    private String modelo;

    @NameString(min = 1,max = 15)
    private String cor;

    @NameString(min = 1,max = 15)
    private String tipo;

    @Placa
    private String placa;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Carro(String marca, String modelo, String cor, String tipo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.tipo = tipo;
        this.placa = placa;
    }

    public Carro validaCarro() throws Exception{
        Carro carro = new Carro(marca, modelo, cor, tipo, placa);
        ClassUtils.validaTudo(carro);
        return carro;
    }
}
