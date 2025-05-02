package exercise;


public class Main {
    public static void main(String[] args) {

        Veiculo car1 = new Veiculo("abs324", "Suv", 2020);
        Veiculo car2 = new Veiculo("ATW675", "bmw", 2011);
        
        car1.exibirDetalhes();
        Veiculo.getTotalVeiculos();
        car1.setModelo("Ferrari");
        car1.exibirDetalhes();
    
}
}