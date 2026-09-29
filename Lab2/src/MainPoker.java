public class MainPoker {

    public static void main(String[] args) {

        Hand h1 = new Hand("6C 7C 8C 9C TC");
        Hand h2 = new Hand("9D 9H 9S 9C 7D");
        Hand h3 = new Hand("TD TC TH 7C 7D");
        Hand h4 = new Hand("2C 3C 4D 6D 2D");
        Hand h5 = new Hand("JD 3C JH AD 3S");

        System.out.println("Hand 1: " + h1.kind());
        System.out.println("Hand 2: " + h2.kind());
        System.out.println("Hand 3: " + h3.kind());
        System.out.println("Hand 4: " + h4.kind());
        System.out.println("Hand 5: " + h5.kind());

        Poker poker = new Poker();

        poker.addHand(h1);
        poker.addHand(h2);
        poker.addHand(h3);
        poker.addHand(h4);
        poker.addHand(h5);

        System.out.println("Best hand: " + poker.bestHand().kind());
    }
}
