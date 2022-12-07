package classes;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String porte;
    private String endereco;
    private int numero;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    ArrayList<String> telefone;
    private int status;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return porte;
    }
    public void setCpf(String cpf) {
        this.porte = porte;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public ArrayList<String> getTelefone() {
        return telefone;
    }
    public void setTelefone(ArrayList<String> telefone) {
        this.telefone = telefone;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }

    
}
