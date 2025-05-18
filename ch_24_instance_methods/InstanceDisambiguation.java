class Elmo7 {
    int age;

    boolean isOlderThan(int age) {
        return this.age > age;
    }
}

void main() {
    Elmo7 elmo7 = new Elmo7();
    // Elmo7@53b32d7

    elmo7.age = 3;

    System.out.println(elmo7.isOlderThan(2));
    // true
}
