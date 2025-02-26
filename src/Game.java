import java.util.Scanner;
import java.util.Random;

public class Game {
  public static void main(String[] args) {
    clear();
    Random rand = new Random();
    Scanner ler = new Scanner(System.in);

    int tree = rand.nextInt(101);

    boolean loop = false;

    int vida = 7;

    int tent = 0;

    try {
      while(!loop) {
        if(tent < vida) {
          System.out.println("Você tem " + (vida - tent) + " tentativas");
          System.out.print("Digite um valor: ");
          int chute = ler.nextInt();
          tent += 1;
          clear();
          if(chute == tree) {
            if(tent == 1) {
              System.out.println("Parabéns, você achou com " + tent + " tentativa!");
            } else {
              System.out.println("Parabéns, você achou com " + tent + " tentativas!");
            }
            loop = true;
          }
          if(chute < tree){
            System.out.println("O marciano está em uma árvore de valor maior");
          }
          if(chute > tree){
            System.out.println("O marciano está em uma árvore de valor menor");
          }
          
        }else {
          clear();
          System.out.println("O marciano estava na árvore: " + tree);
          tree = rand.nextInt(101);
          loop = false;
          tent = 0;
        }
      }
    } catch (Exception e) {
      System.err.println("Erro, por favor digite um número inteiro! " + e);
    }
  }
  public final static void clear() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}
