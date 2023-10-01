import java.util.Arrays;

public class Task7 {
    public static void changeValue(Integer[] value) {
        value = new Integer[] {1, 2};
    }
    public static void main (String[]args){
        Integer [] value = new Integer[] {3, 4};
        System.out.println("Start value - " + Arrays.toString(value));
        changeValue(value);
        System.out.println("Nev value - " + Arrays.toString(value));
        }
    }