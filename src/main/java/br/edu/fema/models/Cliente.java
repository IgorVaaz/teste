package br.edu.fema.models;

import br.edu.fema.annotations.Cpf;
import br.edu.fema.annotations.Email;
import br.edu.fema.annotations.NameString;
import br.edu.fema.annotations.Telefone;
import br.edu.fema.components.ClassUtils;

public class Cliente {

    @NameString(min = 1,max = 45)
    private String nome;

    @Telefone
    private String telefone;

    @Email
    private String email;

    @Cpf
    private String cpf;


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cliente(String nome, String telefone, String email, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
    }

    public Cliente validaCliente() throws Exception{
        Cliente cliente = new Cliente(nome, telefone, email, cpf);
        ClassUtils.validaTudo(cliente);
        return cliente;
    }

}
