import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Control {

    Chamados chamados;
    LogChamados logChamados = new LogChamados();
    String descricaoChamado;
    ArrayList valoresChamado;
    int globalId = 1;
    String tipoChamado;
    String statusChamado;
    int indiceTipo;
    String responsavel;
    BDChamados bdChamados = new BDChamados();
    int tamanhoBDChamados;
    int selecionarMenu;
    int selecionarMenuEdicao;
    int indiceChamado;
    int mostradorEscolhido;


    public void Menu(){
        do {
            if(bdChamados.getChamados().isEmpty()){
                selecionarMenu = InputOutput.menuPrincipalSemChamados();
            }else{
                selecionarMenu = InputOutput.menuPrincipalComChamados();
            }

            switch (selecionarMenu){
                case 0:
                    chamados = new Chamados();
                    logChamados = new LogChamados();
                    valoresChamado = InputOutput.descricaoChamado();
                    indiceTipo = ((Integer) valoresChamado.get(0)).intValue();
                    descricaoChamado = valoresChamado.get(1).toString();

                    switch (indiceTipo){
                        case 0:
                            tipoChamado = "Manutenção do software";
                            break;

                        case 1:
                            tipoChamado = "Projeto de software";
                            break;

                        case 2:
                            tipoChamado = "Consultoria";
                            break;
                    }
                    statusChamado = "Aberto";
                    responsavel = InputOutput.responsavelChamado();

                    chamados.setDescricao(descricaoChamado);
                    chamados.setId(globalId);
                    chamados.setResponsavel(responsavel);
                    chamados.setTipo(tipoChamado);
                    chamados.setStatus(statusChamado);
                    logChamados.setLog("Criação");
                    logChamados.setDataLog(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

                    chamados.setLogChamados(logChamados);
                    bdChamados.setChamados(chamados);
                    globalId++;
                    break;

                case 1:
                    if(bdChamados.getChamados().isEmpty())
                    {
                        System.exit(0);
                    }

                    indiceChamado = InputOutput.selecionarChamado(bdChamados.getChamados());
                    if(bdChamados.getChamados().get(indiceChamado).getStatus().equals("Concluído")){
                        InputOutput.alertaChamadoConcluido();
                    }else {
                        selecionarMenuEdicao = InputOutput.editarChamado();
                        logChamados = new LogChamados();

                        switch (selecionarMenuEdicao) {
                            case 0: //Alterar descrição
                                bdChamados.getChamados().get(indiceChamado).setDescricao(InputOutput.editarDescricao(bdChamados.getChamados().get(indiceChamado).getDescricao()));

                                logChamados.setLog("Edição de descrição");
                                logChamados.setDataLog(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
                                bdChamados.getChamados().get(indiceChamado).setLogChamados(logChamados);
                                break;
                            case 1: //Alterar tipo
                                bdChamados.getChamados().get(indiceChamado).setTipo(InputOutput.editarTipo(bdChamados.getChamados().get(indiceChamado).getTipo()));

                                logChamados.setLog("Edição de tipo");
                                logChamados.setDataLog(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
                                bdChamados.getChamados().get(indiceChamado).setLogChamados(logChamados);
                                break;
                            case 2: //Alterar status
                                bdChamados.getChamados().get(indiceChamado).setStatus(InputOutput.editarStatus(bdChamados.getChamados().get(indiceChamado).getStatus()));

                                logChamados.setLog("Edição de status");
                                logChamados.setDataLog(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
                                bdChamados.getChamados().get(indiceChamado).setLogChamados(logChamados);
                                break;
                            case 3: //Alterar responsavel
                                bdChamados.getChamados().get(indiceChamado).setResponsavel(InputOutput.editarResponsavel(bdChamados.getChamados().get(indiceChamado).getResponsavel()));

                                logChamados.setLog("Edição de responsável");
                                logChamados.setDataLog(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
                                bdChamados.getChamados().get(indiceChamado).setLogChamados(logChamados);
                                break;
                        }
                        break;
                    }
                case 2:
                    boolean retorno;
                    do{
                        mostradorEscolhido = InputOutput.selecionarTipoMostrado();
                        retorno = InputOutput.mostrarMenu(bdChamados.getChamados(), mostradorEscolhido);
                    }while (retorno);
                    break;
                case 3:
                    logChamados = new LogChamados();
                    indiceChamado = InputOutput.selecionarChamado(bdChamados.getChamados());
                    if(bdChamados.getChamados().get(indiceChamado).getStatus().equals("Concluído")){
                        InputOutput.alertaChamadoConcluido();
                    }else {
                        InputOutput.concluirChamado();
                        bdChamados.getChamados().get(indiceChamado).setStatus("Concluído");

                        logChamados.setLog("Conclusão do chamado");
                        logChamados.setDataLog(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
                        bdChamados.getChamados().get(indiceChamado).setLogChamados(logChamados);
                    }
                    break;

                case 4:
                    indiceChamado = InputOutput.selecionarChamado(bdChamados.getChamados());
                    InputOutput.mostrarLogChamados(bdChamados.getChamados().get(indiceChamado).getLogChamados());
                    break;
                case 5:
                    System.exit(0);
            }
        }while (true);

    }
}
