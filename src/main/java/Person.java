import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Person {
    private int id;
    private String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //O(n*k)
    static void order(List<Person> persons, int[] ids){
        ArrayList<Person> temp = new ArrayList<>(persons.size());
        for (int id: ids) {
            for (Person person :persons) {
                if (person.id == id){
                    temp.add(person);
                }
            }
        }
        persons.removeAll(temp);
        persons.addAll(0,temp);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}



