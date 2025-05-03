package exercise;
public class Carro extends Veiculo {
    private int quantidadePortas;
    static public int quatidadeDeCarros;
    
    public Carro(String placa, String modelo,int ano, int quantidadePortas){
        super(placa, modelo, ano);
        this.quantidadePortas = quantidadePortas;
        quatidadeDeCarros++;
    }

    public Carro(String placa, String modelo){
        super(placa, modelo);
        quantidadePortas = 4;
        quantidadePortas++;
        
    }

     static public double calcularDiaria(int dias,int quantidadePortas){
        return (100*dias) + (20 * quantidadePortas);
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
