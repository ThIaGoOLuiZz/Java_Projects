package Control;

import javax.swing.JOptionPane;
import View.EntradaSaida;
import Model.*;

import java.awt.*;
import java.util.ArrayList;

public class Controladora {

    private Casa casa = null;

    public void exibeMenu(){
        int opcao;

        do
        {
            opcao = EntradaSaida.solicitaOpcao();

            switch (opcao)
            {
                case 0:
                    this.casa = new Casa();

                    String descricao = EntradaSaida.solicitaDescricao("casa", 0);
                    String cor = EntradaSaida.solicitaCor();
                    int qtdePortas = EntradaSaida.solicitaQtdeAberturas("portas");
                    int qtdeJanelas = EntradaSaida.solicitaQtdeAberturas("janelas");

                    ArrayList<Aberturas> listaDePortas = new ArrayList<Aberturas>();
                    ArrayList<Aberturas> listaDeJanelas = new ArrayList<Aberturas>();

                    for (int i=0; i<qtdePortas; i++)
                    {
                        Porta porta = new Porta();
                        porta.setDescricao(EntradaSaida.solicitaDescricao("porta",(i+1)));
                        porta.setEstado(EntradaSaida.solicitaEstado("porta"));
                        listaDePortas.add(porta);
                    }

                    for (int i=0; i<qtdeJanelas;i++)
                    {
                        Janela janela = new Janela();
                        janela.setDescricao(EntradaSaida.solicitaDescricao("Janela",(i+1)));
                        janela.setEstado(EntradaSaida.solicitaEstado("Janela"));
                        listaDeJanelas.add(janela);
                    }

                    this.casa.constroiCasa(descricao, cor, listaDePortas, listaDeJanelas);

                    System.out.println("Descrição da casa: " + casa.getDescricao() + "\n");
                    System.out.println("Cor da casa: " + casa.getCor() + "\n");

                    for(Aberturas porta : casa.getListaDePortas()){
                        System.out.println("Descrição da porta: " + porta.getDeescricao() + "\n");
                        System.out.println("Estado da porta: " + porta.getEstado() + "\n");
                    }

                    for(Aberturas janela : casa.getListaDeJanelas()){
                        System.out.println("Descrição da janela: " + janela.getDeescricao() + "\n");
                        System.out.println("Estado da janela: " + janela.getEstado());
                    }

                    break;


                case 1:
                    String tipoAbertura = EntradaSaida.solicitaTipoAbertura();

                    ArrayList<Aberturas> listaDeAberturas = new ArrayList<Aberturas>();

                    if(tipoAbertura.equals("porta"))
                    {
                        listaDeAberturas = this.casa.getListaDePortas();
                    }
                    else
                    {
                        listaDeAberturas = this.casa.getListaDeJanelas();
                    }

                    int posicao = EntradaSaida.solicitaAberturaMover(listaDeAberturas);
                    int novoEstado = 0;

                    if(posicao!= -1)
                    {
                        novoEstado = EntradaSaida.solicitaEstado(tipoAbertura);
                        Aberturas aberturas = this.casa.retornaAbertura(posicao, tipoAbertura);
                        this.casa.moverAbertura(aberturas, novoEstado);
                    }
                    else
                    {
                        EntradaSaida.exibeMsgAbertura();
                    }

                    break;

                case 2:
                    String informacoes = this.casa.getInfoCasa();
                    EntradaSaida.exibeInfoCasa(informacoes);
                    break;
            }
        }while (opcao!=3);

        EntradaSaida.exibeMsgEncerraPrograma();

        System.exit(0);

    }
}
