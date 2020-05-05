package butickets;

public class BUTickets {

    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        Vip vip = new Vip();
        vip.setValorIngresso(550);
        vip.setTamanhoAbada("GG");
        carrinho.addIngreso(vip);
        vip.mostraInfos();

        Kids kid = new Kids();
        kid.setValorIngresso(550);
        kid.setTamanhoAbada("8");
        kid.setDocResponsavel("MG20163108");
        carrinho.addIngreso(kid);
        kid.mostraInfos();

        Camarote camarote = new Camarote();
        camarote.setValorIngresso(1600);
        camarote.setTamanhoCamiseta("M");
        carrinho.addIngreso(camarote);
        camarote.mostraInfos();

        carrinho.mostraDetalhesCompras();
    }

}
