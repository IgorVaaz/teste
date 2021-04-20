package br.edu.fema.relatorio;

import br.edu.fema.annotations.Numero;
import br.edu.fema.annotations.Telefone;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ImprimeNumero implements Report {

    @Override
    public void imprimirRelatorio(Annotation anotacao, Object valor, Field campo){
        Numero numero = (Numero) anotacao;
        System.out.println(campo.getName().toUpperCase() + ": "+ String.valueOf(valor));

    }

    public static void formatar(Class<? extends Annotation> anotacao, Report relatorio, Object o){
        Field[] campos = o.getClass().getDeclaredFields();
        relatorio.imprimirRelatorio(anotacao ,o, campos);
    }

}