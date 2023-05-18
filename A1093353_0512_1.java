import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class A1093353_0512_1 {
    
static class DumplingShop {
    private static final int PORK_DUMPLING_STOCK = 5000;
    private static final int BEEF_DUMPLING_STOCK = 3000;
    private static final int VEGETABLE_DUMPLING_STOCK = 1000;
    private static final int MIN_DUMPLING_ORDER = 10;
    private static final int MAX_DUMPLING_ORDER = 50;

    private int porkDumplingStock;
    private int beefDumplingStock;
    private int vegetableDumplingStock;

    private final Object lock = new Object();

    public DumplingShop() {
        porkDumplingStock = PORK_DUMPLING_STOCK;
        beefDumplingStock = BEEF_DUMPLING_STOCK;
        vegetableDumplingStock = VEGETABLE_DUMPLING_STOCK;
    }

    public void serveCustomer(int numCustomers) {
        ExecutorService executor = Executors.newFixedThreadPool(numCustomers);

        for (int i = 1; i <= numCustomers; i++) {
            executor.execute(new Customer(i));
        }

        executor.shutdown();
    }

    private void placeOrder(String dumplingType, int numDumplings) {
        switch (dumplingType) {
            case "Pork":
                synchronized (lock) {
                    if (numDumplings <= porkDumplingStock) {
                        porkDumplingStock -= numDumplings;
                        System.out.println("Customer ordered " + numDumplings + " pork dumplings. Remaining pork dumplings: " + porkDumplingStock);
                    } else {
                        System.out.println("Customer ordered " + numDumplings + " pork dumplings, but there is not enough stock.");
                    }
                }
                break;
            case "Beef":
                synchronized (lock) {
                    if (numDumplings <= beefDumplingStock) {
                        beefDumplingStock -= numDumplings;
                        System.out.println("Customer ordered " + numDumplings + " beef dumplings. Remaining beef dumplings: " + beefDumplingStock);
                    } else {
                        System.out.println("Customer ordered " + numDumplings + " beef dumplings, but there is not enough stock.");
                    }
                }
                break;
            case "Vegetable":
                synchronized (lock) {
                    if (numDumplings <= vegetableDumplingStock) {
                        vegetableDumplingStock -= numDumplings;
                        System.out.println("Customer ordered " + numDumplings + " vegetable dumplings. Remaining vegetable dumplings: " + vegetableDumplingStock);
                    } else {
                        System.out.println("Customer ordered " + numDumplings + " vegetable dumplings, but there is not enough stock.");
                    }
                }
                break;
            default:
                System.out.println("Invalid dumpling type.");
                break;
        }
    }

    private class Customer implements Runnable {
        private final int customerId;
        private final Random random;

        public Customer(int customerId) {
            this.customerId = customerId;
            this.random = new Random();
        }

        @Override
        public void run() {
            int numDumplings = random.nextInt(MAX_DUMPLING_ORDER - MIN_DUMPLING_ORDER + 1) + MIN_DUMPLING_ORDER;
            String[] dumplingTypes = {"Pork", "Beef", "Vegetable"};
            String dumplingType = dumplingTypes[random.nextInt(dumplingTypes.length)];

            System.out.println("Customer " + customerId + " wants to order " + numDumplings + " " + dumplingType + " dumplings.");

            try {
                Thread.sleep(3000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            placeOrder(dumplingType, numDumplings);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        DumplingShop dumplingShop = new DumplingShop();
        dumplingShop.serveCustomer(5);

        
    }
}

    
}
