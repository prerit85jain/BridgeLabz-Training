package movieManagementSystem;

class Node {
    Movie movie;
    Node next;
    Node prev;

    Node(Movie movie) {
        this.movie = movie;
        this.next = null;
        this.prev = null;
    }
}