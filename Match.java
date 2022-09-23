package BoxMatch;

public class Match {
    public static void main(String[] args) {
        Fighter ava = new Fighter("Ava",8,100);
        Fighter max = new Fighter("Max",13,85);

        Ring ring = new Ring(ava,max);
        ring.run();
    }
}
