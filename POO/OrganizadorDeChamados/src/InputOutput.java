import javax.swing.*;
import java.util.ArrayList;

public class InputOutput {
    public static int menuPrincipalComChamados(){
        String[] opcoes = {"Abrir chamado","Editar chamado","Visualizar chamados","Finalizar Chamado","Log do chamado","Sair"};

        JComboBox<String> menu = new JComboBox<>(opcoes);

        JOptionPane.showMessageDialog(null,menu,"Selecione a opção desejada", JOptionPane.PLAIN_MESSAGE);

        return menu.getSelectedIndex();
    }

    public static int menuPrincipalSemChamados(){
        String[] opcoes = {"Abrir chamado","Sair"};

        JComboBox<String> menu = new JComboBox<>(opcoes);

        JOptionPane.showMessageDialog(null,menu,"Selecione a opção desejada", JOptionPane.PLAIN_MESSAGE);

        return menu.getSelectedIndex();
    }

    public static ArrayList descricaoChamado(){
        ArrayList valores = new ArrayList<>();
        String[] tipo = {"Manutenção do software","Projeto de software","Consultoria"};

        JComboBox<String> menu = new JComboBox<>(tipo);

        String descricao = JOptionPane.showInputDialog(null,menu,"Descrição do chamado");

        valores.add(menu.getSelectedIndex());
        valores.add(descricao);

        return valores;
    }

    public static int selecionarChamado(ArrayList<Chamados> chamados){
        String[] listaChamado = new String[chamados.size()];

        for(int x=0; x< chamados.size();x++){
            listaChamado[x] = Integer.toString(chamados.get(x).getId());
        }

        JComboBox<String> menu = new JComboBox<>(listaChamado);

        JOptionPane.showMessageDialog(null, menu, "Edicao de chamado",JOptionPane.PLAIN_MESSAGE);

        return menu.getSelectedIndex();

    }

    public static String responsavelChamado(){
        return JOptionPane.showInputDialog(null,"Responsavel pelo Chamado","Abertura de Chamado",JOptionPane.PLAIN_MESSAGE);
    }

    public static int editarChamado(){
        String[] alteracao = {"Descrição","Tipo","Status","Responsável"};

        JComboBox<String> menu = new JComboBox<>(alteracao);

        JOptionPane.showMessageDialog(null,menu,"Editar chamado", JOptionPane.PLAIN_MESSAGE);

        return menu.getSelectedIndex();
    }

    public static String editarDescricao(String descricao){

        JOptionPane.showMessageDialog(null,"A descrição atual é: " + descricao, "Edição de chamado", JOptionPane.INFORMATION_MESSAGE);

        return JOptionPane.showInputDialog(null, "Digite a nova descrição.", "", JOptionPane.PLAIN_MESSAGE);

    }

    public static String editarStatus(String status){

        JOptionPane.showMessageDialog(null,"O status atual é: " + status, "Edição de chamado", JOptionPane.INFORMATION_MESSAGE);

        String[] tipos = {"Aberto","Em atendimento","Aguardando solicitante"};
        JComboBox menu = new JComboBox(tipos);
        boolean validacao;

        do {
            JOptionPane.showMessageDialog(null, menu,"Edição de chamado",JOptionPane.PLAIN_MESSAGE);
            validacao = true;

            if(menu.getSelectedIndex() == 0 && status.equals("Aberto")){
                JOptionPane.showMessageDialog(null,"Não é possivel atribuir, pois o chamado já esta com esse status");
                validacao = false;
            } else if (menu.getSelectedIndex() == 1 && status.equals("Em atendimento")){
                JOptionPane.showMessageDialog(null,"Não é possivel atribuir, pois o chamado já esta com esse status");
                validacao = false;
            } else if (menu.getSelectedIndex() == 2 && status.equals("Aguardando solicitante")){
                JOptionPane.showMessageDialog(null,"Não é possivel atribuir, pois o chamado já esta com esse status");
                validacao = false;
            }
        }while (!validacao);

        switch (menu.getSelectedIndex()){
            case 0:
                return "Aberto";
            case 1:
                return "Em atendimento";
            case 2:
                return "Aguardando solicitante";
        }
        return "Concluido";
    }

