package socialMediaFriendConnection;
import java.util.ArrayList;

class User {
    int userID;
    String name;
    int age;
    ArrayList<Integer> friendIDs;

    User next;

    public User(int userID, String name, int age) {
        this.userID = userID;
        this.name = name;
        this.age = age;
        this.friendIDs = new ArrayList<>();
        this.next = null;
    }
}