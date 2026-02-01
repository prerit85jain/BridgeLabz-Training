package smartLibraryManagementSys;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {
    private static LibraryCatalog instance;
    private List<Observer> observers=new ArrayList<>();

    public static synchronized LibraryCatalog getInstance(){
        if(instance==null){
            instance=new LibraryCatalog();
        }
        return instance;
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void notifyObserver(String message){
        for(Observer observer:observers){
            observer.update(message);
        }
    }

    public void addBook(Book book){
        notifyObserver("Book added: "+book.getTitle());
    }
}