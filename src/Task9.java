import java.util.Arrays;

public class Task9 {
    public static void changeValue(Person person) {
        person = new Person("Ilya", "Lagutenko");
    }
    public static void main (String[]args){
        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println("Start value - " + person);
        changeValue(person);
        System.out.println("New value - " + person);
        }
    }