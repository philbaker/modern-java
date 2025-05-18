record Person(String name, int age) {}

void main() {
    // This call to new Person(...) matches up with the record declaration
    var person = new Person("Ancient Dragon Man", 2000);
    System.out.println(person);
    // Person[name=Ancient Dragon Man, age=2000]
}
