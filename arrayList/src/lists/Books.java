package lists;

public class Books {
    private String title;
    private int iban;

    public Books(String title, int iban) {
       setTitle(title);
       setIban(iban);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIban() {
        return iban;
    }

    public void setIban(int iban) {
        this.iban = iban;
    }
}
