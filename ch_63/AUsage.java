@interface Even {
}

@interface NumberWrapper {
}

@NumberWrapper
class EvenNumber {
    final @Even int x;

    EvenNumber(int x) {
        if (x % 2 != 0) {
            throw new IllegalArgumentException(Integer.toString(x));
        }
        this.x = x;
    }
}
