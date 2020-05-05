package butickets;

public class CarrinhoDeCompras {

    private String loginCliente;
    private static int aux = 0;
    Ingresso[] ingressos = new Ingresso[15];
    private static boolean flag = false;
    private float totalCompra = 0;

    public String getLoginCliente() {
        return loginCliente;
    }

    public void setLoginCliente(String loginCliente) {
        this.loginCliente = loginCliente;
    }

    public float getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(float totalCompra) {
        this.totalCompra = totalCompra;
    }

    public static boolean isFlag() {
        return flag;
    }

    public static void setFlag(boolean flag) {
        CarrinhoDeCompras.flag = flag;
    }

    public void addIngreso(Ingresso ingresso) {
        ingressos[aux] = ingresso;
        aux++;
    }

    public void verificaDesconto() {
        for (int i = 0; i < ingressos.length; i++) {
            if (ingressos[i] instanceof Kids) {
                setFlag(true);
            }
        }
    }

    public void calculaTotalCompra() {
        this.verificaDesconto();
        for (int i = 0; i < ingressos.length; i++) {
            if (ingressos[i] != null) {
                setTotalCompra(getTotalCompra() + ingressos[i].calculaTotalIngresso());
            }
        }

        if (isFlag()) {
            
            System.out.println("Valor Total: " + (getTotalCompra() / 2));
        } else {
            System.out.println("Valor Total: " + (getTotalCompra()));
        }
    }

    public void mostraDetalhesCompras() {
        System.out.println("\nIngressos comprados: " + Ingresso.getNumberGenerator());
        //Valor total
        calculaTotalCompra();
    }

}
