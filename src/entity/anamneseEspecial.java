package entity;

public class anamneseEspecial {
    public String sisRespiratorio;
    public String sisCardio;
    public String sisDigestorio;
    public String sisUrinario;
    public String sisReprodutor;
    public String sisLocomotor;
    public String sisNeuro;
    public String pele;
    public String olhos;

    public anamneseEspecial(String sisRespiratorio, String sisCardio, String sisDigestorio, String sisUrinario,
                            String sisReprodutor, String sisLocomotor, String sisNeuro, String pele, String olhos) {
        this.sisRespiratorio = sisRespiratorio;
        this.sisCardio = sisCardio;
        this.sisDigestorio = sisDigestorio;
        this.sisUrinario = sisUrinario;
        this.sisReprodutor = sisReprodutor;
        this.sisLocomotor = sisLocomotor;
        this.sisNeuro = sisNeuro;
        this.pele = pele;
        this.olhos = olhos;
    }
}
