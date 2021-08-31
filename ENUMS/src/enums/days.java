package enums;

public enum days {
    MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7);

   private int day_no;

    public int getDay_no() {
        return day_no;
    }

    public void setDay_no(int day_no) {
        this.day_no = day_no;
    }

    days(int day_no) {
        this.day_no = day_no;
    }
}
