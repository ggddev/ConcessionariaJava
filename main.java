package ConcessionariaJava;

import java.util.Scanner;
import java.util.Stack;
import java.time.Year;

public class main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Stack<String> veiculosNossos = new Stack<>();

        System.out.println("Bem-vindo a Concessionária Java! Aqui você poderá comprar e vender veículos!");
        System.out.println("Por favor, nos diga seu nome: ");
        String nomeDono = in.nextLine();

        System.out.println("Informe se você deseja [C]omprar ou [V]ender um veículo: ");
        String respUser = in.nextLine();

        switch(respUser){
            case "C":
                break;
            
            case "V":
                System.out.println("Informe o modelo do carro: ");
                String modelo = in.nextLine();
                System.out.println("Informe o ano de fabricação: ");
                int anoFab = in.nextInt(); in.nextLine();
                Year anoFabri = Year.of(anoFab);
                System.out.println("Informe a cor do veículo: ");
                String cor = in.nextLine();
                System.out.println("Informe se o veículo é (1) Usado   OU   (2) Novo");
                byte newOrUse = in.nextByte(); in.nextLine();
                
                if(newOrUse == 1){
                    System.out.println("Informe quantos KMs o veículo já rodou: ");
                    int kms = in.nextInt();
                } else {
                    System.out.println("Informe o valor desejado pelo veículo: ");
                    float valor = in.nextFloat(); in.nextLine();
                }

                Venda sell = new Venda(nomeDono, modelo, anoFabri, cor, newOrUse, newOrUse);
                break;
            
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}
