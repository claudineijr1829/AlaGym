
package model;


public class AvaliacaoFisica {
    private int percentualGordura;
    private String dataAvalicao;
    private int massaMagra;
    private float circunferenciaCintura;
    private float circunferenciaQuadril;
    private int frequenciaCardiaca;
    private char pressaoArterial;
    private float imc;

    public AvaliacaoFisica(int percentualGordura, String dataAvalicao, int massaMagra, float circunferenciaCintura, float circunferenciaQuadril, int frequenciaCardiaca, char pressaoArterial, float imc) {
        this.percentualGordura = percentualGordura;
        this.dataAvalicao = dataAvalicao;
        this.massaMagra = massaMagra;
        this.circunferenciaCintura = circunferenciaCintura;
        this.circunferenciaQuadril = circunferenciaQuadril;
        this.frequenciaCardiaca = frequenciaCardiaca;
        this.pressaoArterial = pressaoArterial;
        this.imc = imc;
    }

    public int getPercentualGordura() {
        return percentualGordura;
    }

    public void setPercentualGordura(int percentualGordura) {
        this.percentualGordura = percentualGordura;
    }

    public String getDataAvalicao() {
        return dataAvalicao;
    }

    public void setDataAvalicao(String dataAvalicao) {
        this.dataAvalicao = dataAvalicao;
    }

    public int getMassaMagra() {
        return massaMagra;
    }

    public void setMassaMagra(int massaMagra) {
        this.massaMagra = massaMagra;
    }

    public float getCircunferenciaCintura() {
        return circunferenciaCintura;
    }

    public void setCircunferenciaCintura(float circunferenciaCintura) {
        this.circunferenciaCintura = circunferenciaCintura;
    }

    public float getCircunferenciaQuadril() {
        return circunferenciaQuadril;
    }

    public void setCircunferenciaQuadril(float circunferenciaQuadril) {
        this.circunferenciaQuadril = circunferenciaQuadril;
    }

    public int getFrequenciaCardiaca() {
        return frequenciaCardiaca;
    }

    public void setFrequenciaCardiaca(int frequenciaCardiaca) {
        this.frequenciaCardiaca = frequenciaCardiaca;
    }

    public char getPressaoArterial() {
        return pressaoArterial;
    }

    public void setPressaoArterial(char pressaoArterial) {
        this.pressaoArterial = pressaoArterial;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }
    
}
