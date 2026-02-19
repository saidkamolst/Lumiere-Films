import java.util.Scanner;
Scanner scanner = new Scanner(System.in);
public class Budget {
final double STANDARD_TAX_RATE = 0.20;
final double ACTOR_SALARY = 10.0;
final double STAFF_SALARY = 50.0;
final double CAMERA_COST = 30.0;
final double MICROPHONE_COST = 10.0;
final double MOVIE_BUDGET_LIMIT = 10000000.0;
    public void showSubMenu()
    {
        do {
            System.out.println("———————————————————"+"\n\tBudget Calculator submenu:");
            System.out.println("1. Calculate Project Budget");
            System.out.println("2. View Rate Information");
            System.out.println("3. Back to Main Menu");
            System.out.print("———————————————————");
        } while (selectSubMenu());
    }
    boolean selectSubMenu()
    {
        switch (MyUtils.selectChoice(3))
        {
            case 1:
    System.out.print("Enter number of actors: ");
    int actors = scanner.nextInt();
    System.out.print("Enter number of staff members: ");
    int staff = scanner.nextInt();
    System.out.print("Enter number of cameras: ");
    int cameras = scanner.nextInt();
    System.out.print("Enter number of microphones: ");
    int microphones = scanner.nextInt();

    double totalActorsCost = actors * ACTOR_SALARY;
    double totalStaffCost = staff * STAFF_SALARY;
    double totalCameraCost = cameras * CAMERA_COST;
    double totalMicrophoneCost = microphones * MICROPHONE_COST;

    double finalBudget = totalActorsCost + totalStaffCost + totalCameraCost + totalMicrophoneCost;

    double taxAmount = finalBudget * STANDARD_TAX_RATE;
    double finalBudgetWithTax = finalBudget + taxAmount;

    currentAccountBalance -= finalBudgetWithTax;

    System.out.println("\n--- Budget Breakdown ---");
    System.out.println("Actors cost: " + totalActorsCost);
    System.out.println("Staff cost: " + totalStaffCost);
    System.out.println("Camera cost: " + totalCameraCost);
    System.out.println("Microphone cost: " + totalMicrophoneCost);
    System.out.println("Tax (20%): " + taxAmount);
    System.out.println("FINAL BUDGET WITH TAX: " + finalBudgetWithTax);
    System.out.println("Remaining Account Balance: " + currentAccountBalance);

if (finalBudgetWithTax > MOVIE_BUDGET_LIMIT) {
    System.out.println(" WARNING: Budget exceeds movie limit of 10,000,000!");
} else {
    System.out.println(" Budget is within the allowed limit.");
}
               
                break;
            case 2:
                break;
            case 3:
                return false;
        }
        return true;
    }
}
