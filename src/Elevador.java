public class Elevador {
    private int andarAtual;
    private final int totalAndares;
    private boolean portaAberta;

    public Elevador(int totalAndares) {
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.portaAberta = false;
    }

    public void subir() {
        if (portaAberta) {
            System.out.println("Não dá pra subir com a porta aberta");
        } else if (andarAtual < totalAndares - 1) {
            andarAtual++;
            System.out.println("Subiu para o andar " + andarAtual);
        } else {
            System.out.println("Você está no térreo");
        }
    }

    public void descer() {
        if (portaAberta) {
            System.out.println("Não dá pra subir com a porta aberta");
        } else if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Desceu para o andar " + andarAtual);
        } else {
            System.out.println("Você está no térreo");
        }
    }

    public void abrirPorta() {
        portaAberta = true;
        System.out.println("Porta aberta");
    }

    public void fecharPorta() {
        portaAberta = false;
        System.out.println("Porta fechadaHenrique-Fleith/Elevador_java_POO");
    }

    public boolean isPortaAberta() {
        return portaAberta;
    }

    public int getAndarAtual() {
        return andarAtual;
    }
}