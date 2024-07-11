package cls;

public class Light {
    private Integer totalHours;
    private String color = "white";
    private Double cost = 19.99;

    public Light() {
        this(null,"white",19.99);
    }

    public Light(Integer totalHours, Double cost) {
        this.totalHours = totalHours;
        this.cost = cost;
    }

    public Light(Integer totalHours, String color) {
        this.totalHours = totalHours;
        this.color = color;
    }

    public Light(Integer totalHours, String color, Double cost) {
        this.totalHours = totalHours;
        this.color = color;
        this.cost = cost;
    }

    public Integer getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(Integer totalHours) {
        this.totalHours = totalHours;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Light{" +
                "totalHours=" + totalHours +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }
}
