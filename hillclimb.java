import java.util.Random;

public class HillClimbing {
    public static void main(String[] args) {
        Random rand = new Random();
        int current = rand.nextInt(100); 
        int max = current; 

        while (true) {
            int next = current + rand.nextInt(3) - 1; 
            if (next > max) {
                max = next;
                current = next;
            } else {
                break; 
            }
        }
        System.out.println("Maximum value found: " + max);
    }
}
