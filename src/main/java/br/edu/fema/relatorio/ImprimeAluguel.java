package br.edu.fema.relatorio;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ImprimeAluguel implements Report {

    @Override
    public void imprimirRelatorio(Annotation anotacao, Object valor, Field campo){
    }

    public static void formatar( Report relatorio, Object o){
        Field[] campos = o.getClass().getDeclaredFields();
        System.out.println( String.valueOf(o.toString()));
    }


}