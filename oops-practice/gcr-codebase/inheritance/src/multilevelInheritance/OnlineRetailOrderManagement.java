package multilevelInheritance;
//import java.util.Date;
public class OnlineRetailOrderManagement {

	class Order {
	    protected String orderId;
	    protected String orderDate;

	    public Order(String orderId, String orderDate) {
	        this.orderId = orderId;
	        this.orderDate = orderDate;
	    }

	    public String getOrderStatus() {
	        return "Order placed.";
	    }

	    public void displayOrderInfo() {
	        System.out.println("Order ID: " + orderId);
	        System.out.println("Order Date: " + orderDate);
	        System.out.println("Status: " + getOrderStatus());
	    }
	}

	class ShippedOrder extends Order {
	    protected String trackingNumber;

	    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
	        super(orderId, orderDate);
	        this.trackingNumber = trackingNumber;
	    }

	    @Override
	    public String getOrderStatus() {
	        return "Order shipped.";
	    }

	    @Override
	    public void displayOrderInfo() {
	        super.displayOrderInfo();
	        System.out.println("Tracking Number: " + trackingNumber);
	    }
	}

	class DeliveredOrder extends ShippedOrder {
	    private String deliveryDate;

	    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
	        super(orderId, orderDate, trackingNumber);
	        this.deliveryDate = deliveryDate;
	    }

	    @Override
	    public String getOrderStatus() {
	        return "Order delivered.";
	    }

	    @Override
	    public void displayOrderInfo() {
	        super.displayOrderInfo();
	        System.out.println("Delivery Date: " + deliveryDate);
	        System.out.println("Final Status: " + getOrderStatus());
	        System.out.println("------------------------------");
	    }
	}
	
    public static void main(String[] args) {
    	OnlineRetailOrderManagement orom = new OnlineRetailOrderManagement();
	    Order order = orom.new Order("O12345", "2025-07-02");
	    ShippedOrder shippedOrder = orom.new ShippedOrder("O12346", "2025-07-01", "TRK123456");
	    DeliveredOrder deliveredOrder = orom.new DeliveredOrder("O12347", "2025-06-30", "TRK654321", "2025-07-02");

	    System.out.println("Order Details:");
	    order.displayOrderInfo();

	    System.out.println("\nShipped Order Details:");
	    shippedOrder.displayOrderInfo();

	    System.out.println("\nDelivered Order Details:");
	    deliveredOrder.displayOrderInfo();
    }
}

