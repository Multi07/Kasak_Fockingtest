package moviestore;

public class Movie {
    private String name;
    private int filmYear;
    private int delka;
    private Genre filmgenre;

    public Movie(String name, int filmYear, int delka, Genre filmgenre) {
        this.name = name;
        this.filmYear = filmYear;
        this.delka = delka;
        this.filmgenre = filmgenre;
    }
    public String Printinfo() {
        return name+" - "+filmgenre+" - "+filmYear;
    }

    public Genre getFilmgenre() {
        return filmgenre;
    }
}
