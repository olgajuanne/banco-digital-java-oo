package banco;

public class ContaInvestimento extends Conta {
  
    public ContaInvestimento(Cliente cliente) {
      super(cliente);
    }


    @Override
    public void imprimirExtrato() {
      System.out.println("=====  Extrato Conta Investimento  =====");
      super.imprimirInfosComuns();
      
    }


    @Override
    public void imprimirSaldo() {
      System.out.println("=====  Saldo Conta Investimento  ===== ");
      super.imprimirInfosSaldo();
      
    }
}
