package banco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);    
        Conta cp = new ContaPoupanca(venilton);
        Conta ci = new ContaInvestimento(venilton);

         cc.depositar(100);
        // cc.transferir(50, cp);
        // cc.imprimirExtrato();
        // cp.imprimirExtrato();
        // ci.imprimirExtrato();   

        Scanner input = new Scanner(System.in);

        int op; // operação
        int oc; // opção de conta
        int ot; // opção de transferência 

        do {
            System.out.println("  =====  Java Bank  =====");
            System.out.print("- 1.Extrato -");
            System.out.print(" 2.Sacar -");
            System.out.print(" 3.Depositar -");
            System.out.print(" 4.Transferir -");
            System.out.println(" 5.Sair -");
            
            op = input.nextInt();

            if(op==1){
                System.out.println("Qual tipo de conta?\n1- Corrente\n2- Poupança\n3- Investimento");
                oc = input.nextInt();
                if(oc==1){
                    cc.imprimirExtrato();
                }else if(oc==2) {
                    cp.imprimirExtrato();
                }else if(oc==3) {
                    ci.imprimirExtrato();
                }

            }else if (op==2){
                System.out.println("Qual tipo de conta?\n1- Corrente\n2- Poupança\n3- Investimento");
                oc = input.nextInt();
                if(oc==1){
                    System.out.print("Valor: ");
                    cc.sacar(input.nextInt());
                    cc.imprimirSaldo();
                }else if(oc==2) {
                    System.out.print("Valor: ");
                    cp.sacar(input.nextInt());
                    cp.imprimirSaldo();
                }else if(oc==3) {
                    System.out.print("Valor: ");
                    ci.sacar(input.nextInt());
                    ci.imprimirSaldo();
                }
            }else if (op==3){
                System.out.println("Qual tipo de conta?\n1- Corrente\n2- Poupança\n3- Investimento");
                oc = input.nextInt();
                if(oc==1){
                    System.out.print("Valor: ");
                    cc.depositar(input.nextInt());
                    cc.imprimirSaldo();
                }else if(oc==2) {
                    System.out.print("Valor: ");
                    cp.depositar(input.nextInt());
                    cp.imprimirSaldo();
                }else if(oc==3) {
                    System.out.print("Valor: ");
                    ci.depositar(input.nextInt());
                    ci.imprimirSaldo();
                }  
            }else if (op==4){
                System.out.println("Selecione as opções de transferência.");
                System.out.println("\n1- Corrente para Poupança\n2- Corrente para investimento\n3- Poupança para Corrente\n4- Poupança para Investimento\n5 -Investimento para Corrente\n6- Investimento para Poupança");
                ot = input.nextInt();
                if(ot == 1){ 
                    System.out.print("Valor: ");
                    cc.transferir(input.nextInt(), cp);
                    cp.imprimirSaldo();       
                } else if(ot == 2){
                    System.out.print("Valor: ");
                    cc.transferir(input.nextInt(), ci);
                    ci.imprimirSaldo();                
                }else if(ot==3) {
                    System.out.print("Valor: ");
                    cp.transferir(input.nextInt(), cc);
                    cc.imprimirSaldo();
                }else if(ot==4) {
                    System.out.print("Valor: ");
                    cp.transferir(input.nextInt(), ci);
                    ci.imprimirSaldo();
                }else if(ot==5) {
                    System.out.print("Valor: ");
                    ci.transferir(input.nextInt(), cc);
                    cc.imprimirSaldo();
                }else if(ot==6) {
                    System.out.print("Valor: ");
                    ci.transferir(input.nextInt(), cp);
                    cp.imprimirSaldo();
                }
            }
        }while(op!=5);
    }
    
}
