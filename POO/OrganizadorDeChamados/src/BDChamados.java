import java.util.ArrayList;

public class BDChamados {
    private ArrayList<Chamados> chamadosBD = new ArrayList<>();

    public ArrayList<Chamados> getChamados() {
        return chamadosBD;
    }

    public void setChamados(Chamados chamado) {
        this.chamadosBD.add(chamado);
    }


}
