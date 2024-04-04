

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class prog {

    public static String entrada() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome do arquivo: "); String nome = input.nextLine();
        input.close();
        return nome;
    }

    public static String captura() {
        String nome = entrada();
        String musica = "";

        try {
            FileReader arq = new FileReader(nome+".txt");
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
   
    public static void Testerenex(){
        String musica = captura();
        Pattern padrao = Pattern.compile("sorriso");
        Matcher pesquisa = padrao.matcher(captura());
        System.out.print("Resultado: " +pesquisa.matches());
    }
        
    public static void main(String[] args) {
        exibir();
        Testerenex();
    }
}