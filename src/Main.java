public class Main {
    public static void changeValue(int value) {
        value = 22;
    }
    public static void changeValue2(Integer value2) {
        value2 = 22;
    }
    public static void main (String[]args){
        System.out.println("Память");
        System.out.println("___________________");
        System.out.println("Задача №5");
        int value = 33;
        changeValue(value);
        System.out.println(value);
        Integer value2 = 33;
        changeValue2(value2);
        System.out.println(value2);

        }
    }