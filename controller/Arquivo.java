package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import modal.*;
import controller.Timer;

public class Arquivo {

    public static String nome() {
        String nome="";
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

    public static void exibir(){
        Leitor l = new Leitor();
        Clear c = new Clear();
        
        c.clean(100);
        System.out.println(l.armazem());
       
    }
}
