// Static fields are controversial - specifically static fields which can change
class Counter {
    static int value = 0;
}

// Using static fields for constants is less controversial
class Constants {
    static final int DAYS_IN_A_WEEK = 7; 
}
