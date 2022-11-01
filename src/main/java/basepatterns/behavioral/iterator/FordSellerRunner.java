package basepatterns.behavioral.iterator;

public class FordSellerRunner {
    public static void main(String[] args) {
        String duties[] = {
                "Make calls",
                "Sell cars",
                "prepare reposts"
        };

        FordSeller fordSeller = new FordSeller("Bob", duties);

        Iterator iterator = fordSeller.getIterator();

        System.out.println("Seller: " + fordSeller.getName());
        System.out.println("Duties: ");
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }




    }
}
