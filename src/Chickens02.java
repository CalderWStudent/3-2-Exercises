public class Chickens02 {
    public static void main(String[] args) {

        // Declare variables
        double eggPrice = 0.18;

        int numEggs = 0;
        double dailyAverage;
        double monthlyAverage;
        double monthlyProfit;

        // Monday
        numEggs += 100;

        // Tuesday
        numEggs += 121;

        // Wednesday
        numEggs += 117;

        dailyAverage = numEggs / 3.0;
        monthlyAverage = dailyAverage * 30.0;
        monthlyProfit = eggPrice * monthlyAverage;

        System.out.println("Daily Average:   " + dailyAverage);
        System.out.println("Monthly Average: " + monthlyAverage);
        System.out.println("Monthly Profit:  $" + monthlyProfit);
    }
    
}
