public class Task10 {
    public static void changeValue(Person person) {
        person.setName("Ilya");
        person.setSurname("Lagutenko");
    }
    public static void main (String[]args){
        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println("Start value - " + person);
        changeValue(person);
        System.out.println("New value - " + person);
        }
    }