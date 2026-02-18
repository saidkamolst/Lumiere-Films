import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class FilmManager {
    Scanner scanner = new Scanner(System.in);

    public void showSubMenu()
    {
        Films.initializeFilms();
        do {
            System.out.println("———————————————————"+"\n\tFilm Catalogue submenu:");
            System.out.println("1. View All Films");
            System.out.println("2. Add Film ");
            System.out.println("3. Edit Film - not working");
            System.out.println("4. Delete Film -  not working");
            System.out.println("5. Sort Films - not working");
            System.out.println("6. Back to Main Menu");
            System.out.print("———————————————————");
        } while (selectSubMenu());
    }
    boolean selectSubMenu()
    {
        switch (MyUtils.selectChoice(7))
        {
            case 1:
                viewAllFilms();
                break;
            case 2:
                addFilm();
                break;
            case 3:
                editFilm();
                break;
            case 4:
                deleteFilm();
                break;
            case 5:
                break;
            case 6:
                return false;
        }
        return true;
    }

    void viewAllFilms()
    {
        {
        System.out.println("———————————————————"+"\nAll Films");
        if(Films.filmCount == 0)
        {
            System.out.println("No films members found.");
        }
        else
        {
            System.out.println("\nNo. | Name                    | Genre                     | Release date");
            System.out.println("----+-------------------------+-------------------------+-------------------------");
            for (int i = 0; i < Films.filmCount; i++) {
                if(Films.films[i] != null)
                {
                    System.out.printf("%-3d | %-23s | %-23s | %-23s\n",
                            (i + 1), Films.films[i].name, Films.films[i].genre, Films.films[i].dateOfRelease
                    );
                }
            }
        }
    }
    }

    void addFilm()
    {
        if (Films.filmCount == 100) {
            System.out.println("Your films is full");
        }
        else
        {
            System.out.print("Add film's name (or type X to cancel): ");
            String newFilmName = scanner.nextLine();
            if (newFilmName.equalsIgnoreCase("x"))
            {
                return;
            }

            System.out.print("Add film's genre (or type X to cancel): ");
            String newFilmGenre = scanner.nextLine();
            if (newFilmName.equalsIgnoreCase("x"))
            {
                return;
            }

            System.out.print("Add film's release date (YYYY-MM-DD) or type X to cancel: ");
            String newFilmReleaseDate = scanner.nextLine();
            if (newFilmName.equalsIgnoreCase("x"))
            {
                return;
            }

            System.out.print("Are you sure? (y/n): ");
            String choiceValidation = scanner.nextLine();
            if (choiceValidation.equalsIgnoreCase("y") || choiceValidation.equalsIgnoreCase("yes"))
            {
                Films.addFilm(newFilmName, newFilmGenre, newFilmGenre);
                System.out.println("Film added successfully");
            }
            else
            {
                System.out.println("Invalid choice or user moved back");
            }


        }
    }

    void editFilm()
    {
        return;
    }

    void deleteFilm()
    {
        return;
    }

    void sortFilms()
    {
        return;
    }
}
