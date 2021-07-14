/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package job;

public class funcionarioTemporario extends Funcionario {

    public funcionarioTemporario(String nome, double salario, String cargo) {
        super(nome, salario, cargo);
    }
    @Override
    public void calcularSalario(double valorFinal) {
        salario = valorFinal * 1.05;
        System.out.println("salario: " + salario);
        System.out.println("acres. 20%: " + valorFinal);
    }
}
