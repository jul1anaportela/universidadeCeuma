
package job;

import java.io.PrintStream;


public class Job {

    
    public static void main(String[] args) {
        Engenheiro e1 = new Engenheiro("lucas", 3000, "engenheiro");
        System.out.println(e1.nome);
        e1.calcularSalario(3000);
        e1.mostrarCargo();
        System.out.println("============================================");
        
        Secretario s1 = new Secretario("joão", 2000, "secretario");
        System.out.println(s1.nome);
        s1.calcularSalario(2000);
        s1.mostrarCargo();
        System.out.println("============================================");
        
        Diretor d1 = new Diretor("joana", 5000, "diretora");
        System.out.println(d1.nome);
        d1.calcularSalario(5000);
        d1.mostrarCargo();
        System.out.println("============================================");
        
        Gerente g1 = new Gerente("amélia", 6500, "gerente");
        System.out.println(g1.nome);
        g1.calcularSalario(6500);
        g1.mostrarCargo();
        System.out.println("============================================");
        
        
    }
    
}
