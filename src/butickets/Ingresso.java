package butickets;

import java.util.Date;

public class Ingresso {

    private static long numberGenerator = 0;
    private long numero;
    protected float valorIngresso;
    protected final float taxaCartao = (float) 0.2;
    protected Date dataHoraCompra;

    public Ingresso() {
        this.numero = numberGenerator;
        this.numberGenerator++;
        this.dataHoraCompra = new Date();

    }

    public float getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(float valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    
    public float calculaTotalIngresso() {
        return (this.valorIngresso * (1 + this.taxaCartao));
    }

    public static long getNumberGenerator() {
        return numberGenerator;
    }

    public long getNumero() {
        return numero;
    }

    public Date getDataHoraCompra() {
        return dataHoraCompra;
    }

    
    
    public void mostraInfos() {
        System.out.println("\n"
                + "\nNumero: " + this.numero
                + "\nValor Ingresso: " + this.valorIngresso
                + "\nData e Hora da Compra: " + this.dataHoraCompra);
    }

}
