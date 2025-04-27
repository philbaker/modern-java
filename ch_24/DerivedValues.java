class Elmo4 {
    int age;

    int nextAge() {
        return age + 1;
    }
}

void main() {
    Elmo4 elmo4 = new Elmo4();
    // Elmo4@61832929

    elmo4.age = 3;

    System.out.print("Elmo is " + elmo4.age + " right now,");
    System.out.print("but next year Elmo will be " + elmo4.nextAge());
    // Elmo is 3 right now, but next year Elmo will be 4
}
