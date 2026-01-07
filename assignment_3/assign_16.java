
/* Create a Player class and find top scorer and average score */
import java.util.*;

class Player {
    String name;
    int score;

    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Player[] p = new Player[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter player name and score");
            p[i] = new Player();
            p[i].name = sc.next();
            p[i].score = sc.nextInt();
        }
        int top = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += p[i].score;
            if (p[i].score > p[top].score) {
                top = i;
            }
        }
        double avg = (double) sum / n;
        System.out.println("Top Scorer: " + p[top].name + " " + p[top].score);
        System.out.println("Average Score: " + avg);
        sc.close();
    }
}
