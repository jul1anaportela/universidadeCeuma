
package job;

public class Secretario extends Funcionario {

    public Secretario(String nome, double salario, String cargo) {
        super(nome, salario, cargo);
    }
    @Override
    public void calcularSalario(double valorFinal){
        valorFinal = salario * 1.05;               
        System.out.println("salario: " + valorFinal);
    }
    @Override
    public void mostrarCargo(){
        System.out.println("cargo: " + cargo);
    }
}
