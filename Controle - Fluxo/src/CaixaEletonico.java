public class CaixaEletonico {
    public static void main(String[] args) {
        double saldo =25.0;
        double valorSolicitado =29.0;

        if(valorSolicitado < saldo) {
        saldo = saldo - valorSolicitado;
        
        System.out.println("Seu Saldo e: R$" + saldo);

        } else {
            System.out.println("Saldo Insuficiente");
        }

    } 

}
