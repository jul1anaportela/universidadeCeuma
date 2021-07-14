
package conta;

public class contaUniversitaria extends contaModelo{
    private String curso;
    
    public contaUniversitaria(String curso, String nome, String endereco, String cpf, int agencia, int saldo, String tipo) {
        super(nome, endereco, cpf, agencia, saldo, tipo);
        this.curso = curso;
    }

    
    public void setCurso(String curso){
        this.curso = curso;
    }
    public String getCurso(){
        return curso;
    }
    
    public void depositarUni(double valorDeposito){
        this.saldo +=  valorDeposito * 1.05;
        System.out.println("valor do deposito: " + this.saldo);
    }
    @Override
    public void mostrarTipo() {
        System.out.println("CONTA UNIVERSITÁRIA");
    }
    

    
}
