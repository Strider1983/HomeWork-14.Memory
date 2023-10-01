public class Task6 {
    public static void changeValue(Integer value) {
        value = 22;
    }
    public static void main (String[]args){
        Integer value = 33;
        System.out.println("Start value - " + value);
        changeValue(value);
        System.out.println("New value - " + value);

        }
    }