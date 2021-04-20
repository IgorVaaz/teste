package br.edu.fema.validator;

import br.edu.fema.annotations.NameString;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ValidatorNameString implements Validator {

    @Override
    public void validar(Annotation annotation, Object value, Field field) {
        NameString nameAnnotation = (NameString) annotation;
        if (String.valueOf(value).length() < nameAnnotation.min() || String.valueOf(value).length() > nameAnnotation.max()) {
            throw new IllegalStateException("String inválida!");

        }

    }

    public static void validaCampo(Class<? extends Annotation> annotationNameSize, Validator validar, Object o){
        Class<?> klass= o.getClass();
        Field[] fields = o.getClass().getDeclaredFields();
        validar.validar(annotationNameSize ,o, fields);
    }

}
