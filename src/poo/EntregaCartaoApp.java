package poo;

import poo.model.Cliente;
import poo.model.Endereco;
import java.util.ArrayList;

public class EntregaCartaoApp {
    public static void main(String[] args) {

        // dados do endereço
        Endereco endereco = new Endereco();
        endereco.cep="00000000";

        // dados do cliente
        Cliente cliente = new Cliente();

        try { // try-catch força o tratamento e não deixa acontecer a exceção e deixamos a mensagem de erro mais user-like
            // adicionar endereço no cliente utilizando Associação de Classes
//        cliente.enderecos.add(endereco);
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereço adicionado com sucesso!");
        } catch (Exception e) {
            System.err.println("Houve um erro ao adicionar endereço: " + e.getMessage());
        }
    }

}
