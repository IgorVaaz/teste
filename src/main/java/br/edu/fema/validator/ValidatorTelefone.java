package br.edu.fema.validator;

import br.edu.fema.annotations.RegexValidator;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorTelefone implements Validator {

    @Override
    public void validar(Annotation annotation, Object value, Field field) {
        Pattern pattern = Pattern.compile(RegexValidator.TELEFONE);
        Matcher matcher = pattern.matcher(String.valueOf(value));
        if(!matcher.matches())
            throw new IllegalStateException(("Telefone inválido!"));
    }

    public static void validaCampo(Class<? extends Annotation> annotationIp, Validator validar, Object o){
        Class<?> klass= o.getClass();
        Field[] fields = o.getClass().getDeclaredFields();
        validar.validar(annotationIp ,o, fields);
    }

}
