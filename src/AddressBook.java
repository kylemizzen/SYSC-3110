import java.util.*;

public class AddressBook {
   private List<BuddyInfo> buddies;

   public AddressBook() {
       buddies = new ArrayList<BuddyInfo>();
   }

   public void addBuddy(BuddyInfo b){
       buddies.add(b);
   }

   public void removeBuddy(BuddyInfo b){
       buddies.remove(b);
   }

   public static void main(String[] args){
       BuddyInfo buddy = new BuddyInfo("Tina");
       AddressBook addressBook = new AddressBook();

       addressBook.addBuddy(buddy);
       addressBook.removeBuddy(buddy);
   }
}
