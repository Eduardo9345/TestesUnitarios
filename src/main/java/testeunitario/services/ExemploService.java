package testeunitario.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class ExemploService {

    public int somaValores(int x, int y){
        return x + y;
    }

    public String verificarNulo(String objeto){
        return objeto;
    }

    public boolean verificarSeMaiorQue(double valor1, double valor2){
        return valor1 > valor2;
    }

    public String[] retornarQuatroPrimeirasLetrasAlfabeto(){

        String[] alfabeto = {"A", "B", "C", "D"};

        return alfabeto;
    }

    public ArrayList<String> retornarCincoPrimeirasLetrasAlfabeto(){
        ArrayList<String> list = new ArrayList<String>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        return list;
    }

}
