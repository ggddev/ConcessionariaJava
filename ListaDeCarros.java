package ConcessionariaJava;

import java.time.Year;
import java.util.ArrayList;

public class ListaDeCarros extends Venda{
    public ListaDeCarros(String nomeDono, ArrayList<String> modelo, Year anoFabricacao, String cor, byte estado, float valor){
        super(nomeDono, modelo, anoFabricacao, cor, estado, valor);
    }
}
