public class App2 {
    public static void main(String[] args) {
        OnlineStoreAccount2 johnSmith = new OnlineStoreAccount2.Builder(1L)
                .withName("JohnSmith")
                .withAddress("Oxford Lane 35A")
                .withBudget(100L)
                .withDiscount(2L)
                .build();
       

        System.out.println(johnSmith.getName());
       
    }
}
