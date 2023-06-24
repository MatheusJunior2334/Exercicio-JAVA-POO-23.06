package model;

import java.util.Scanner;

public abstract class AtributosFestaAniversario {
    private String aniversariante;
    private int idade;
    private String local;
    private String data;
    private boolean presente;

    public abstract void celebrar();

    public AtributosFestaAniversario(String aniversariante, int idade, String local, String data, boolean presente) {
        this.aniversariante = aniversariante;
        this.idade = idade;
        this.local = local;
        this.data = data;
    }

    //Getters e Setters

    //Aniversariante

    public String getAniversariante() {
        return this.aniversariante;
    }

    public void setAniversariante(String aniversariante) {
        this.aniversariante = aniversariante;
    }

    //Idade

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Local

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    //data

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    //Presente

    public boolean isPresente() {
        return this.presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    //Voce trouxe presentes?

    Scanner entrada = new Scanner(System.in);

    public void trouxePresentes() {
        System.out.println("Quantos presentes você trouxe (0 para nenhum)?");
        int presentes = entrada.nextInt();

        if(presentes == 0) {
            System.out.println("Voce nao troxe nenhum presente, que pena");
            presente = false;
        } else if(presentes >= 1 && presentes < 10) {
            System.out.println("Eba, voce trouxe presentes");
            presente = true;
        } else if(presentes >= 10) {
            System.out.println("Tudo isso, meu Deus!!!");
            presente = true;
        } else {
            System.out.println("Valor invalido");
        }
    }
}
