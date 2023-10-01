public class Task5 {
    public static void changeValue(int value) {
        value = 22;
    }
    public static void main (String[]args){
        int value = 33;
        System.out.println("Start value - " + value);
        changeValue(value);
        System.out.println("New value - " + value);

        }
    }