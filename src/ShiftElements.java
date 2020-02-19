public class ShiftElements {
    public int[] shift(int table[], int N) {
        if (table == null) {
            return null;
        } else if (N >= table.length || N <= 0) {
            return table;
        }
        int[] copy = new int[table.length];
        for (int i = 0; i < table.length - N; i++) {
            copy[i + N] = table[i];
        }
        for (int i = 0; i < N; i++) {
            copy[i] = table[table.length - N + i];
        }
        return copy;
    }
}