import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Player player = new Player();
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("" +
                    "\n1.Play" +
                    "\n2.Stop" +
                    "\n3.Next" +
                    "\n4.Prev" +
                    "\n5.Exit");

            String input = scan.next();

            switch (input){
                case "1":
                    System.out.println(player.getState().onPlay());
                    break;
                case "2":
                    System.out.println(player.getState().onLock());
                    break;
                case "3":
                    System.out.println(player.getState().onNext());
                    break;
                case "4":
                    System.out.println(player.getState().onPrevious());
                    break;
                default:
                    System.exit(1);
            }
        }
    }
}
