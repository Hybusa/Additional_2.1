import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(switchPlaces(5, 7)));
    }

    public static int[] switchPlaces(int first, int second) {

        first = first ^ second;
        second = first ^ second;
        first = first ^ second;

        return new int[]{first, second};
    }
}