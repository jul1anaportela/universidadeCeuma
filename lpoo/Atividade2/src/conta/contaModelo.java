
package conta;

public class contaModelo {
    protected String nome;
    protected String endereco;
    protected String cpf;
    protected int    agencia;
    protected double saldo;
    protected String tipo;
    
    //Construtores
    public contaModelo(String nome, String endereco, String cpf, int agencia, int saldo, String tipo){
        this.nome     = nome;
        this.endereco = endereco;
        this.cpf      = cpf;
        this.agencia  = agencia;
        this.saldo    = saldo;
    }
    //Mudar valores dos atributos (set)
    public void setNome(String nome){
        this.nome     = nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setCpf(String cpf){
        this.cpf      = cpf;
    }
    public void setAgencia(int agencia){
        this.agencia  = agencia;
    }
    public void setSaldo(double saldo){
        this.saldo    = saldo;
    }
    public void setTipo(String tipo){
        this.tipo     = tipo;
    }
    //Mostrar valores dos atributos (get)
    public String getNome(){
        return nome;
    }
    public String getEndereco(){
        return endereco;
    }
    public String getCpf(){
        return cpf;
    }
    public int getAgencia(){
        return agencia;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getTipo(){
        return tipo;
    }
    
    //======================Ações==============================================
    
    public void verSaldo(){
        
   }
    public void mostrarTipo(){
        System.out.println("Tipo da conta: " + tipo);
    } 
}
    

