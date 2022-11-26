package entity;

public class ExameFisico {
    public String postura;
    public String nvConsciencia;
    public String escoreCorporal;
    public float tr;
    public int fr;
    public int fc;
    public int tpc;
    public int pulso;
    public String hidratacao;
    public String linfonodosSub;
    public String linfPreEscapulares;
    public String linfPopliteos;
    public String linfInguinais;
    public String mucosaOcular;
    public String mucosaOral;
    public String mucosaPeniana;
    public String mucosaAnal;

    public ExameFisico(String postura, String nvConsciencia, String escoreCorporal,
                       float tr, int fr, int fc, int tpc, int pulso, String hidratacao,
                       String linfonodosSub, String linfPreEscapulares, String linfPopliteos,
                       String linfInguinais, String mucosaOcular, String mucosaOral,
                       String mucosaPeniana, String mucosaAnal) {
        this.postura = postura;
        this.nvConsciencia = nvConsciencia;
        this.escoreCorporal = escoreCorporal;
        this.tr = tr;
        this.fr = fr;
        this.fc = fc;
        this.tpc = tpc;
        this.pulso = pulso;
        this.hidratacao = hidratacao;
        this.linfonodosSub = linfonodosSub;
        this.linfPreEscapulares = linfPreEscapulares;
        this.linfPopliteos = linfPopliteos;
        this.linfInguinais = linfInguinais;
        this.mucosaOcular = mucosaOcular;
        this.mucosaOral = mucosaOral;
        this.mucosaPeniana = mucosaPeniana;
        this.mucosaAnal = mucosaAnal;

    }
    @Override
    public String toString(){
        return postura+"\n" + nvConsciencia +"\n" + escoreCorporal +"\n"+ tr + "" +fc+ "" + tpc + "" + pulso + "\n"
                + hidratacao+"\n"+linfonodosSub+ "\n"+ linfPreEscapulares+ "\n"+linfPopliteos+ "\n"+
                linfInguinais+ "\n"+mucosaOcular+ "\n" +mucosaOral+ "\n"+mucosaPeniana+ "\n"+mucosaAnal;
    }
}
