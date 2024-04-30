package test;

import models.Perfil;
import models.Soma;
import models.Subtracao;

import java.util.Scanner;

public class Estudos {
    public static void main(String[] args) {
        Perfil perf = new Perfil();
        Scanner text = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");
        String nome = text.nextLine();
        perf.main(nome);
        text.nextLine();

        Soma conta = new Soma();
        conta.soma(10,5);

        Subtracao sub = new Subtracao();
        sub.subtracao(10,5);
    }
}
