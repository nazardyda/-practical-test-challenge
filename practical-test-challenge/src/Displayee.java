import java.util.List;

public class Displayee implements IDisplayee {

    @Override
    public void displayListOfUserProductsByUserId(List<List<Product>> productBuyList, int idu) {
        System.out.println("User products : " + productBuyList.get(idu).get(idu));
    }

    @Override
    public void displayListOfUsersThatBoughtProductByProductId(List<List<User>> userBuyList, int idp) {
        System.out.println("Products bought by users : "+userBuyList.get(idp).get(idp));
    }
}
