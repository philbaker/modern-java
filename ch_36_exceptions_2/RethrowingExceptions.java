public class RethrowingExceptions {
    void dream() throws Exception {
        throw new Exception("Oh no");
    }

    void sleep() throws Exception {
        try {
            dream();
        } catch (Exception e) {
            System.out.println("Something went wrong while dreaming");
            throw e;
        }
    }


    // Rethrowing an exception allows you to 'wrap' checked exceptions into 
    // unchecked ones
    void dream2() throws Exception {
        throw new Exception("Oh no");
    }

    void sleep2() {
        try {
            dream2();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    void main() {
        // sleep();
        // Something went wrong while dreaming
        //    Exception java.lang.Exception: Oh no

        sleep2();
        // Exception java.lang.RuntimeException: java.lang.Exception: Oh no
        //    Caused by: java.lang.Exception: Oh no
    }
}
