public class Runner {
    public static void main(String[] args) {

        System.out.println("Welcome!");

        //Object of Product Class
        Product productList = new Product();
        productList.toString1();

        //Object of Options Class
        Options process = new Options();

        process.select();
        process.balance();
        process.purchase();

    }
}
