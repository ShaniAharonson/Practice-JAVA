package AllData;

import java.time.LocalDateTime;
import java.util.Objects;

public class Reminder implements Comparable{
    public Reminder(String text, LocalDateTime expiration, Urgency urgency, Boolean isPoped) {
        this.text = text;
        this.expiration = expiration;
        this.urgency = urgency;
        this.isPoped = true;
    }

    public Reminder(String text, LocalDateTime expiration, Urgency urgency) {
        this(text,expiration,urgency,false);
    }
    public Reminder(String text, LocalDateTime expiration, Boolean isPoped) {
        this(text,expiration, Urgency.normal, isPoped);
    }
    public Reminder(String text, Urgency urgency, Boolean isPoped) {
        this(text, LocalDateTime.now(), urgency, isPoped);
    }
    @Override
    public int compareTo(Object o) {
        if (o instanceof Reminder){
            Reminder other = (Reminder) o;
            return this.expiration.compareTo(other.expiration);
        }
        return -1;
    }

    @Override
    public boolean equals(Object o) {
        Reminder reminder = (Reminder) o;
        return Objects.equals(text, reminder.text) && Objects.equals(expiration, reminder.expiration) && urgency == reminder.urgency && Objects.equals(isPoped, reminder.isPoped);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, expiration, urgency, isPoped);
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
        return isPoped;
    }

    public void setPoped(Boolean poped) {
        isPoped = poped;
    }

    private String text;
    private LocalDateTime expiration;
    private Urgency urgency;
    private Boolean isPoped;
}
