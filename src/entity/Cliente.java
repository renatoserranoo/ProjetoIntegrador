package entity;

public class Cliente {
    public String nome;
    private String cpf;
    public String endereco;
    public String UF;
    public String cidade;
    public String telefoneFixo;
    public String celular;

    public Cliente(String nome, String cpf, String endereco, String celular, String UF, String cidade, String telefoneFixo) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.UF = UF;
        this.cidade = cidade;
        this.telefoneFixo = telefoneFixo;
        this.celular = celular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getUF() {
        return UF;
    }

    public String getCidade() {
        return cidade;
    }
}
