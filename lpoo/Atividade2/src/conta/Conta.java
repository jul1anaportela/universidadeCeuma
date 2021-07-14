
package conta;

import java.io.PrintStream;


public class Conta {

    
    public static void main(String[] args) {
       //Declara a variavel do tipo ContaCorrente
       //Instanciar o objeto - Memoria para inserir valores | Chamar os metodos
     contaEspecial ce = new contaEspecial("gerson", "las vegas", "123793284", 2348, 45, "conta especial");
     System.out.println(ce.nome);
     ce.mostrarTipo();
     ce.verSaldo();
     ce.sacar(40);
     System.out.println("============================================");
     
     contaUniversitaria cu = new contaUniversitaria("letras", "joão","vila luizão", "91287313", 2345, 0, "conta universitária");
     System.out.println(cu.nome);
     cu.mostrarTipo();
     cu.depositarUni(3000);
     System.out.println("============================================");
     
     contaPoupanca cp = new contaPoupanca(67, "Ana", "renascença", "978391272", 9807, 567,"conta poupança");
     System.out.println(cp.nome);
     cp.mostrarTipo();
     cp.verSaldo();
     cp.verSaldoPoupanca();
     System.out.println("============================================");
        
        
        
       
    }                

    
}
