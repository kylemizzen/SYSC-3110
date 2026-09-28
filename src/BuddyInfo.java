public class BuddyInfo {

    private String name;

    public BuddyInfo(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tina");

        System.out.println("Hello " + buddy.name);
    }
}
