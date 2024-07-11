package cls;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Reminder implements Comparable<Reminder>{
    private String text;
    private LocalDateTime expiration;
    private Urgency urgency;
    private Boolean isPopped;

    public Reminder(){
        this("",LocalDateTime.now(),Urgency.Normal,false);
    }
    public Reminder(String text, LocalDateTime expiration, Urgency urgency, Boolean isPoped) {
        this.text = text;
        this.expiration = expiration;
        this.urgency = urgency;
        this.isPopped = isPoped;
    }

    public Reminder(String text, LocalDateTime expiration, Urgency urgency, boolean isPopped) {
        this.text = text;
        this.expiration = expiration;
        this.urgency = urgency;
        this.isPopped = isPopped;
    }

    public Reminder(String text, LocalDateTime expiration, Urgency urgency) {
        this(text, expiration, urgency, false);
    }

    public Reminder(String text, LocalDateTime expiration) {
        this(text, expiration, Urgency.Normal, false);
    }

    public Reminder(String text, Urgency urgency) {
        this(text, LocalDateTime.now(), urgency, false);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getExpiration() {
        return expiration;
    }

    public void setExpiration(LocalDateTime expiration) {
        this.expiration = expiration;
    }

    public Urgency getUrgency() {
        return urgency;
    }

    public void setUrgency(Urgency urgency) {
        this.urgency = urgency;
    }

    public Boolean getPoped() {
        return isPopped;
    }

    public void setPoped(Boolean poped) {
        isPopped = poped;
    }

    @Override
    public int compareTo(Reminder o) {
        return this.getExpiration().compareTo(o.getExpiration());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reminder reminder = (Reminder) o;
        return Objects.equals(text, reminder.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, expiration, urgency, isPopped);
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "text='" + text + '\'' +
                ", expiration=" + expiration +
                ", urgency=" + urgency +
                ", isPopped=" + isPopped +
                '}';
    }
}
