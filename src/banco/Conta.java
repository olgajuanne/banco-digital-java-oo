package banco;

public abstract class Conta implements IConta {

  private static final int AGENCIA_PADRAO = 1;
  private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
 
    public Conta(Cliente cliente){ 
       this.agencia = Conta.AGENCIA_PADRAO;
       this.numero = SEQUENCIAL++;
       this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
      if (saldo > 0){ // Condição para sacar
        saldo -= valor;
      }else System.out.println("\u001b[31mSaldo insuficiente!\u001b[m");
       
    }

    @Override
    public void depositar(double valor) {
      saldo += valor; //saldo = saldo + valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
      if (valor > 0 && saldo > 0) {
        this.sacar(valor);
        contaDestino.depositar(valor);
      }else System.out.println("\u001b[31mSaldo insuficiente!\u001b[m");
        
    }

    public int getAgencia() {
      return agencia;
    }

    public int getNumero() {
      return numero;
    }

    public double getSaldo() {
      return saldo;
    }

    protected void imprimirInfosComuns(){
      System.out.println(String.format("Titular: %s", this.cliente.getNome()));
      System.out.println(String.format("Agencia: %d", this.agencia));
      System.out.println(String.format("Conta: %d", this.numero));
      System.out.println(String.format("Saldo: %.2f", this.saldo));
      //Pessoa i = new Pessoa("Jose Francisco");
		  //System.out.println("Veja como os atributos foram preenchidos\n\nNome: " + i.nome);
    }
    protected void imprimirInfosSaldo(){
      System.out.println(String.format("Saldo atual: %.2f", this.saldo));
    }
 
}
