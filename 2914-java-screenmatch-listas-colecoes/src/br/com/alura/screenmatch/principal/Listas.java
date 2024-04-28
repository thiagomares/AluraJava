package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Listas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Harry Potter", 2001);
        Filme outro = new Filme("Piratas do Caribe", 2005);
        Serie serie = new Serie("Drive to Survive", 2019);

        ArrayList<Titulo> obras = new ArrayList<>();
        obras.add(meuFilme);
        obras.add(serie);
        obras.add(outro);


        for (Titulo item : obras) {
            System.out.println(item.getNome());
            // Beleza, mas eu quero exibir um filme e a serie em separado E mostrar a classificação boa
            if (item instanceof Filme filme && filme.getClassificacao() > 3) {
                System.out.println("Filme: " + filme.getNome());

            } else if (item instanceof Serie series){ // Aqui nos verificamos se o tipo é uma série
                System.out.println("Serie: " + series.getNome());
            }
        }
        // O método sort ordena os valores a partir de alguma regra, seja ele pelo alfabeto, seja pelo valor
        Collections.sort(obras);
        for(Titulo item : obras){ // Isso é muito python, senhor
            System.out.println(item.getNome());
        }
    }
}
