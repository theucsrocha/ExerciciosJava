package exercise;

public class Moto extends Veiculo{
    
    //Atributos
    
    private int cilindradas;

    //Metodos Construtores

    public Moto(String placa, String modelo, int ano, int cilindradas){
        super(placa, modelo, ano);
        this.cilindradas = cilindradas;
    }

    public Moto(String placa, String modelo){
        super(placa, modelo);
        cilindradas = 0;
    }
    
    // Metodos De Sobreposição

    @Override
    public double calcularDiaria(int dias){
        return (50*dias) + (cilindradas * 0.10);
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Numero de cilindradas: " + cilindradas);
    }

    
}
