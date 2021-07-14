
package conta;

public class contaPoupanca extends contaModelo {
    private double saldoPoupanca;

    public contaPoupanca(double saldoPoupanca, String nome, String endereco, String cpf, int agencia, int saldo, String tipo) {
        super(nome, endereco, cpf, agencia, saldo, tipo);
        this.saldoPoupanca = saldoPoupanca;
    }
    
    public void setSaldoPoupanca(double saldoPoupanca){
        this.saldoPoupanca = saldoPoupanca;
    }
    public double getSaldoPoupanca(){
        return saldoPoupanca;
    }
    
    
   // ==============================AÇÕES=========================================
    @Override
    public void verSaldo() {    
        System.out.println(" Saldo CC: " + this.saldo);
    }
    public void verSaldoPoupanca(){
        System.out.println("Saldo Poupança: " + this.saldoPoupanca);
    }
    public String sacar(double valor) {
        if (this.saldoPoupanca >= valor) {
            this.saldoPoupanca -= valor;
            return "\n Dinheiro retirado!";
        } else {
            return "\n Dinheiro não retirado!";
        }
    }

    @Override
    public void mostrarTipo() {
        System.out.println("CONTA POUPANÇA");
    }
    
}
