package day51;

public class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Person otherPerson) {
        if ((this.name.length()-1)> otherPerson.name.length()-1) {
            return 1;
        } else if ((this.name.length()-1)< otherPerson.name.length()-1) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
