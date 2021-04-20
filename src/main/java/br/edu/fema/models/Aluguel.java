package br.edu.fema.models;

public class Aluguel {

    private Integer id;
    private Loja loja;
    private Cliente cliente;
    private Carro carro;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Aluguel(Integer id, Loja loja, Cliente cliente, Carro carro) {
        this.id = id;
        this.loja = loja;
        this.cliente = cliente;
        this.carro = carro;
    }

    @Override
    public String toString() {
        return "Aluguel:" +
                "\n id = " + id +
                "\n loja = " + loja.getNome() +
                "\n cliente = " + cliente.getNome() +
                "\n carro = " + carro.getPlaca() +
        "\n\nCliente:" +
                "\n CPF = " + cliente.getCpf() +
                "\n Email= " + cliente.getEmail() +
                "\n Telefone= " + cliente.getTelefone() +
        "\n\nCarro: " +
                "\n Marca = " + carro.getMarca() +
                "\n Modelo = " + carro.getModelo() +
                "\n Cor = " + carro.getCor() +
                "\n Tipo = " + carro.getTipo();
    }
}
