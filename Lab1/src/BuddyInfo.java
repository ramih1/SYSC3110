public class BuddyInfo {

    private String name;

    public BuddyInfo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        BuddyInfo amal =  new BuddyInfo("Amal");

        System.out.println("Hello, " +  amal.getName() + "!");
    }
}
