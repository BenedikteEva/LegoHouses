/*
 * BenedikteEva
 * Lego Houses
 */
package BusinessLayer;

/**
 *
 * @author Ejer
 */
public class OrderData {

    @Override
    public String toString() {
        return ""+username+"'s  Ordre nr: "+order_id+" -- længde:  "+length+"  bredde:  "+width+"  højde:  "+height+"  forbandt:  "+bondtype+"  status:  "+shipped;
    }

  

    public OrderData(int user_id, String username, int order_id, int height, int width, int length, int bondtype,  String shipped) {
       this.user_id = user_id;
        this.order_id = order_id;
        this.height = height;
        this.width = width;
        this.length = length;
        this.bondtype = bondtype;
        this.username = username;
        this.shipped = shipped;
    }

    public String getShipped() {
        return shipped;
    }

    public void setShipped(String shipped) {
        this.shipped = shipped;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBondtype() {
        return bondtype;
    }

    public void setBondtype(int bondtype) {
        this.bondtype = bondtype;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(String adminStatus) {
        this.adminStatus = adminStatus;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
private int user_id;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    private int order_id;
    private int height;
    private int width;
    private int length;
    private int bondtype;
    private String email;
    private String adminStatus;
    private String username;
    private String shipped;
}
