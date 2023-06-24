package controller;


import model.AtributosFestaAniversario;

public abstract class ClasseFestaAniversario {
    public static void main(String[] args) throws Exception {

        //Informacoes da festa

        AtributosFestaAniversario festa = new AtributosFestaAniversario("Eleanor", 16, "Festas musicais", "23/03/2023", true) {
            @Override
            public void celebrar() {
                System.out.println("Feliz aniversario! A festa esta acontecendo");
            }
        };

        System.out.println("Nome da aniversariante: " + festa.getAniversariante());
        System.out.println("Quantos anos ela faz: " + festa.getIdade());
        System.out.println("Local da festa: " + festa.getLocal());
        System.out.println("Data da festa: " + festa.getData());

        festa.celebrar();
        festa.trouxePresentes();
    }
}