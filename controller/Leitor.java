package controller;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import controller.*;

public class Leitor {
    public static File leitor(){
        String cam = "C:/Users/Visitante/OneDrive - SENAC - SP/Trabalho/Referencias/cadastro/regextreino/modal";
        Arquivo ar = new Arquivo();
        Timer t = new Timer();

   
        File arquivo = new File(cam,ar.nome("erva venenosa")+ar.tipo(".txt"));

        return arquivo;
    }

    public static BufferedReader procurador(){
        Timer t = new Timer();
        Arquivo n = new Arquivo();
        Mark marcador = new Mark();
        File l = leitor();
        
        try {
  
            FileReader arq = new FileReader(l);
            BufferedReader leitura = new BufferedReader(arq);
            return leitura;
        } catch (Exception e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",e.getMessage());
            return null;
        }
    }

    public static int contador(){
        String linha;
        int count = 0;
        BufferedReader procura = procurador();
        Clear clean = new Clear();
        
        try {
            while ((linha = procura.readLine()) != null) {
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        
        System.out.println("linhas:"+count);
        clean.clean(100);
        return count;
    }

    public static String armazem(){
        Porc p = new Porc();
        Timer t = new Timer();
        Clear clean = new Clear();

        BufferedReader procura = procurador();
        int contado = contador();
        
        int x=0;
        String linha;
        String musica="";
    
       try {
            clean.clean(100);
            while ((linha = procura.readLine()) != null) {
                musica += linha+"\n";
                //Timer.time(500);
                System.out.println("Lendo: "+p.porcentagem(x, contado)+"%");
                x++;
            }
            System.out.println("Texto Lido!");
            t.time(10);
            return musica;
       } catch (Exception e) {
            System.out.println("\n\n\n\nNão entrou na gravação da musica\n\n\n\n");
            return null;
       }
        
    }
    
}
