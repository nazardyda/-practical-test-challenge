import java.util.List;

public interface IDisplayee {
      void displayListOfUserProductsByUserId(List<List<Product>> productBuyList, int idu);
      void displayListOfUsersThatBoughtProductByProductId(List<List<User>> userBuyList,int idp);
}
