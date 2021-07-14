
package esporte;

public class triatleta extends pessoa implements ciclista, nadador, corredor{

    public triatleta(String name, String address, int cpf) {
        super(name, address, cpf);
    }

    @Override
    public void andarDeBicicleta() {
        System.out.println("ciclista");
    }

    @Override
    public void aquecer() {
        System.out.println("aquecendo");
    }

    @Override
    public void nadar() {
        System.out.println("nadando");
    }

    @Override
    public void correr() {
        System.out.println("correndo");
    }
    
}
