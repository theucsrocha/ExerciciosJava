package exercise;
import java.util.ArrayList;

public class Locadora {

    private String nome;
    private ArrayList<Veiculo> veiculosCadastrados;
    public Locadora(String nome){
        this.nome = nome;
        this.veiculosCadastrados = new ArrayList<>();
    }

    public void cadastrarVeiculo(Veiculo v){
        veiculosCadastrados.add(v);
     }

    public void listarVeiculos(){
        for(Veiculo v : veiculosCadastrados){
            v.exibirDetalhes();
        }
    }

    public void calcularValorTotalLocacao(String placa, int dias){
        for(Veiculo v : veiculosCadastrados){
            if(v.getPlaca().equals(placa)){
                System.out.println("Valor da diaria: " + v.calcularDiaria(dias));
            }
        }

    }


}
