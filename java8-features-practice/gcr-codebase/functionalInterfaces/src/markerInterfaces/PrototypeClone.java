package markerInterfaces;

class VehicleModel implements Cloneable {

 private String modelName;
 private int speed;

 public VehicleModel(String modelName, int speed) {
     this.modelName = modelName;
     this.speed = speed;
 }

 @Override
 protected Object clone() throws CloneNotSupportedException {
     return super.clone();
 }

 public void display() {
     System.out.println("Model: " + modelName + ", Speed: " + speed);
 }
}

public class PrototypeClone {

 public static void main(String[] args) {

     try {
         VehicleModel original = new VehicleModel("Tesla X", 120);

         System.out.println("Original Object:");
         original.display();

         VehicleModel cloned = (VehicleModel) original.clone();

         System.out.println("Cloned Object:");
         cloned.display();

     } catch (CloneNotSupportedException e) {
         System.out.println("Cloning not supported!");
     }
 }
}
