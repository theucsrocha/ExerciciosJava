    package exercise;

    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int opcao;
            int opcaoCarro;
            String placa;
            String modelo;
            int ano;
            int quantidadePortas;
        do{

            
            System.out.println("Escolha a seção de gerenciamento");
            System.out.println("1 - Gerenciamento de Carro");
            System.out.println("2 - Gerenciamento de Moto");
            System.out.println("3 - Gerenciamento de Locadora");
            System.out.println("0 - Sair");
            opcao = entrada.nextInt();

            switch (opcao) {
                
                case 1:
                    do{
                        System.out.println("-----------------------------------------------");
                        System.out.println("1 - Criar novo carro");
                        System.out.println("2 - Calcular diaria");
                        System.out.println("3 - Veiculos totais");
                        System.out.println("0 - Sair");
                        opcaoCarro = entrada.nextInt();
                        entrada.nextLine();
                        switch (opcaoCarro) {
                            case 1:

                                System.out.println("Digite a placa do carro: ");
                                placa = entrada.nextLine();

                                System.out.println("Digite o modelo do carro: ");
                                modelo = entrada.nextLine();

                                System.out.println("Digite o ano do carro: ");
                                ano = entrada.nextInt();
                                entrada.nextLine();

                                System.out.println("Digite o numero de portas do carro");
                                int numeroDePortas = entrada.nextInt();
                                entrada.nextLine();

                                Carro novoCarro = new Carro(placa,modelo,ano,numeroDePortas);

                                break;

                            case 2: 

                                System.out.println("Digite o numero de dias: ");
                                int dias = entrada.nextInt();
                                entrada.nextLine();

                                
                                System.out.println("Digite o numero de portas: ");
                                quantidadePortas = entrada.nextInt();

                                double valorDaDiaria = Carro.calcularDiaria(quantidadePortas,dias);
                                System.out.println("Valor da diaria: " + valorDaDiaria);
                            
                                break;

                            case 3:
                                
                                System.out.println("Numero de total de carros: " + Carro.quatidadeDeCarros);
                                break;
                        
                            default:
                                break;
                        }

                    }while (opcaoCarro != 0);
                        
                    
                    
                    break;
                default:
                    break;
            }

        } while (opcao != 0);



        
    }
    }