package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;
import br.com.alura.screenmatch.calculos.Teste;


public class Filme extends Titulo implements Classificavel, Teste {


    public Filme(String nome, int anoDeLancamento){
        super(nome, anoDeLancamento);
    }

    private String diretor;

    // Eu preciso sempre ter um método get e set? depende da aplicação
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int valorAleatorio(){
        return 20;
    }

    @Override // Quando utilizamos o @Override, nos estamos fazendo uma sobrecarga de método, assim como fazemos com métodos de outras linguagens de programação
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
