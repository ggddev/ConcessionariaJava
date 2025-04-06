package ConcessionariaJava;

import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String respContinue = "";
        Stack<ArrayList<String>> veiculosNossos = new Stack<>();
        ArrayList<String> modelo = new ArrayList<>();
        System.out.println("Bem-vindo a Concessionária Java! Aqui você poderá comprar e vender veículos!");

        System.out.println("Informe se isso é uma [V]enda ou uma [C]ompra (V / C)");
        String respUser = in.nextLine().toUpperCase();

        do{
        switch(respUser){
            case "C":
                break;
            
            case "V":
                System.out.println("Informe o nome do dono do veículo: ");
                String nomeDono = in.nextLine();
                System.out.println("Informe o modelo do carro: ");
                modelo.add(in.nextLine());
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
                } 
                    System.out.println("Informe o valor desejado pelo veículo: ");
                    float valor = in.nextFloat(); in.nextLine();

                    
                    Venda sell = new Venda(nomeDono, modelo, anoFabri, cor, newOrUse, valor);

                    if(valor < 10000){
                        System.out.println("Compramos seu veículo!!!");
                        veiculosNossos.push(modelo);
                    }

                break;
            
            default:
                System.out.println("Opção inválida.");
                break;
        }

        System.out.println("Deseja inserir um novo registro? ");
        respContinue = in.nextLine();

    }while(respContinue.equalsIgnoreCase("S"));
        
    System.out.println("Deseja ver nosso estoque de veículos? (S / N)");
    String respSeeCar = in.nextLine();

    if(respSeeCar.equalsIgnoreCase("S")){
        ListaDeCarros carList = new ListaDeCarros(veiculosNossos);
        System.out.println(carList.carrosList);
    }

    }
}
