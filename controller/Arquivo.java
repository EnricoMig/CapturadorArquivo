package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import modal.*;

public class Arquivo {
    public static String entrada() {
        String nome;
        Scanner input= new Scanner(System.in);
        System.out.println("Qual o nome do Arquivo?");
        return nome = input.nextLine();
    }

    public static String tipo(){
        Scanner input = new Scanner(System.in);
        String tipo = ".";
        System.out.println("Qual a extensão do arquivo?"); tipo += input.next();       
        return tipo;
    }

    public static String captura() {
        String extensao = tipo();
        String nome = entrada();
        String musica = "";

        try {
            FileReader arq = new FileReader(nome+extensao);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha;
            while ((linha = lerArq.readLine()) != null) {
                System.out.println("Recebendo a linha:" +linha);
                musica += linha+"\n";
            }

            String jump = "\n";
            for(int x = 100; x!=0; x--){
                System.out.println(jump);
            }

            return nome+"\n\n"+musica;

        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
            return null;
        }
       
    }
    
    public static void exibir(){
        System.out.println(captura());
       
    }
}
