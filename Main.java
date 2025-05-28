package HerancaJava;

public class Main {
    public static void main(String[] args){
        // Criando um objeto Carro
        Carro car = new Carro(
            "Chevrolet", "Cobalt", "Prata", 2012, 45000.00,
            4, false, true, true, 5
        );

        System.out.println("- Informações do Carro -");
        System.out.println("Marca: " + car.getMarca());
        System.out.println("Modelo: " + car.getModelo());

        car.ligar();
        car.abastecer();
        car.ligarArCondicionado();
        car.ligarSom();
        car.desligar();
        System.out.println();

        // Criando um objeto Moto
        Moto mot = new Moto(
            "Honda", "Hornet", "Branca", 2015, 40000.00,
            600, true, true, 6, 220
        );

        System.out.println("- Informações da Moto -");
        System.out.println("Marca: " + mot.getMarca());
        System.out.println("Modelo: " + mot.getModelo());

        mot.ligar();
        mot.abastecer();
        mot.testarVelMax();
        mot.quantMarchas();
        mot.desligar();
    }
}
