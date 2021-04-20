package br.edu.fema.validator;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.stream.Stream;

public interface Validator {

    public void validar(Annotation annotation, Object value, Field field);

    public default void validar(Class<? extends Annotation> annotation, Object o, Field[] fields){
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
                    validar(annotationObject, value, field);
                });
    }
}