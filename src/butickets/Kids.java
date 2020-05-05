package butickets;

public class Kids extends Vip {
    
    private String docResponsavel;

    public String getDocResponsavel() {
        return docResponsavel;
    }

    public void setDocResponsavel(String docResponsavel) {
        this.docResponsavel = docResponsavel;
    }
    
    @Override
    public void mostraInfos(){
        System.out.println("Ingresso KIDS");
        super.mostraInfos();
        System.out.println("Documento do Responsável: " + this.docResponsavel);
    }
    
}
