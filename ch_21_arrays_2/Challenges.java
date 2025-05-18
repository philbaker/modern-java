public class Challenges {
    void challengeOne() {
        String[] empty = new String[0];
        System.out.println(empty.length);
        // 0
    }

    void challengeTwo() {
        Double[] prices = new Double[5];

        for (int i = 0; i < prices.length; i++) {
            prices[i] = (i + 1.0);
        }

        for (int i = 0; i < prices.length; i++) {
            double price = prices[i];
            System.out.println(price);
        }
    }

    void challengeThree() {
        char[] sandwich = new char[14];

        char[] newMessage = new char[] {'e', 'g', 'g', ' ', 'a', 'n', 'd', ' ', 'c', 'h', 'e', 'e', 's', 'e'};
        for (int i = 0; i < sandwich.length; i++) {
            sandwich[i] = newMessage[i];
        }

        System.out.println(sandwich);
    }

    void challengeFour() {
        char[] triangle = new char[8];

        char[] newMessage = new char[] {'*', '\n', '*', '*', '\n', '*', '*', '*'};
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = newMessage[i];
        }

        System.out.println(triangle);
    }


    char[] buildTriangle(int height) {
        int total = (height * (height + 1)) / 2 + height;
        char[] result = new char[total];

        int index = 0;
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                result[index++] = '*';
            }
            result[index++] = '\n';
        }

        return result;
    }

    void challengeFive() {
        System.out.print(buildTriangle(3));
        System.out.println("------------");
        System.out.print(buildTriangle(5));
        System.out.println("------------");
        System.out.print(buildTriangle(2));
    }
}
