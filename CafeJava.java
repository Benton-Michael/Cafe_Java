public class CafeJava {
    public static void main(String[] args) {
        // App variables

        // Lines of text that appear in the app
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.5;
        double lattePrice = 4.5;
        double cappucinoPrice = 5.5;

        // Customer name variables
        String customer1 = "Cindhuri";
        String customer2 = "Noah";
        String customer3 = "Sam";
        String customer4 = "Jimmy";

        // Order completion variables
        boolean isReayOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        // Test to display greeting with customer name
        System.out.println(generalGreeting + customer1);

        // Cindhuri ordered a coffee. Print to the console the correct status message, based on her order status.
        System.out.println(customer1 + pendingMessage);

        // Noah ordered a cappucino. Use an if statement to check the status of his order and print the correct status message. If it is ready, also print the message to display the total. Note: Outcomes may be different depending on what you assigned as the status.

        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
            System.out.println(displayTotalMessage + cappucinoPrice);
        }
        else {
            System.out.println.(customer2 + pendingMessage);
        }

        // Sam just ordered 2 lattes, print the message to display their total. Next, use an if statement to print the appropriate order status message. Change the isReady flag value from true to false or vice versa in order to test your control logic (if-statement).
        System.out.println(displayTotalMessage + lattePrice * 2);
        if (isReadyOrder3) {
            System.out.println(customer3 + readyMessage);
        }
        else {
            System.out.println(customer3 + pendingMessage);
        }

// Jimmy just realized he was charged for a coffee but had ordered a latte. Print the total message with the new calculated total (what he owes) to make up the difference.


// Try changing the price values for each drink and isReady flags (booleans), to test if all of your logic works, even when prices and statuses are changed.
        System.out.println(displayTotalMessage + (lattePrice - dripCoffeePrice));
    }
}
