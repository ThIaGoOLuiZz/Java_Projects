package View;
import Model.Aberturas;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class EntradaSaida {

    public static int solicitaOpcao(){
        String[] opcoes = {"Contruir casa","Movimentar portas ou janelas","Ver informações da casa","Sair do programa"};

        JComboBox<String> menu = new JComboBox<>(opcoes);
        JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada",JOptionPane.OK_CANCEL_OPTION);

        return menu.getSelectedIndex();
    }

    public static String solicitaDescricao(String descricao, int ordem){
        if(ordem==0)
        {
            return  JOptionPane.showInputDialog("informe a descrição da " + descricao);
        }
        else
        {
            return JOptionPane.showInputDialog("Informe a descrição da " + ordem+ " " + descricao);
        }
    }

    public static String solicitaCor(){
        return JOptionPane.showInputDialog("Informe a cor da casa");
    }

    public static int solicitaQtdeAberturas(String abertura){
        return Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de " + abertura));
    }

    public static int solicitaEstado(String tipoAbertura){
        String[] opcoes = {"Fechada","Aberta"};

        return JOptionPane.showOptionDialog(null, "Informe o estado da " + tipoAbertura, "Estado",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes,opcoes[1]);
    }

    public static String solicitaTipoAbertura(){
        String[] opcoes = {"Porta","Janela"};

        int tipoAbertura = JOptionPane.showOptionDialog(null, "Informe qual tipo de abertura deseja mover",
                        "Mover abertura", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

        if(tipoAbertura==0){
            return "porta";
        }
        else
        {
            return "janela";
        }
    }

    public static int solicitaAberturaMover(ArrayList<Aberturas> listaDeAberturas){
        String tipoAbertura = listaDeAberturas.get(0).getClass().getName();
        tipoAbertura = tipoAbertura.replaceAll("modelo.","");
        int qtdeAbertura = listaDeAberturas.size();
        String[] descricoesAberturas = new String[qtdeAbertura];

        for(int i=0; i<qtdeAbertura; i++){
            descricoesAberturas[i] = listaDeAberturas.get(i).getDeescricao();
        }

        String msg = "Escolha a " + tipoAbertura + "a ser movimentada";
        JComboBox exibicaoAbertura = new JComboBox(descricoesAberturas);
        int confirmacao = JOptionPane.showConfirmDialog(null, exibicaoAbertura, msg, JOptionPane.OK_CANCEL_OPTION);

        if(confirmacao==0)
        {
            return exibicaoAbertura.getSelectedIndex();
        }
        else
        {
            return -1;
        }
    }

    public static void exibeMsgAbertura(){
        JOptionPane.showMessageDialog(null, "Nenhuma abertura será movimentada");
    }

    public static void exibeInfoCasa(String informacoes){
        JOptionPane.showMessageDialog(null, informacoes, "Informações da casa", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void exibeMsgEncerraPrograma(){
        JOptionPane.showConfirmDialog(null,"O programa será encerrado!");
    }
}


