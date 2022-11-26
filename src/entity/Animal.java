package entity;

public class Animal {
    public String apelido;
    public String especie;
    public String raca;
    public String sexo;
    public int idade;
    public float peso;
    public String pelagem;
    public String procedencia;

    public Animal(String apelido, String especie, String raca, String sexo, String pelagem, String procedencia,int idade, float peso) {
        this.apelido = apelido;
        this.especie = especie;
        this.raca = raca;
        this.sexo = sexo;
        this.idade = idade;
        this.peso = peso;
        this.pelagem = pelagem;
        this.procedencia = procedencia;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getPelagem() {
        return pelagem;
    }

    public String getProcedencia() {
        return procedencia;
    }

    @Override
    public String toString(){
        return  apelido + "\n" + especie + "\n" + raca + "\n" + sexo + "\n" +
                pelagem + "\n" + procedencia + "\n"+ idade + "\n" + peso;
    }
}
