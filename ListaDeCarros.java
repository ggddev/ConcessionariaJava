package ConcessionariaJava;

import java.time.Year;
import java.util.ArrayList;
import java.util.Stack;

public class ListaDeCarros extends Venda{

    Stack<ArrayList<String>> veiculosNossos = new Stack<>();

    public ListaDeCarros(String nomeDono, ArrayList<String> modelo, Year anoFabricacao, String cor, byte estado, float valor){
        super(nomeDono, modelo, anoFabricacao, cor, estado, valor);
        this.veiculosNossos = veiculosNossos;
    }


}
