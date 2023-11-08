package carro;

import java.util.Scanner;

public class Carro {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Digite a marca do seu carro:");
        String marca = str.nextLine();
        System.out.println("Digite o modelo do seu carro:");
        String modelo = str.nextLine();
        System.out.println("Digite o ano do seu carro:");
        int ano = str.nextInt();
        classCarro meuCarro = new classCarro(marca, modelo, ano);
        meuCarro.acelerar ();
        meuCarro.frear();
    }
}
