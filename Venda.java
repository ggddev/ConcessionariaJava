package ConcessionariaJava;

import java.time.Year;
import java.util.ArrayList;
import java.util.Stack;

public class Venda implements VendaInterface{
    protected String nomeDono;
    protected Year anoFabricacao;
    protected String cor;
    protected byte estado;
    protected int kms;
    protected float valor;
    Stack<String> veiculosNossos = new Stack<>();
    ArrayList<String> modelo = new ArrayList<>();

        public Venda(String nomeDono, ArrayList<String> modelo, Year anoFabricacao, String cor, byte estado, float valor){
            this.nomeDono = nomeDono;
            this.modelo = modelo;
            this.anoFabricacao = anoFabricacao;
            this.cor = cor;
            this.estado = estado;
            this.kms = kms;
            this.valor = valor;
        }

        @Override
        public String respostaDeVenda(){
            return "Compramos seu carro!";
        }
}
