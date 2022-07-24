import java.util.*;

public class Dispatcher {



    /*public static void menu() {
        System.out.println("Make your choose");
        System.out.println("1. List of users : ");
        System.out.println("2. List of products : ");
        System.out.println("3. Buy products : ");
        System.out.println("4. Display list of user products by user id : ");
        System.out.println("5. Display list of users that bought product by product id : ");
        System.out.println("6. Exit");

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

    public static void displayListOfUserProductsByUserId(List<List<Product>> productBuyList, int idu) {

            System.out.println("User products : " + productBuyList.get(idu));

    }


    public static void displayListOfUsersThatBoughtProductByProductId(List<List<User>> userBuyList,int idp){

        System.out.println("Products bought by users : "+userBuyList.get(idp));

    }*/
    public static void main(String[] args) {
        Displayee displayee = new Displayee();
        Menu menu = new Menu();
        List<User> userList = new ArrayList<>();
        userList.add(new User(0,"Nazar","Dyda",150));
        userList.add(new User(1,"Bob","Stone",250));
        userList.add(new User(2,"Tom","Brown",350));
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(0,"brush",25));
        productList.add(new Product(1,"keyboard",250));
        productList.add(new Product(2,"watch",150));
        List<List<Product>> productBuyList = new ArrayList<>();
        List<Product> productsBought = new ArrayList<>();
        List<List<User>> userBuyList = new ArrayList<>();
        List<User> usersBought = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int idp;
        int idu;
        //int count;
        chooseMenuAgain:
        while( i<userList.size()) {
            //count =0;
            System.out.println("Current user id : " + userList.get(i).getId());
            menu.menu();
            //menu();
            System.out.println("Select number : ");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println(userList);
                    continue chooseMenuAgain;
                case 2:
                    System.out.println(productList);
                    continue chooseMenuAgain;
                case 3:

                    System.out.println("Write id of product which you want to buy : ");
                    idp = sc.nextInt();
                    User.buy(productList, userList, idp, i);
                   // buy(productList, userList, idp, i);
                    productsBought.add(productList.get(idp));
                    productBuyList.add(productsBought);
                    usersBought.add(userList.get(i));
                    userBuyList.add(usersBought);
                    //count++;
                    continue chooseMenuAgain;
                case 4 :
                        //System.out.println(productBuyList.get(i));
                        System.out.println("Choose your user by id : ");
                        idu = sc.nextInt();
                        if(idu > i-1  || idu < userList.size()+1) {
                            if (productBuyList.size() < 1 + idu || productBuyList.get(idu).size() < 1 + idu) {
                                System.out.println("You don't buy anything yet");
                            } else {
                                if (idu > i) {
                                    System.out.println("This user has not visited yet");
                                } else {
                                    displayee.displayListOfUserProductsByUserId(productBuyList, idu);
                                    //displayListOfUserProductsByUserId(productBuyList, idu);
                                }
                            }
                        }else{
                            System.out.println("Wrong number");
                        }
                    continue chooseMenuAgain;
                case 5:
                        //System.out.println(productBuyList.get(i));
                        System.out.println("Choose your product by id : ");
                        idp = sc.nextInt();
                        if(idp>i-1||idp<productList.size()+1) {
                            if (userBuyList.size() < 1 + idp || userBuyList.get(idp).size() < 1 + idp) {
                                System.out.println("Nobody has bought it yet");
                            } else {
                                if (idp > i) {
                                    System.out.println("This user has not buy it yet");
                                } else {
                                    displayee.displayListOfUsersThatBoughtProductByProductId(userBuyList, idp);
                                    //displayListOfUsersThatBoughtProductByProductId(userBuyList, idp);
                                }
                            }
                        }else{
                            System.out.println("Wrong number");
                        }
                        continue chooseMenuAgain;
                case 6:
                    System.out.println("See you soon");
                    i++;
                    continue chooseMenuAgain;
                default:
                    System.out.println("Wrong number");
                    continue chooseMenuAgain;
            }
        }
    }
}
