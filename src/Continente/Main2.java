package Continente;

import Continente.Pais;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Liste: ");

        // Você pode adicionar sua lógica aqui, por exemplo:
        Continente continente = new Continente ("Europa");
        Pais brasil = new Pais("Brasil", 8515767, 212559417);
        continente.adicionarPais(brasil);

        // Imprima a dimensão total do continente
        System.out.println("Dimensão total do continente: " + continente.obterDimensaoTotal());

        // Imprima a população total do continente
        System.out.println("População total do continente: " + continente.obterPopulacaoTotal());

        // E assim por diante, com mais lógica de teste
    }
}
