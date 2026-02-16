public class ActorManager {
    public void showSubMenu()
    {
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
        switch (MyUtils.selectChoice(4))
        {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                return false;
        }
        return true;
    }
}
