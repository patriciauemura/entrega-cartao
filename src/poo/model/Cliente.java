package poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa { // Cliente herda atribuitos de Pessoa

        public String numCartao;

    // tornamos private para que não seja possível o acesso direto, tornando obrigatório acessar pelo getter. Então na classe EntregaCartaoApp alteramos o código para "cliente.getEnderecos().add(endereco);"
    private List<Endereco> enderecos;

    public void adicionaEndereco(Endereco endereco){ // Encapsulamento do getEnderecos() protege o método e permite que  validações sejam feitas antes que o método getEnderecos() seja executado
        if(endereco == null){
            throw new NullPointerException("Endereço não pode ser nulo"); //não é uma boa prática
        }
        if(endereco.cep == null){
            throw new NullPointerException("CEP não pode ser nulo"); //não é uma boa prática
        }
        getEnderecos().add(endereco);
    }

    private List<Endereco> getEnderecos() {
        if (enderecos == null){
            enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }

    /* setter excluido para que não seja possível adicionar lista de endereço, mas sim endereço por endereço
    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }*/
}
