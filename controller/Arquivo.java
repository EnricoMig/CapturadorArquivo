package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.text.Document;
import javax.swing.text.html.ParagraphView;



import modal.*;
import controller.Timer;

public class Arquivo {

    public static String nome(String nome){ return nome; }

    public static String tipo(String tipo){ return tipo; }

    public static String docName(String doc){ return doc; }

    public static void exibir(){
        Leitor l = new Leitor();
        Clear c = new Clear();
        
        c.clean(100);
        System.out.println(l.armazem());
       
    }

    public static void documento(){
       


    }

}
