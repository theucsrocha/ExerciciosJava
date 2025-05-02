package exercise;
public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String placa, String modelo,int ano, int quantidadePortas){
        super(placa, modelo, ano);
        this.quantidadePortas = quantidadePortas;
    }

    public Carro(String placa, String modelo){
        super(placa, modelo);
        quantidadePortas = 4;
        

    }

    @Override
    public double calcularDiaria(int dias){
        return (100*dias) + (20 * quantidadePortas);
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Número de portas: " + quantidadePortas);
    }
}
