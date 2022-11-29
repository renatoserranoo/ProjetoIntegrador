package app;

import entity.*;

import java.util.ArrayList;
import java.util.Scanner;

public class FichaAtendimento {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Object> listaDeFichas = new ArrayList<Object>();
        int op = 0;

        do{
            System.out.println("##ESCOLHA UMA OPÇÃO##\n");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Animal");
            System.out.println("3 - Anamnese Geral");
            System.out.println("4 - Anamese Especial");
            System.out.println("5 - exame fisico");
            System.out.println("6 - listar cadastros");
            System.out.println("7 - Sair \n");
            System.out.println("Digite uma opção: ");
            op = scan.nextInt();

            switch(op){
                case 1:

                    System.out.println("Bem vindo ao sistema de cadastro de Clientes.");
                    String b = scan.nextLine();
                    System.out.print("nome: ");
                    String nome = scan.nextLine();

                    System.out.print("cpf: ");
                    String cpf = scan.nextLine();

                    System.out.print("endereco: ");
                    String endereco = scan.nextLine();

                    System.out.print("celular: ");
                    String celular = scan.nextLine();

                    System.out.print("Unidade federativa: ");
                    String UF = scan.nextLine();

                    System.out.print("cidade: ");
                    String cidade = scan.nextLine();

                    System.out.print("telefone: ");
                    String telefoneFixo = scan.nextLine();

                    Cliente cliente = new Cliente(nome, cpf, endereco, celular, UF, cidade, telefoneFixo);

                    cliente.exibir();
                    listaDeFichas.add(cliente);
                case 2:
                    System.out.println("Bem vindo ao sistema de cadastro de Animais.");

                    System.out.print("Nome: ");
                    String apelido = scan.nextLine();

                    System.out.print("especie: ");
                    String especie = scan.nextLine();

                    System.out.print("raca: ");
                    String raca = scan.nextLine();

                    System.out.print("sexo: ");
                    String sexo = scan.nextLine();

                    System.out.print("pelagem: ");
                    String pelagem = scan.nextLine();

                    System.out.print("procedencia: ");
                    String procedencia = scan.nextLine();

                    System.out.print("idade: ");
                    int idade = scan.nextInt();

                    System.out.print("peso: ");
                    float peso = scan.nextFloat();

                    Animal animal = new Animal(apelido,especie,raca,sexo,pelagem,procedencia,idade,peso);

                    animal.exibirAnimal();
                    listaDeFichas.add(animal);
                case 3:
                    System.out.println("Bem vindo ao sistema de cadastro de Anamnese Geral.");
                    String f = scan.nextLine();

                    System.out.print("queixaPrincipal: ");
                    String queixaPrincipal = scan.nextLine();

                    System.out.print("historicoMedico: ");
                    String historicoMedico = scan.nextLine();

                    System.out.print("alimentacao: ");
                    String alimentacao = scan.nextLine();

                    System.out.print("contactantes: ");
                    String contactantes = scan.nextLine();

                    System.out.print("vacinacao: ");
                    String vacinacao = scan.nextLine();

                    System.out.print("vermifugacao: ");
                    String vermifugacao = scan.nextLine();

                    System.out.print("ambiente: ");
                    String ambiente = scan.nextLine();

                    AnamneseGeral anamnese = new AnamneseGeral(queixaPrincipal, historicoMedico, alimentacao,
                            contactantes, vacinacao, vermifugacao, ambiente);

                    anamnese.exibirAnamnese();
                    listaDeFichas.add(anamnese);
                    break;
                case 4:
                    System.out.println("Bem vindo ao sistema de cadastro de Anamnese Especial.");
                    String d = scan.nextLine();

                    System.out.print("Sistema respiratorio: ");
                    String sisRespiratorio = scan.nextLine();

                    System.out.print("Sistema Cardio: ");
                    String sisCardio = scan.nextLine();

                    System.out.print("Sistema Digestorio: ");
                    String sisDigestorio = scan.nextLine();

                    System.out.print("sistema Urinario: ");
                    String sisUrinario = scan.nextLine();

                    System.out.print("sistema Reprodutor: ");
                    String sisReprodutor = scan.nextLine();

                    System.out.print("sistema locomotor: ");
                    String sisLocomotor = scan.nextLine();

                    System.out.print("sisNeuro: ");
                    String sisNeuro = scan.nextLine();

                    System.out.print("Pele: ");
                    String pele = scan.nextLine();

                    System.out.print("Olhos: ");
                    String olhos = scan.nextLine();

                    AnamneseEspecial anamespecial = new AnamneseEspecial(sisRespiratorio, sisCardio,sisDigestorio,
                            sisUrinario, sisReprodutor, sisLocomotor, sisNeuro, pele, olhos);

                    listaDeFichas.add(anamespecial);
                    break;
                case 5:
                    System.out.println("Bem vindo ao sistema de cadastro de Exame físico.");
                    String e = scan.nextLine();

                    System.out.print("postura: ");
                    String postura = scan.nextLine();

                    System.out.print("nvConsciencia: ");
                    String nvConsciencia = scan.nextLine();

                    System.out.print("escoreCorporal: ");
                    String escoreCorporal = scan.nextLine();

                    System.out.print("tr: ");
                    float tr = scan.nextFloat();

                    System.out.print("fr: ");
                    int fr = scan.nextInt();

                    System.out.print("fc: ");
                    int fc = scan.nextInt();

                    System.out.print("tpc: ");
                    int tpc = scan.nextInt();

                    System.out.print("pulso: ");
                    int pulso = scan.nextInt();

                    System.out.print("hidratacao: ");
                    String hidratacao = scan.nextLine();

                    System.out.print("linfonodosSub: ");
                    String linfonodosSub = scan.nextLine();

                    System.out.print("linfPreEscapulares: ");
                    String linfPreEscapulares = scan.nextLine();

                    System.out.print("linfPopliteos: ");
                    String linfPopliteos = scan.nextLine();

                    System.out.print("linfInguinais: ");
                    String linfInguinais = scan.nextLine();

                    System.out.print("mucosaOcular: ");
                    String mucosaOcular = scan.nextLine();

                    System.out.print("mucosaOral: ");
                    String mucosaOral = scan.nextLine();

                    System.out.print("mucosaPeniana: ");
                    String mucosaPeniana = scan.nextLine();

                    System.out.print("mucosaAnal: ");
                    String mucosaAnal = scan.nextLine();

                    ExameFisico exame = new ExameFisico(postura, nvConsciencia, escoreCorporal, tr,  fr, fc,
                            tpc, pulso,hidratacao, linfonodosSub, linfPreEscapulares, linfPopliteos,
                            linfInguinais,  mucosaOcular, mucosaOral,
                            mucosaPeniana,  mucosaAnal);

                    listaDeFichas.add(exame);
                    break;
                case 6:
                    System.out.println("lista de cadastros");
                    System.out.println(listaDeFichas);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }while(op != 7);
    }
}