package br.edu.fema.annotations;

public interface RegexValidator {

     String EMAIL = "[A-Za-z0-9\\._-]+@[A-Za-z]+\\.[A-Za-z]+";
     String PLACA = "[a-zA-Z]{3}-[0-9]{4}";
     String CPF = "([0-9]{2}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[\\/]?[0-9]{4}[-]?[0-9]{2})|([0-9]{3}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[-]?[0-9]{2})";
     String TELEFONE = "\\([1-9]{2,2}\\)[0-9]{5,5}-[0-9]{4,4}";

}
