
package conta;

public class contaEspecial extends contaModelo{

    public contaEspecial(String nome, String endereco, String cpf, int agencia, int saldo, String tipo) {
        super(nome, endereco, cpf, agencia, saldo, tipo);
    }
    @Override
    public void verSaldo(){        
        System.out.println(" Saldo: " + this.saldo);
   }     
   public String sacar(double valor){        
        this.saldo -= valor;
        System.out.println("valor retirado: " + valor);
        System.out.println("saldo final: " + this.saldo);
        return null;       
    } 
    @Override
    public void mostrarTipo(){
        System.out.println("CONTA ESPECIAL");
    }
}
    
