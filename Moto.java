package HerancaJava;

public class Moto extends Veiculo{
    public int cilindradas;
    public boolean partidaEletrica;
    public boolean abs;
    public int numeroMarchas;
    public int velocidadeMaxima;


    public Moto(String marca, String modelo, String cor, int ano, double preco,
                int cilindradas, boolean partidaEletrica, boolean abs,
                int numeroMarchas, int velocidadeMaxima){

        super(marca, modelo, cor, ano, preco);
        this.cilindradas = cilindradas;
        this.partidaEletrica = partidaEletrica;
        this.abs = abs;
        this.numeroMarchas = numeroMarchas;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void abastecer(){
        System.out.println("Abastecendo moto");
    }

    public void ligar(){
        System.out.println("Moto ligada.");
    }

    public void desligar(){
        System.out.println("Moto desligada.");
    }

    public void testarVelMax(){
        System.out.println("Velocidade máxima chegou a " + velocidadeMaxima);
    }

    public void quantMarchas(){
        System.out.println("Quantidade de marchas na moto: " + numeroMarchas);
    }
}
