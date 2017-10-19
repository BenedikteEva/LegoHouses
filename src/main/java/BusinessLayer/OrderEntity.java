/*
 * BenedikteEva
 * Lego Houses
 */
package BusinessLayer;

/**
 *
 * @author Ejer
 */
public class OrderEntity {

  
    public OrderEntity(int orderid) {
      this.order_id = orderid;
    }

    public OrderEntity() {
       
    }

    public OrderEntity(int order_id, int user_id) {
     this.order_id = order_id;
        this.user_id = user_id;
    }



    @Override
    public String toString() {
        return "Ordrenr.: " + order_id + " brugernummer:" + user_id + ", status: " + shipped;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String isShipped() {
        return shipped;
    }

    public void setShipped(String shipped) {
        this.shipped = shipped;
    }

    public OrderEntity(int order_id, int user_id, String shipped) {
        this.order_id = order_id;
        this.user_id = user_id;
        this.shipped = shipped;
    }
    private int order_id;
    private int user_id;
    private String shipped;
    
}
