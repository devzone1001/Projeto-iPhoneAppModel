package Iphone2007.Iphone;

import Iphone2007.Iphone.FuncoesInternet.*;
import Iphone2007.Iphone.FuncoesReprodutor.*;
import Iphone2007.Iphone.FuncoesTelefonicas.*;


public class Iphone {
    public static void main(String[] args) {



        Atender atender = new Atender();
        AparelhoTelefonico aparelhoTelefonico = atender;
        aparelhoTelefonico.Telefone();

        Desligar desligar = new Desligar();
        AparelhoTelefonico aparelhoTelefonico1 =desligar;
        aparelhoTelefonico1.Telefone();

        SelecionarMusica selecionarMusica = new SelecionarMusica();
        ReprodutorMusical reprodutorMusical = selecionarMusica;
        reprodutorMusical.Reproduzir();

        Tocar tocar = new Tocar();
        ReprodutorMusical reprodutorMusicaltocando =tocar;
        reprodutorMusicaltocando.Reproduzir();

        Pausar pausar = new Pausar();
        ReprodutorMusical reprodutorMusicalpause = pausar;
        reprodutorMusicalpause.Reproduzir();

        Navegador navegador = new Navegador();
        NavegadorInternet navegadorInternetnav = navegador;
        navegadorInternetnav.Internet();

        ExibirPagina exibirPagina = new ExibirPagina();
        ExibirPagina exibirPaginaprinc = exibirPagina;
        exibirPaginaprinc.Internet();

        AdicionarNovaAba adicionarNovaAba = new AdicionarNovaAba();
        AdicionarNovaAba adicionarNovaAba1 = adicionarNovaAba;
        adicionarNovaAba1.Internet();

        AtualizarPagina atualizarPagina = new AtualizarPagina();
        AtualizarPagina atualizarPagina1 = atualizarPagina;
        atualizarPagina1.Internet();


    }
}
