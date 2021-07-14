
package job;


public class funcionarioContratado extends Funcionario{

    public funcionarioContratado(String nome, double salario, String cargo) {
        super(nome, salario, cargo);
    }
   
    
    @Override
    public void calcularSalario(double valorFinal) {
        salario = valorFinal * 1.2;
        System.out.println("salario: " + salario);
        System.out.println("acres. 20%: " + valorFinal);
        
    }
}
