import java.util.Scanner;

public class Options extends Product{
    Scanner input=new Scanner(System.in);

    double accountBalance = 1.0; //customer balance

    //customer choice
    public void select(){
        System.out.println("Enter product number : ");
        int productNumber = input.nextInt();

        switch (productNumber) {
            case 1:
                price = productList[0];
                break;
            case 2:
                price = productList[1];
                break;
            case 3:
                price = productList[2];
                break;
            case 4:
                price = productList[3];
                break;
            case 5:
                price = productList[4];
                break;
            case 6:
                price = productList[5];
                break;
            case 7:
                price = productList[6];
                break;
            default:
                System.out.println("Invalid number! Please enter valid number. ");
        }
    }

        // if the balance is insufficient
    public void balance() {
        if (price > accountBalance) {
            System.out.println("You have insufficient balance!\n" +
                    "Your balance: " + accountBalance + "\n" +
                    "To load money ==> 1\n" +
                    "Quit ==> Q");
            String choice = input.next().substring(0, 1);
            if (choice.equals("1")) {
                System.out.println("Enter the amount you want to load : ");
                double loadAmount = input.nextDouble();
                accountBalance = accountBalance + loadAmount;
                if (price <= accountBalance) {
                    purchase();
                } else {
                    balance();
                }
            } else if (choice.equalsIgnoreCase("Q")) {
                System.out.println("Logged out...\n" +
                        "\t\tThank you for choosing us :)");
            }
        }
    }

    public void purchase() {
        if(accountBalance >= price){
            System.out.println("If you confirm the purchase ==> 1\n" +
                               "If you want to cancel ==> Q");
            String  choice = input.next();
            if (choice.equals("1")){
                do {
                    if (choice.equalsIgnoreCase("1")) {
                        accountBalance = accountBalance - price;
                        System.out.println("Purchase successful\n" +
                                           "If you want to buy another product ==> 1\n" +
                                           "If you want to quit==> Q");
                        String choice2 = input.next().substring(0, 1);
                        if (choice2.equalsIgnoreCase("1")) {
                            toString1();
                            select();
                            purchase();
                        } else if (choice2.equalsIgnoreCase("Q")) {
                            break;
                        }
                    }
                } while (choice.equalsIgnoreCase("Q"));
                    System.out.println("Logged out...\n" +
                            "\t\tThank you for choosing us :)");

            } else if (choice.equalsIgnoreCase("q")) {
                System.out.println("Logged out...\n" +
                                   "\t\tThank you for choosing us :)");
            }
        } else
            balance();
    }

}

