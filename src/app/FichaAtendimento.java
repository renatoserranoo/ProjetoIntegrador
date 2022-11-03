package app;

import entity.Animal;
import entity.Cliente;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class FichaAtendimento {
    public int rg;
    public Date data;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Cliente> listaDeFichas = new ArrayList<>();

        int op = 0;

        do{
            System.out.println("##ESCOLHA UMA OPÇÃO##\n");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Animal");
            System.out.println("3 - Sair \n");
            System.out.println("Digite uma opção: ");
            op = scan.nextInt();

            switch(op){
                case 1:
                    System.out.println("Bem vindo ao sistema de cadastro de Clientes.");
                    String nome = scan.nextLine();
                    System.out.println("nome: ");

                    String cpf = scan.nextLine();
                    System.out.println("cpf: ");

                    String endereco = scan.nextLine();
                    System.out.println("endereco: ");

                    String celular = scan.nextLine();
                    System.out.println("celular: ");

                    String cidade = scan.nextLine();
                    System.out.println("cidade: ");

                    String UF = scan.nextLine();
                    System.out.println("Unidade federativa: ");

                    String telefoneFixo = scan.nextLine();
                    System.out.println("telefone: ");

                    Cliente cliente = new Cliente(nome, cpf, endereco, celular, UF, cidade, telefoneFixo);

                    break;
                case 2:
                    System.out.println("Bem vindo ao sistema de cadastro de Animais.");
                    String apelido = scan.nextLine();
                    System.out.println("Nome: ");

                    String especie = scan.nextLine();
                    System.out.println("especie: ");

                    String raca = scan.nextLine();
                    System.out.println("raca: ");

                    String sexo = scan.nextLine();
                    System.out.println("sexo: ");

                    String pelagem = scan.nextLine();
                    System.out.println("pelagem: ");

                    String procedencia = scan.nextLine();
                    System.out.println("procedencia: ");

                    int idade = scan.nextInt();
                    System.out.println("idade: ");

                    float peso = scan.nextFloat();
                    System.out.println("peso: ");

                    Animal animal = new Animal(apelido,especie,raca,sexo,pelagem,procedencia,idade,peso);

                case 3:
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }while(op != 3);
    }
}
