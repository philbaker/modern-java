class LivingRaceCar {
    int cursedness;

    LivingRaceCar(int cursedness) {
        this.cursedness = cursedness;
    }
}

public class HRefIdentity {
    void main() {
        var carA = new LivingRaceCar(10);

        // Car B is a reference to Car A
        var carB = carA;

        // Car C is a distinct object with its own identity
        var carC = new LivingRaceCar(10);

        System.out.println("A: " + carA.hashCode());
        // A: 758013696

        System.out.println("B: " + carB.hashCode());
        // B: 758013696

        System.out.println("C: " + carC.hashCode());
        // C: 1106131243

        // Identity is also what the default .equals implementation is based off of
        // If two variables reference the same object then .equals will return true

        System.out.println("A.equals(A): " + carA.equals(carA));
        // A.equals(A): true

        System.out.println("A.equals(B): " + carA.equals(carB));
        // A.equals(B): true

        System.out.println("A.equals(C): " + carA.equals(carC));
        // A.equals(C): false

        System.out.println("B.equals(A): " + carB.equals(carA));
        // B.equals(A): true

        System.out.println("B.equals(B): " + carB.equals(carB));
        // B.equals(B): true

        System.out.println("B.equals(C): " + carB.equals(carC));
        // B.equals(C): false

        System.out.println("C.equals(A): " + carC.equals(carA));
        // C.equals(A): false

        System.out.println("C.equals(B): " + carC.equals(carB));
        // C.equals(B): false

        System.out.println("C.equals(C): " + carC.equals(carC));
        // C.equals(C): true
    }
}
