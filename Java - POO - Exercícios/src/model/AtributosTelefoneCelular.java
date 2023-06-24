package model;

public class AtributosTelefoneCelular {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private boolean ligado;

    public AtributosTelefoneCelular(String marca, String modelo, int ano, String cor, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.ligado = ligado;
    }

    public void Ligar() {
        ligado = true;
        System.out.println("O Celular esta ligado!");
    }

    public void Desligar() {
        ligado = false;
        System.out.println("O Celular esta desligado!");
    }

    //Getters e Setters

    //Marca

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //Modelo

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //Ano

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    //Cor

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    //Ligado

    public boolean isLigado() {
        return ligado;
    }
}
