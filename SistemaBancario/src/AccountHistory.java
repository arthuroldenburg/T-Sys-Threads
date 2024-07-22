import java.util.Date;

public class AccountHistory {
    public Date date;
    public String type;
    public Double value;

    public AccountHistory(Date date, String type, Double value) {
        this.date = date;
        this.type = type;
        this.value = value;
    }
}
