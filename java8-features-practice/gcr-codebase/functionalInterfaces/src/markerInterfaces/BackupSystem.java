package markerInterfaces;

interface BackupSerializable {
}

class UserData implements BackupSerializable {

	 private String username;
	 private int age;
	
	 public UserData(String username, int age) {
	     this.username = username;
	     this.age = age;
	 }
	
	 public String toString() {
	     return "UserData [username=" + username + ", age=" + age + "]";
	 }
}

class TransactionData implements BackupSerializable {

	 private int transactionId;
	 private double amount;
	
	 public TransactionData(int transactionId, double amount) {
	     this.transactionId = transactionId;
	     this.amount = amount;
	 }
	
	 public String toString() {
	     return "TransactionData [transactionId=" + transactionId + ", amount=" + amount + "]";
	 }
}

class TempCache {

	 private String cacheInfo;
	
	 public TempCache(String cacheInfo) {
	     this.cacheInfo = cacheInfo;
	 }
	
	 public String toString() {
	     return "TempCache [cacheInfo=" + cacheInfo + "]";
	 }
}

class BackupProcessor {

 public static void backup(Object obj) {

     if (obj instanceof BackupSerializable) {
         System.out.println("Backing up object: " + obj);
     } else {
         System.out.println("Object NOT eligible for backup: " + obj);
     }
 }
}

public class BackupSystem {

 public static void main(String[] args) {

     UserData user = new UserData("Alice", 25);
     TransactionData transaction = new TransactionData(101, 5000.75);
     TempCache temp = new TempCache("Session Cache");

     BackupProcessor.backup(user);
     BackupProcessor.backup(transaction);
     BackupProcessor.backup(temp);
 }
}
