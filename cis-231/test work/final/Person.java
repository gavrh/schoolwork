import java.util.*;

public class Person {

    // a
    private String name;
    private int id;

    // b
    public Person(String n, int i) {
        name = n;
        id = i;
    }

    // c
    public Person() {
        name = "Gavin";
        id = 0;
    }

    // d
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

    // e
    public void setName(String newName) {
        name = newName;
    }
    public void setId(int newId) {
        id = newId;
    }

    // f
    public String toString() {
        return id + " " + name;
    }


    public static Person lowestId(ArrayList<Person> persons) {
        Person lowestPerson = persons.get(0);
        Person currPerson;
        for (int i = 1; i < persons.size(); i++) {
            currPerson = persons.get(i);
            if (lowestPerson.getId() > currPerson.getId()) {
                lowestPerson = currPerson;
            }
        }
        return lowestPerson;
    }
}
