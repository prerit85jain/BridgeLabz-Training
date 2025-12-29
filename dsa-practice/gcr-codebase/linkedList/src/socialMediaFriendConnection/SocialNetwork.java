package socialMediaFriendConnection;


class SocialNetwork {
    private User head = null;

    public void addUser(User newUser) {
        if (head == null) {
            head = newUser;
        } else {
            User temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
        System.out.println("User added: " + newUser.name);
    }

    private User findUserByID(int userID) {
        User temp = head;
        while (temp != null) {
            if (temp.userID == userID)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public void addFriendConnection(int userID1, int userID2) {
        User u1 = findUserByID(userID1);
        User u2 = findUserByID(userID2);

        if (u1 == null || u2 == null || userID1 == userID2) {
            System.out.println("Invalid user(s) for friendship.");
            return;
        }

        if (!u1.friendIDs.contains(userID2)) u1.friendIDs.add(userID2);
        if (!u2.friendIDs.contains(userID1)) u2.friendIDs.add(userID1);

        System.out.println("Friend connection added between " + u1.name + " and " + u2.name);
    }

    public void removeFriendConnection(int userID1, int userID2) {
        User u1 = findUserByID(userID1);
        User u2 = findUserByID(userID2);

        if (u1 == null || u2 == null) {
            System.out.println("Invalid user(s).");
            return;
        }

        u1.friendIDs.remove(Integer.valueOf(userID2));
        u2.friendIDs.remove(Integer.valueOf(userID1));

        System.out.println("Friend connection removed between " + u1.name + " and " + u2.name);
    }

    public void displayFriends(int userID) {
        User user = findUserByID(userID);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("Friends of " + user.name + ":");
        for (int friendID : user.friendIDs) {
            User friend = findUserByID(friendID);
            if (friend != null) {
                System.out.println("-> " + friend.name + " (ID: " + friend.userID + ")");
            }
        }
    }

    public void findMutualFriends(int userID1, int userID2) {
        User u1 = findUserByID(userID1);
        User u2 = findUserByID(userID2);

        if (u1 == null || u2 == null) {
            System.out.println("Invalid user(s).");
            return;
        }

        System.out.println("Mutual Friends between " + u1.name + " and " + u2.name + ":");
        boolean found = false;
        for (int id1 : u1.friendIDs) {
            if (u2.friendIDs.contains(id1)) {
                User mutual = findUserByID(id1);
                if (mutual != null) {
                    System.out.println("-> " + mutual.name + " (ID: " + mutual.userID + ")");
                    found = true;
                }
            }
        }
        if (!found) System.out.println("No mutual friends found.");
    }

    public void searchUser(String keyword) {
        User temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(keyword) || String.valueOf(temp.userID).equals(keyword)) {
                System.out.println("User Found: ID = " + temp.userID + ", Name = " + temp.name + ", Age = " + temp.age);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No user found with keyword: " + keyword);
        }
    }

    public void countAllFriends() {
        User temp = head;
        System.out.println("Friend Count for Each User:");
        while (temp != null) {
            System.out.println(temp.name + " (ID: " + temp.userID + ") has " + temp.friendIDs.size() + " friend(s).");
            temp = temp.next;
        }
    }

    public void displayAllUsers() {
        System.out.println("All Registered Users:");
        User temp = head;
        while (temp != null) {
            System.out.println("-> " + temp.name + " (ID: " + temp.userID + ", Age: " + temp.age + ")");
            temp = temp.next;
        }
    }
}