    public static String editarTipo(String tipo){

        JOptionPane.showMessageDialog(null,"O tipo atual é: " + tipo, "Edição de chamado", JOptionPane.INFORMATION_MESSAGE);

        String[] tipos = {"Manutenção do software","Projeto de software","Consultoria"};
        JComboBox menu = new JComboBox(tipos);
        boolean validacao;

        do {
            JOptionPane.showMessageDialog(null, menu, "Edição de chamado", JOptionPane.PLAIN_MESSAGE);
            validacao = true;

            if (menu.getSelectedIndex() == 0 && tipo.equals("Manutenção do software")) {
                JOptionPane.showMessageDialog(null, "Não é possivel atribuir, pois o chamado já esta com esse tipo");
                validacao = false;
            } else if (menu.getSelectedIndex() == 1 && tipo.equals("Projeto de software")) {
                JOptionPane.showMessageDialog(null, "Não é possivel atribuir, pois o chamado já esta com esse tipo");
                validacao = false;
            } else if (menu.getSelectedIndex() == 2 && tipo.equals("Consultoria")) {
                JOptionPane.showMessageDialog(null, "Não é possivel atribuir, pois o chamado já esta com esse tipo");
                validacao = false;
            }
        }while (!validacao);

        switch (menu.getSelectedIndex()){
            case 0:
                return "Manutenção do software";
            case 1:
                return "Projeto de software";
        }
        return "Consultoria";
    }

    public static String editarResponsavel(String responsavel){

        JOptionPane.showMessageDialog(null,"O tipo atual é: " + responsavel, "Edição de chamado", JOptionPane.INFORMATION_MESSAGE);

        boolean validacao;
        String novoResponsavel = "";

        do {
            novoResponsavel = JOptionPane.showInputDialog(null, "Digite o nome do novo responsavel", "Edição de chamado", JOptionPane.PLAIN_MESSAGE);
            validacao = true;

            if (novoResponsavel.equals(responsavel)) {
                JOptionPane.showMessageDialog(null, "Não é possivel atribuir, pois o chamado já esta com responsavel");
                validacao = false;
            }
        }while (!validacao);

        return novoResponsavel;
    }

    public static int selecionarTipoMostrado(){
        String[] opcoes = {"Em aberto","Em atendimento","Concluidos","Aguardando solicitante","Todos os chamados"};

        JComboBox<String> menu = new JComboBox<>(opcoes);

        JOptionPane.showMessageDialog(null, menu,"Mostrar chamados",JOptionPane.PLAIN_MESSAGE);

        return menu.getSelectedIndex();
    }

    public static Boolean mostrarMenu(ArrayList<Chamados> chamados, int tipoMostrado){
        ArrayList<Chamados> chamado = new ArrayList<>();
        String[] valores = new String[chamados.size()];
        String tipo = "";

        switch (tipoMostrado){
            case 0:
                for(int x=0;x<chamados.size();x++) {
                    if (chamados.get(x).getStatus().equals("Aberto")){
                        chamado.add(chamados.get(x));
                    }
                }
                tipo = "Aberto";
                break;

            case 1:
                for(int x=0;x<chamados.size();x++) {
                    if (chamados.get(x).getStatus().equals("Em atendimento")){
                        chamado.add(chamados.get(x));
                    }
                }
                tipo = "Em atendimento";
                break;

            case 2:
                for(int x=0;x<chamados.size();x++) {
                    if (chamados.get(x).getStatus().equals("Concluído")){
                        chamado.add(chamados.get(x));
                    }
                }
                tipo = "Concluido";
                break;

            case 3:
                for(int x=0;x<chamados.size();x++) {
                    if (chamados.get(x).getStatus().equals("Aguardando solicitante")){
                        chamado.add(chamados.get(x));
                    }
                }
                tipo = "Aguardando solicitante";
                break;

            case 4:
                for(int x=0;x<chamados.size();x++) {
                        chamado.add(chamados.get(x));
                }
                break;
        }
        if (chamado.isEmpty()){
            JOptionPane.showMessageDialog(null,"Não existe chamados do tipo: " + tipo);
            return true;
        }

        for(int x=0;x<chamado.size();x++){
            valores[x] = "| " + chamado.get(x).getId() + " || " + chamado.get(x).getTipo() +
                    " || " + chamado.get(x).getDescricao() + " || " + chamado.get(x).getResponsavel() + " || " +
                    chamado.get(x).getStatus() + " |" + "\n";
        }

        JOptionPane.showMessageDialog(null, valores,"Mostrar chamados",JOptionPane.DEFAULT_OPTION);

        return false;
    }

    public static void concluirChamado(){
        JOptionPane.showMessageDialog(null, "O chamado foi finalizado com sucesso!","Concluir chamado",JOptionPane.ERROR_MESSAGE);
    }

    public static void alertaChamadoConcluido(){
        JOptionPane.showMessageDialog(null,"Não é possivel editar um chamado já concluido!","Edição de chamado",JOptionPane.ERROR_MESSAGE);
    }

    public static void mostrarLogChamados(ArrayList<LogChamados> logChamados){
        String[] valores = new String[logChamados.size()];

        for(int x=0;x<logChamados.size();x++){
            valores[x] = "| " + logChamados.get(x).getLog() + " || " + logChamados.get(x).getDataLog() + " |";
        }

        JOptionPane.showMessageDialog(null, valores, "Log chamado", JOptionPane.PLAIN_MESSAGE);
    }

}
