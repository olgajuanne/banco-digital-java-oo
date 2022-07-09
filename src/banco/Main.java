package banco;

public class Main {

    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);    
        Conta cp = new ContaPoupanca(venilton);
        Conta ci = new ContaInvestimento(venilton);

        cc.depositar(100);
        cc.transferir(100, cp);
        

        cc.imprimirExtrato();
        cp.imprimirExtrato();
        ci.imprimirExtrato();
    }
}
