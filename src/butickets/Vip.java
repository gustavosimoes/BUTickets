package butickets;

public class Vip extends Ingresso{
    
    protected String tamanhoAbada;

    public String getTamanhoAbada() {
        return tamanhoAbada;
    }

    public void setTamanhoAbada(String tamanhoAbada) {
        this.tamanhoAbada = tamanhoAbada;
    }
    
    @Override
    public void mostraInfos(){
        super.mostraInfos();
        System.out.println("Tamanho do Abada: " + this.tamanhoAbada);
    }
}