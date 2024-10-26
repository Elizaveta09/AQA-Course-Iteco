package part5.task2;

public class Buyer {

    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private String CreditCard;
    private int BankAccount;

    public String getAddress() {
        return address;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getCreditCard() {
        return CreditCard;
    }

    public int getBankAccount() {
        return BankAccount;
    }

    public String getName() {
        return name;
    }

    public Buyer(String surname, String name, String patronymic, String address, String CreditCard, int BankAccount){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.CreditCard = CreditCard;
        this.BankAccount = BankAccount;
    }
}
