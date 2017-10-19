/*
 * BenedikteEva
 * Lego Houses
 */
package BusinessLayer;

/**
 *
 * @author Ejer
 */
public class OdetailsEntity {

    OdetailsEntity(int order_id, int length, int width, int height, int forbandt) {
       
        this.order_id = order_id;
        this.height = height;
        this.width = width;
        this.length = length;
        this.bondtype = forbandt;
    }

 
   public OdetailsEntity() {
       
    }

    @Override
    public String toString() {
        return "Ordre_id: " + order_id + ", højde: " + height + ", bredde: " + width + ", længde: " + length + ", forbandt: " + bondtype + '.';
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

  

    int order_id;
    int height;
    int width;
    int length;
   int bondtype;

   
}
