package markerInterfaces;

interface SensitiveData {
}

class CustomerDetails implements SensitiveData {

 private String name;
 private String ssn;

 public CustomerDetails(String name, String ssn) {
     this.name = name;
     this.ssn = ssn;
 }

 public String toString() {
     return "CustomerDetails [name=" + name + ", ssn=" + ssn + "]";
 }
}

class BankAccount implements SensitiveData {

 private String accountNumber;
 private double balance;

 public BankAccount(String accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 public String toString() {
     return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + "]";
 }
}

class ProductInfo {

 private String productName;

 public ProductInfo(String productName) {
     this.productName = productName;
 }

 public String toString() {
     return "ProductInfo [productName=" + productName + "]";
 }
}

class EncryptionService {

 public static void encrypt(Object obj) {

     if (obj instanceof SensitiveData) {
         System.out.println("Encrypting sensitive object: " + obj);
     } else {
         System.out.println("No encryption needed for: " + obj);
     }
 }
}

public class SensitiveDataEncryption {

 public static void main(String[] args) {

     CustomerDetails customer = new CustomerDetails("Alice", "SSN12345");
     BankAccount account = new BankAccount("ACC98765", 50000.0);
     ProductInfo product = new ProductInfo("Laptop");

     EncryptionService.encrypt(customer);
     EncryptionService.encrypt(account);
     EncryptionService.encrypt(product);
 }
}
