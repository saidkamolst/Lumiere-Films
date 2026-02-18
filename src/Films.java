public class Films {
    String name;
    String genre;
    String dateOfRelease;

    static int filmCount = 0;

    static Films[] films = new Films[100];

    public Films(String name, String genre, String dateOfRelease) {
        this.name = name;
        this.genre = genre;
        this.dateOfRelease = dateOfRelease;
    }

    static public void initializeFilms()
    {
        // Just pass the strings in order
        films[filmCount] = new Films("Interstellar", "Fantasy", "2016-09-03");
        filmCount++;
        films[filmCount] = new Films("Lala land", "Romans", "2012-04-03");
        filmCount++;
        films[filmCount] = new Films("Pele", "Fantasy", "1998-09-07");
        filmCount++;
    }

    static void addFilm(String name, String genre, String dateOfRelease)
    {
        Films.films[Films.filmCount] = new Films(name, genre, dateOfRelease);
        Films.filmCount++;
    }

    static void deleteFilm(int filmIndex)
    {
         for (int i = filmIndex; i < Films.filmCount - 1; i++) {
                Films.films[i] = Films.films[i + 1];
            }

            Films.films[Films.filmCount - 1] = null;
            Films.filmCount--;
    }

    static void editFilm(int filmIndex, String name, String genre, String dateOfRelease)
    {
        if (!name.trim().equals("pass")) {
            films[filmIndex].name = name;
        }

        if (!genre.trim().equals("pass")) {
            films[filmIndex].genre = genre;
        }

        if (!dateOfRelease.trim().equals("pass")) {
            films[filmIndex].dateOfRelease = dateOfRelease;
        }
    }



}
