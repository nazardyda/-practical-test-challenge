import java.util.List;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private double amountOfMoney;

    public User() {
    }

    public User(int id, String firstName, String lastName, double amountOfMoney) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.amountOfMoney = amountOfMoney;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", amountOfMoney=" + amountOfMoney +
                '}' + "\n";
    }
    public static void buy(List<Product> productList, List<User> userList, int idp, int idu) {
        if (productList.get(idp).getPrice() < userList.get(idu).getAmountOfMoney() + 1) {
            userList.get(idu).setAmountOfMoney(userList.get(idu).getAmountOfMoney() - productList.get(idp).getPrice());
            System.out.println("Wow, you buy this " + productList.get(idp).getName());
            System.out.println("Your balance now - " + userList.get(idu).getAmountOfMoney());
        } else {
            System.out.println("Not enough money :(");
        }

    }
}
