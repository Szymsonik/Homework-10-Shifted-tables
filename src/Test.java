import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] tablica = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ShiftElements shifter = new ShiftElements();
        System.out.println(Arrays.toString(tablica));
        System.out.println(Arrays.toString(shifter.shift(null, 4)));


    }
}
