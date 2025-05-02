package exercise;

public class Veiculo {

    //Atributos
    
    private String placa;
    private String modelo;
    private int ano;
    static private int totalVeiculos;

    //Metodos Construtores

    public Veiculo(String placa, String modelo, int ano){
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        totalVeiculos++;
    }

    public Veiculo(String placa, String modelo){
        this.placa = placa;
        this.modelo = modelo;
        ano = 0;
        totalVeiculos++;
    }



    // Metodos Getter

    public String getPlaca(){
        return placa;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    //Metodos Setters

    public  void setPlaca(String placa){
        this.placa = placa;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    // Fim Setters and Getters

    public void exibirDetalhes(){
        System.out.println("Placa do veículo: " + getPlaca() );
        System.out.println("Modelo do veículo: " + getModelo());
        System.out.println("Ano do veículo: " + getAno());
    }

    //Metodo Estáticos

    static public int getTotalVeiculos(){
        return totalVeiculos;
    }

    //FIM Metodos Estaticos

    public double calcularDiaria(int dias){
        return (100*dias) + (0 * 0.10);
    }
    

}
