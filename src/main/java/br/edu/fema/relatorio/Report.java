package br.edu.fema.relatorio;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.stream.Stream;

public interface Report {

    public void imprimirRelatorio(Annotation annotation, Object value, Field field);

    public default void imprimirRelatorio(Class<? extends Annotation> annotation, Object o, Field[] fields){
        Stream.of(fields).filter(f-> f.isAnnotationPresent(annotation))
                .forEach(field-> {
                    field.setAccessible(true);
                    Object value = null;
                    try {
                        value = field.get(o);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                    Annotation annotationObject = field.getDeclaredAnnotation(annotation);
                    imprimirRelatorio(annotationObject, value, field);
                });
    }


}
