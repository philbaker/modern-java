public class IntegerFromBase16String {
    void main() {
        String text = "C";

        int twelve = Integer.parseInt(text, 16);

        System.out.println(twelve);
        // 12

        // Integer.parseInt("0xC", 16);
        // Error

        System.out.println(Integer.decode("0xC"));
        // 12
        System.out.println(Integer.decode("0x19"));
        // 25
        System.out.println(Integer.decode("19"));
        // 19
    }
}
