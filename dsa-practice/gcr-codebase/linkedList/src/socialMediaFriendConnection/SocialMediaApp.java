package socialMediaFriendConnection;

public class SocialMediaApp {
    public static void main(String[] args) {
        SocialNetwork sn = new SocialNetwork();

        sn.addUser(new User(1, "Alice", 23));
        sn.addUser(new User(2, "Bob", 25));
        sn.addUser(new User(3, "Charlie", 27));
        sn.addUser(new User(4, "Daisy", 22));

        sn.addFriendConnection(1, 2);
        sn.addFriendConnection(1, 3);
        sn.addFriendConnection(2, 3);
        sn.addFriendConnection(2, 4);

        sn.displayFriends(2);

        sn.findMutualFriends(1, 2);

        sn.removeFriendConnection(1, 2);
        sn.displayFriends(1);

        sn.searchUser("Charlie");
        sn.searchUser("4");

        sn.countAllFriends();

        sn.displayAllUsers();
    }
}
