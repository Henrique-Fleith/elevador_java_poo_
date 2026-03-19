import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAndares = 10;
        Elevador elevador = new Elevador(totalAndares);

        System.out.println("\nComandos:");
        System.out.println("subir, descer, abrir, fechar, status, sair\n");

        String comando;
        do {
            System.out.print("> ");
            comando = scanner.nextLine().trim().toLowerCase();

            switch (comando) {
                case "subir":
                    elevador.subir();
                    break;
                case "descer":
                    elevador.descer();
                    break;
                case "abrir":
                    elevador.abrirPorta();
                    break;
                case "fechar":
                    elevador.fecharPorta();
                    break;
                case "status":
                    System.out.println("Andar atual: " + elevador.getAndarAtual());
                    System.out.println("Porta: " + (elevador.isPortaAberta() ? "aberta" : "fechada"));
                    break;
                case "sair":
                    System.out.println("Encerrando");
                    break;
                default:
                    System.out.println("Inválido");
            }
        } while (!comando.equals("sair"));

        scanner.close();
    }
}