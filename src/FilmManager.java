public class FilmManager {
    public void showSubMenu()
    {
        do {
            System.out.println("———————————————————"+"\n\tFilm Catalogue submenu:");
            System.out.println("1. View All Films");
            System.out.println("2. Add Film");
            System.out.println("3. Edit Film");
            System.out.println("4. Delete Film");
            System.out.println("5. Filter Films");
            System.out.println("6. Sort Films");
            System.out.println("7. Back to Main Menu");
            System.out.print("———————————————————");
        } while (selectSubMenu());
    }
    boolean selectSubMenu()
    {
        switch (MyUtils.selectChoice(7))
        {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                return false;
        }
        return true;
    }
}
