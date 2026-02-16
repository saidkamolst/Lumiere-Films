import java.util.Scanner;

public class ActorManager {
    private Actors actors = new Actors();
    private PortfolioItem portfolio = new PortfolioItem();
    public void showSubMenu()
    {
        actors.initializeActors();
        do {
            System.out.println("———————————————————"+"\n\tCasting / Actors submenu:");
            System.out.println("1. View All Actors");
            System.out.println("2. Add Actor");
            System.out.println("3. Manage Actor Portfolio");
            System.out.println("4. Back to Main Menu");
            System.out.print("———————————————————");
        } while (selectSubMenu());
    }
    boolean selectSubMenu()
    {
        Scanner scanner = new Scanner(System.in);
        switch (MyUtils.selectChoice(4))
        {
            case 1:
                actors.viewActors();
                break;
            case 2:
                System.out.println("Please enter actor name: ");
                String actorName = scanner.nextLine();
                System.out.println("Please enter actor role: ");
                String actorRole = scanner.nextLine();

                actors.addActor(actorName, actorRole);
                break;
            case 3:
                showPortfolioMenu();
                break;
            case 4:
                return false;
        }
        return true;
    }
    public void showPortfolioMenu() {
        do {
            System.out.println("———————————————————"+"\n\tManage Portfolio Items:");
            System.out.println("1. List All Portfolio Items");
            System.out.println("2. Add Portfolio Item");
            System.out.println("3. Remove Portfolio Item");
            System.out.println("4. Back to Casting / Actors Submenu");
            System.out.print("———————————————————");
        } while (selectPortfolioMenu());
    }
    boolean selectPortfolioMenu()
    {
        Scanner scanner = new Scanner(System.in);
        switch (MyUtils.selectChoice(4))
        {
            case 1:
                portfolio.listPortfolioItems(askActorNum());
                break;
            case 2:
                System.out.println("Please enter actor's project: ");
                String actorProject = scanner.nextLine();
                System.out.println("Please enter actor's role in that project: ");
                String actorRole = scanner.nextLine();
                System.out.println("Please enter actor's project year: ");
                String actorProjectYear = scanner.nextLine();
                portfolio.addPortfolioItems(askActorNum(), actorProject, actorRole, actorProjectYear);
                break;
            case 3:
                System.out.println("Please enter actor's portfolio item number to remove: ");
                int portfolioItemNumber = scanner.nextInt();
                portfolio.removePortfolioItems(askActorNum(), portfolioItemNumber);
                break;
            case 4:
                return false;
        }
        return true;
    }
    int askActorNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter actor number: ");
        int actorNum = scanner.nextInt();
        return actorNum;
    }
}
