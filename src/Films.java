public class Films {
    String name;
    String genre;
    String dateOfRelease;

    static int filmCount = 0;

    static Films[] films = new Films[100];

    public Films(String name, String genre, String dateOfRelease)
    {
        this.name = name;
        this.genre = genre;
        this.dateOfRelease = dateOfRelease;
    }

    static public void initializeFilms() {
    // Just pass the strings in order
    films[filmCount] = new Films("Interstellar", "Fantasy", "2016-09-03");
    filmCount++;
    films[filmCount] = new Films("Lala land", "Romans", "2012-04-03");
    filmCount++;
    films[filmCount] = new Films("Pele", "Fantasy", "1998-09-07");
    filmCount++;
}
    void addFilm(String name, String genre, String dateOfRelease)
    {
        films[filmCount] = new Films(name=name, genre=genre, dateOfRelease=dateOfRelease);
        filmCount++;
    }

}
