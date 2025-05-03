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

     public double calcularValorTotalLocacao(String placa, int dias){
        for(Veiculo v : veiculosCadastrados){
            if(v.getPlaca().equals(placa)){
                return v.calcularDiaria(dias);
            }
        }
        return -1;
    }


}
