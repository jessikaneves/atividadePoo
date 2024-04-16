package Continente;

public class Pais {
    private String nome;
    private double dimensaoTerritorial; // Em quilômetros quadrados
    private long populacao; // Número de habitantes

    public Pais(String nome, double dimensaoTerritorial, long populacao) {
        this.nome = nome;
        this.dimensaoTerritorial = dimensaoTerritorial;
        this.populacao = populacao;
    }

    // Método para obter o nome do país
    public String getNome() {
        return nome;
    }

    // Método para obter a dimensão territorial do país
    public double getDimensaoTerritorial() {
        return dimensaoTerritorial;
    }

    // Método para obter a população do país
    public long getPopulacao() {
        return populacao;
    }
}
