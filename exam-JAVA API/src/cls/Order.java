package cls;

import java.util.Calendar;
import java.util.Objects;

public class Order implements Comparable<Order> {
    private Calendar readyOn;
    private String text;
    private boolean important;
    private boolean popped;

    public Order(Calendar readyOn, String text, boolean important, boolean popped) {
        setReadyOn(readyOn);
        setText(text);
        setImportant(important);
        setPopped(popped);
    }


    public Order() {
        this(null,"",false,false);
    }

    public Calendar getReadyOn() {
        return readyOn;
    }

    public void setReadyOn(Calendar readyOn) {
        this.readyOn = readyOn;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isImportant() {
        return important;
    }

    public void setImportant(boolean important) {
        this.important = important;
    }

    public boolean isPopped() {
        return popped;
    }

    public void setPopped(boolean popped) {
        this.popped = popped;
    }

    @Override
    public int compareTo(Order o) {
        return this.readyOn.compareTo(o.readyOn);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return important == order.important && popped == order.popped && Objects.equals(readyOn, order.readyOn) && Objects.equals(text, order.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(readyOn, text, important, popped);
    }

    @Override
    public String toString() {
        return "Order{" +
                "readyOn=" + readyOn.getTime() +
                ", text='" + text + '\'' +
                ", important=" + important +
                ", poped=" + popped +
                '}';
    }
}
