package br.edu.fema.main;

import br.edu.fema.components.ClassUtils;
import br.edu.fema.models.Aluguel;
import br.edu.fema.models.Carro;
import br.edu.fema.models.Cliente;
import br.edu.fema.models.Loja;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {


        Cliente cliente1 = new Cliente("Igor", "(18)99608-3200", "invalido@gmail.com", "41766799809").validaCliente();
        Carro carro1 = new Carro("BMW", "X1", "branca", "turbo", "BMW-6666").validaCarro();
        Loja loja1 = new Loja("Vaz's Alugay's", "(18)99234-0923","loja@hotmail.com").validaLoja();
        Aluguel aluguel1 = new Aluguel(1, loja1, cliente1, carro1);
        //ClassUtils.relatorio(carro1);
        //ClassUtils.relatorio(cliente1);
        ClassUtils.relatorio(aluguel1);

    }

}
