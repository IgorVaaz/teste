package br.edu.fema.components;

import br.edu.fema.annotations.*;
import br.edu.fema.relatorio.*;
import br.edu.fema.validator.*;

public abstract class ClassUtils {

    public static void validaTudo(Object o) throws Exception {

        Validator validaCpf = new ValidatorCpf();
        Validator validaEmail = new ValidatorEmail();
        Validator validaNameString = new ValidatorNameString();
        Validator validaPlaca = new ValidatorPlaca();
        Validator validaTelefone = new ValidatorTelefone();

        ValidatorCpf.validaCampo(Cpf.class, validaCpf, o);
        ValidatorEmail.validaCampo(Email.class,validaEmail,o);
        ValidatorNameString.validaCampo(NameString.class, validaNameString, o);
        ValidatorPlaca.validaCampo(Placa.class, validaPlaca, o);
        ValidatorTelefone.validaCampo(Telefone.class, validaTelefone, o);

    }

    public static void relatorio(Object o)throws Exception{

        Report formataCpf = new ImprimeCpf();
        Report formataTelefone = new ImprimeTelefone();
        Report formataEmail = new ImprimeEmail();
        Report formataNameString = new ImprimeNameString();
        Report formataPlaca = new ImprimePlaca();
        Report formataNumero = new ImprimeNumero();
        Report imprimeAluguel = new ImprimeAluguel();

        ImprimeCpf.formatar(Cpf.class, formataCpf,o);
        ImprimeTelefone.formatar(Telefone.class, formataTelefone ,o);
        ImprimeEmail.formatar(Email.class, formataEmail,o);
        ImprimeNameString.formatar(NameString.class, formataNameString,o);
        ImprimePlaca.formatar(Placa.class, formataPlaca,o);
        ImprimeNumero.formatar(Numero.class, formataNumero,o);

        ImprimeAluguel.formatar(imprimeAluguel,o);

    }

}
