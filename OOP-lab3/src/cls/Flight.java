package cls;

import java.time.LocalDateTime;

public class Flight {
    private String code;
    private String company;
    private String from;
    private String to;
    private LocalDateTime when = LocalDateTime.now();

    public Flight(String code, String company, String from, String to) {
        this.code = code;
        this.company = company;
        this.from = from;
        this.to = to;
    }

    public Flight(String code, String company, String from, String to, LocalDateTime when) {
        this.code = code;
        this.company = company;
        this.from = from;
        this.to = to;
        this.when = when;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public LocalDateTime getWhen() {
        return when;
    }

    public void setWhen(LocalDateTime when) {
        this.when = when;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "code='" + code + '\'' +
                ", company='" + company + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", when=" + when +
                '}';
    }
}
