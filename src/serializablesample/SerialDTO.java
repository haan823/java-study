package serializablesample;

import java.io.Serializable;

public class SerialDTO implements Serializable {
    static final long serialVersionUID = 1L; //Data가 변경되면 serialVersionUID도 같이 변경하는 습관을 가져야 한다.
    private String bookName;
    transient private int bookOrder;
    private boolean bestSeller;
    private long soldPerDay;
    private String bookTypes = "IT";

    public SerialDTO(String bookName, int bookOrder, boolean bestSeller, long soldPerDay) {
        this.bookName = bookName;
        this.bookOrder = bookOrder;
        this.bestSeller = bestSeller;
        this.soldPerDay = soldPerDay;
    }

    @Override
    public String toString() {
        return "SerialDTO [bookName=" + bookName + ", bookOrder=" + bookOrder + ", bestSeller="
                + bestSeller + ", soldPerDay=" + soldPerDay
                + ", bookTypes=" + bookTypes + "]";
    }
}
