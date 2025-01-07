package OOP;


public class Main {
    public static void main (String[] args) {
        Person person = new Person("Long", 21);

        String name = person.getName();
        int age = person.getAge();

        System.out.println("Information: " + name + "; " + age);

        person.setAge(18);

        int newAge = person.getAge();

        System.out.println("Information: " + name + "; " + newAge);


    }

}
