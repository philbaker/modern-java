package dungeon;

public class Skeleton {
    // If a class is public and has a default constructor (e.g. you don't specify
    // one) then the default constructor you get will be public

    public final int bones;

    // If the constructor is specified it will not be public by default
    // Skeleton() {
    //     this.bones = 206;
    // }

    public Skeleton() {
        this.bones = 206;
    }
}
