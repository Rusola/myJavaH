package sergey.wh1_get_month;

public class Month {
    private String month_name;
    private int number_of_days;
    private int number_working_days;

    public Month(String month_name, int number_of_days, int number_working_days) {
        this.month_name = month_name;
        this.number_of_days = number_of_days;
        this.number_working_days = number_working_days;
    }

    public String getMonth_name() {
        return month_name;
    }

    public void setMonth_name(String month_name) {
        this.month_name = month_name;
    }

    public int getNumber_of_days() {
        return number_of_days;
    }

    public void setNumber_of_days(int number_of_days) {
        this.number_of_days = number_of_days;
    }

    public int getNumber_working_days() {
        return number_working_days;
    }

    public void setNumber_working_days(int number_working_days) {
        this.number_working_days = number_working_days;
    }
}
