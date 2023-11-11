public class Person {
    private String name;
    private String surname;
    // CONSTRUCTOR
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    //GETTER AND SETTER

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
