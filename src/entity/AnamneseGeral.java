package entity;

public class AnamneseGeral {
    public String queixaPrincipal;
    public String historicoMedico;
    public String alimentacao;
    public String contactantes;
    public String vacinacao;
    public String vermifugacao;
    public String ambiente;

    public AnamneseGeral(String queixaPrincipal, String historicoMedico, String alimentacao, String contactantes, String vacinacao, String vermifugacao, String ambiente) {
        this.queixaPrincipal = queixaPrincipal;
        this.historicoMedico = historicoMedico;
        this.alimentacao = alimentacao;
        this.contactantes = contactantes;
        this.vacinacao = vacinacao;
        this.vermifugacao = vermifugacao;
        this.ambiente = ambiente;
    }
    @Override
    public String toString(){
        return queixaPrincipal + "\n" +historicoMedico + "\n" +alimentacao + "\n" + contactantes
                + "\n" + vacinacao + "\n" + vermifugacao + "\n" +ambiente;
    }
}
