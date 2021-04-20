package br.edu.fema.relatorio;

import br.edu.fema.annotations.NameString;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ImprimeNameString implements Report {

    @Override
    public void imprimirRelatorio(Annotation anotacao, Object valor, Field campo){
        NameString nome = (NameString) anotacao;
        System.out.println(campo.getName().toUpperCase() + ": "+ String.valueOf(valor));

    }

    public static void formatar(Class<? extends Annotation> anotacao, Report relatorio, Object o){
        Field[] campos = o.getClass().getDeclaredFields();
        relatorio.imprimirRelatorio(anotacao ,o, campos);
    }


}