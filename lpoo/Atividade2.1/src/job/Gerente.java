
package job;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario, String cargo) {
        super(nome, salario, cargo);
    }
    @Override
    public void calcularSalario(double valorFinal){
        valorFinal = salario * 1.15;        
        System.out.println("salario: " + valorFinal);
    }
    @Override
    public void mostrarCargo(){
        System.out.println("cargo: " + cargo);
    }
}
