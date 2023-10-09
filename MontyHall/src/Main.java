import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    
    }

    public static void menu(){

        Scanner ler = new Scanner(System.in);
        int portaEscolhida, portaVazia, portaPremiada;
        String trocarPorta;

        do{
            System.out.println("********* PORTA DA ESPERANÇA *********");
            System.out.println("\n Seja bem vindo a este jogo, escolha uma das portas abaixo:");
            System.out.println("[1] PORTA A ");
            System.out.println("[2] PORTA B ");
            System.out.println("[3] PORTA C ");
            System.out.println("[0] Sair do jogo");
            portaEscolhida = ler.nextInt();


            Random rnd = new Random();
            portaVazia = rnd.nextInt(3)+1;
            portaPremiada = rnd.nextInt(3)+1;

            //abrindo a porta vazia:
            System.out.println("A porta " + portaVazia + " está vazia");
            // opção de trocar de porta:
            System.out.println("Deseja mudar de porta? Digite [S] Sim ou [N] Não?");
            trocarPorta = ler.next();
            String yes = "S";
            String no = "N";

            //colocando a resposta em maiúscula para comparação
            trocarPorta = trocarPorta.toUpperCase();

            // condicional se o usuário for trocar a porta
            if(trocarPorta.equals(no)){
                if(portaEscolhida == portaPremiada){
                    System.out.println("Parabéns, você ganhou!");
                }else
                    System.out.println("Você perdeu, a Porta Premiada é a " + portaPremiada);
                    portaEscolhida = 0; // forçando o encerramento do programa (condicional do while)
            }else if (trocarPorta.equals(yes))
                System.out.println("Faça uma nova escolha: ");

        }while (portaEscolhida != 0);
    }
}
