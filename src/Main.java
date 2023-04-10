import java.util.Random;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int vector[] = {1,10,9,7,3,0};

        bogoSort(vector, 6);

        System.out.println("Ordenado:");
        System.out.println(Arrays.toString(vector));

    }

    public static boolean is_sorted(int[] vector, int n){
        while (--n >= 1) {
            if (vector[n] < vector[n - 1]){
                return false;
            }
        }
        return true;
    }

    public static void shuffle (int[] vector, int n) {
        int position, random;
        Random gerador = new Random();
        for (int i = 0; i < n; i++) {
            position = vector[i];
            random = (gerador.nextInt(n));
            random = random % n;
            vector[i] = vector[random];
            vector[random] = position;
        }
    }

    public static void bogoSort (int[] vector, int n) {
        while (!is_sorted(vector,n)){
            shuffle(vector,n);
        }
    }
}