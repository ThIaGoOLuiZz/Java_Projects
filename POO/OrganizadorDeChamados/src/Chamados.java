import java.util.ArrayList;

public class Chamados {
    private ArrayList<LogChamados> logChamados = new ArrayList<>();

    private int id;

    private String descricao;
    private String tipo;
    private String status;
    private String responsavel;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public ArrayList<LogChamados> getLogChamados() {
        return logChamados;
    }

    public void setLogChamados(LogChamados logChamado) {
        this.logChamados.add(logChamado);
    }
}
