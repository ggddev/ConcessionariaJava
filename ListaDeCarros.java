package ConcessionariaJava;
import java.util.ArrayList;
import java.util.Stack;
public class ListaDeCarros {
    Stack<ArrayList<String>> carrosList = new Stack<>();

    public ListaDeCarros(Stack<ArrayList<String>> carrosList){
        this.carrosList = carrosList;
    }

}
