package controller;

import java.util.Scanner;

import model.AtributosTelefoneCelular;

public class ClasseTelefoneCelular {
    public static void main(String[] args) throws Exception {

        System.out.println("Meu Telefone Celular");

        Scanner entrada = new Scanner(System.in);

        //Inserir marca do celular

        System.out.println("Digite a marca do celular: ");
        String marca = entrada.nextLine();

        //Inserir modelo do celular

        System.out.println("Digite o modelo do celular: ");
        String modelo = entrada.nextLine();

        //Inserir ano de fabricacao do celular

        System.out.println("Digite o ano do celular: ");
        int ano = entrada.nextInt();
        entrada.nextLine();

        //Inserir cor do celular

        System.out.println("Digite a cor do celular: ");
        String cor = entrada.nextLine();

         //Determinar se o celular esta ligado ou nao

        System.out.println("O Celular esta ligado (digite 'false' para Nao ou 'true' para Sim)?");
        boolean ligado = entrada.nextBoolean();

        //Ver informacoes do celular

        AtributosTelefoneCelular Celular = new AtributosTelefoneCelular(marca, modelo, ano, cor, ligado);

        System.out.println("A marca do celular e: " + Celular.getMarca());
        System.out.println("O modelo do celular e: " + Celular.getModelo());
        System.out.println("O ano do celular e: " + Celular.getAno());
        System.out.println("A cor do celular e: " + Celular.getCor());

        if(ligado == true) {
            Celular.Ligar();
        } else if(ligado == false) {
            Celular.Desligar();
        }

        entrada.close();
    }
}
