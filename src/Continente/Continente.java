package Continente;

import java.util.ArrayList;
import java.util.List;

public class Continente {
    private String nome;
    private List<Pais> paises;

    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    // Método para adicionar países ao continente
    public void adicionarPais(Pais pais) {
        paises.add(pais);
    }

    // Método para retornar a dimensão total do continente
    public double obterDimensaoTotal() {
        double dimensaoTotal = 0;
        for (Pais pais : paises) {
            dimensaoTotal += pais.getDimensaoTerritorial();
        }
        return dimensaoTotal;
    }

    // Método para retornar a população total do continente
    public long obterPopulacaoTotal() {
        long populacaoTotal = 0;
        for (Pais pais : paises) {
            populacaoTotal += pais.getPopulacao();
        }
        return populacaoTotal;
    }

    // Método para retornar a densidade populacional do continente
    public double obterDensidadePopulacional() {
        double dimensaoTotal = obterDimensaoTotal();
        long populacaoTotal = obterPopulacaoTotal();
        return populacaoTotal / dimensaoTotal;
    }

    // Método para retornar o país com maior população no continente
    public Pais obterPaisComMaiorPopulacao() {
        Pais maiorPaisPopulacao = null;
        long maiorPopulacao = 0;
        for (Pais pais : paises) {
            if (pais.getPopulacao() > maiorPopulacao) {
                maiorPopulacao = pais.getPopulacao();
                maiorPaisPopulacao = pais;
            }
        }
        return maiorPaisPopulacao;
    }

    // Método para retornar o país com menor população no continente
    public Pais obterPaisComMenorPopulacao() {
        Pais menorPaisPopulacao = null;
        long menorPopulacao = Long.MAX_VALUE;
        for (Pais pais : paises) {
            if (pais.getPopulacao() < menorPopulacao) {
                menorPopulacao = pais.getPopulacao();
                menorPaisPopulacao = pais;
            }
        }
        return menorPaisPopulacao;
    }

    // Método para retornar o país com maior dimensão territorial no continente
    public Pais obterPaisComMaiorDimensaoTerritorial() {
        Pais maiorPaisDimensao = null;
        double maiorDimensaoTerritorial = 0;
        for (Pais pais : paises) {
            if (pais.getDimensaoTerritorial() > maiorDimensaoTerritorial) {
                maiorDimensaoTerritorial = pais.getDimensaoTerritorial();
                maiorPaisDimensao = pais;
            }
        }
        return maiorPaisDimensao;
    }

    // Método para retornar o país com menor dimensão territorial no continente
    public Pais obterPaisComMenorDimensaoTerritorial() {
        Pais menorPaisDimensao = null;
        double menorDimensaoTerritorial = Double.MAX_VALUE;
        for (Pais pais : paises) {
            if (pais.getDimensaoTerritorial() < menorDimensaoTerritorial) {
                menorDimensaoTerritorial = pais.getDimensaoTerritorial();
                menorPaisDimensao = pais;
            }
        }
        return menorPaisDimensao;
    }

    // Método para retornar a razão territorial do maior país em relação ao menor país
    public double obterRazaoTerritorialMaiorMenorPais() {
        Pais maiorPaisDimensao = obterPaisComMaiorDimensaoTerritorial();
        Pais menorPaisDimensao = obterPaisComMenorDimensaoTerritorial();
        return maiorPaisDimensao.getDimensaoTerritorial() / menorPaisDimensao.getDimensaoTerritorial();
    }
}
