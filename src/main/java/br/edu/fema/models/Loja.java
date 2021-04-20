package br.edu.fema.models;

import br.edu.fema.annotations.Email;
import br.edu.fema.annotations.NameString;
import br.edu.fema.annotations.Telefone;
import br.edu.fema.components.ClassUtils;

public class Loja {

    @NameString(min = 1,max = 40)
    private String nome;

    @Telefone
    private String telefone;

    @Email
    private String email;

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

    public Loja(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public Loja validaLoja() throws Exception{
        Loja loja = new Loja(nome, telefone, email);
        ClassUtils.validaTudo(loja);
        return loja;
    }

}
