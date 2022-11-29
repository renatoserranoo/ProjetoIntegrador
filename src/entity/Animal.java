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
    public void exibirAnimal(){
        System.out.printf("Nome: %s \nespecie: %s \nraca: %s \nsexo: %s \nidade: %s \nPeso: %s \npelagem: %s \nprocedencia: %s.\n",
                apelido, especie, raca, sexo, idade, peso, pelagem, procedencia);
    }
    @Override
    public String toString(){
        return  apelido + "\n" + especie + "\n" + raca + "\n" + sexo + "\n" +
                pelagem + "\n" + procedencia + "\n"+ idade + "\n" + peso;
    }
}
