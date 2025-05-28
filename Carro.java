package HerancaJava;

public class Carro extends Veiculo{
    public int numeroPortas;
    public boolean cambioAutomatico;
    public boolean arCondicionado;
    public boolean caixaSom;
    public int limitePassageiros;

    public Carro(String marca, String modelo, String cor, int ano, double preco,
                int numeroPortas, boolean cambioAutomatico, boolean arCondicionado,
                boolean caixaSom, int limitePassageiros){

        super(marca, modelo, cor, ano, preco);
        this.numeroPortas = numeroPortas;
        this.cambioAutomatico = cambioAutomatico;
        this.arCondicionado = arCondicionado;
        this.caixaSom = caixaSom;
        this.limitePassageiros = limitePassageiros;

    }

    public void abastecer(){
        System.out.println("Abastecendo carro");
    }

    public void ligar(){
        System.out.println("Carro ligado.");
    }

    public void desligar(){
        System.out.println("Carro desligado.");
    }

    public void ligarSom(){
        if(caixaSom){
            System.out.println("Som ligado.");
        }else{
            System.out.println("Este carro não possui caixas de som.");
        }
    }

    public void ligarArCondicionado(){
        if(arCondicionado){
            System.out.println("Ar condicionado ligado.");
        }else{
            System.out.println("Este carro não possui ar condicionado.");
        }
    }
}
