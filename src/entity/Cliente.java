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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString(){
        return nome + "\n" + cpf + "\n" +endereco + "\n" + celular + "\n" +
                UF + "\n" + cidade + "\n" +telefoneFixo;
    }
}
