
package APS;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import model.Dados;
import model.DadosDAO;

public class Main {

    public static void main(String[] args) {
    	//-- Testes que o Guilherme estava fazendo --
    	Random rnd = new Random();
    	DadosDAO dados = new DadosDAO();
    	ArrayList<Dados> lista = new ArrayList<Dados>();
    	QuickSort qk = new QuickSort();
    	
    	
        for(int i = 0; i < 999; i++) {
        	Dados info = new Dados("a","a",20.0,30.0,40.0,50.0);
        	info.setDataAtualiz("a");
        	lista.add(info);
        }
    	
        try {
        	dados.CriarArquivo("teste");
        	dados.EscreverArquivo(lista, "teste");
        	
        	//lista = qk.quickSort(lista, 0, lista.size()-1);
        	//dados.CriarArquivo("QuickSort");
        	//dados.EscreverArquivo(lista, "QuickSort");
        }catch(IOException e) {
        	System.out.println(e);
        }
    	/*
        int[] vetor = new int[10];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * i);
        }
        
        System.out.print("Desordenado:            ");
        for (int i = 0; i < vetor.length; i++) {           
            System.out.print(vetor[i] + " ");
        }
        
        QuickSort quick = new QuickSort();
        quick.ordenar(vetor, 0, vetor.length-1);
        System.out.println("");
        
        System.out.print("Ordenado por QuickSort: ");
        for (int i = 0; i < vetor.length; i++) {          
            System.out.print(vetor[i] + " ");
        }
        System.out.println("");
        */
    }
    
}
