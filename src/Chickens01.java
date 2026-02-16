public class Chickens01 {
    public static void main(String[] args) {

        // Declare variables
        int eggsPerChicken = 5;
        int chickenCount = 3;

        int currentEggs;
        int totalEggs = 0;

        // Monday
        currentEggs = eggsPerChicken * chickenCount;
        totalEggs += currentEggs;
        printInfo("Monday", chickenCount, currentEggs, totalEggs);

        // Tuesday
        ++chickenCount;
        currentEggs = eggsPerChicken * chickenCount;
        totalEggs += currentEggs;
        printInfo("Tuesday", chickenCount, currentEggs, totalEggs);

        // Wednesday
        chickenCount /= 2;
        currentEggs = eggsPerChicken * chickenCount;
        totalEggs += currentEggs;;
        printInfo("Wednesday", chickenCount, currentEggs, totalEggs);

    }

    public static void printInfo(String day, int chickenCount, int currentEggs, int totalEggs) {
        System.out.println("");
        System.out.println(day + ": ");
        System.out.println("- Number of chickens: " + chickenCount);
        System.out.println("- Eggs collected: " + currentEggs);
        System.out.println("- Total eggs collected: " + totalEggs);
    }
}
