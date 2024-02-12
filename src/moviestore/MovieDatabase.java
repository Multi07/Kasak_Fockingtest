package moviestore;

import autosaloon.Car;
import autosaloon.Condition;

import java.util.Scanner;

public class MovieDatabase {
    static Scanner sc = new Scanner(System.in);

    private String storeName;
    private Movie[] movies;


    public MovieDatabase(String storeName) {
        this.storeName = storeName;
    }

    /**
     * Metoda se zepta uzivatele na informace k pozadovanemu poctu filmu. A ty prida do pole movies.
     *
     * @param count - pozadovany pocet hercu
     */
    public void addMovies(int count) {
        movies = new Movie[count];
            for (int i = 0; i < count; i++) {
                System.out.print("jméno Filmu: ");
                String name  = sc.nextLine();

                System.out.print("Rok natočení: ");
                int filmyear = sc.nextInt();

                System.out.print("Delka filmu: ");
               int delka = sc.nextInt();

                System.out.print("Zadej žánr (Komedie, Horor, Thriller): ");

                String filmgenre = sc.next().toLowerCase();
                sc.nextLine();

                Genre genre = Genre.valueOf(filmgenre);

                movies[i] = new Movie(name, filmyear, delka, genre);
            }

        }

        /**
         * Tato metoda vypise informace o filmu. Na prvnim rádku bude text "-----INFO O MOVIE----- ", na druhem bude název filmove databaze a dvojtecka.
         * Na tretim radku bude text "filmy:" a následne budou vypsany vsichny filmy oddelene od sebe carkou a to ve formátu "nazev - zanr - rok natoceni" (Vyuzijte metodu printInfo() tridy Movie.)
         * Na poslednim radku bude text "-----".
         */
        public void printInfo () {
            System.out.println("-----INFO O MOVIE-----");
            System.out.println(storeName+": ");
            System.out.println("    filmy: ");
            for (int i =0;i< movies.length;i++) {
                System.out.println("        "+movies[i].Printinfo());
            }
            System.out.println("-----");
        }
        public void InterestingFacts() {
            System.out.println(storeName+": ");
            boolean comedyfilms = false;
            for (Movie movie: movies){
                if (movie.getFilmgenre() == Genre.komedie){
                    comedyfilms = true;
                }
            }
            if (comedyfilms) {
                System.out.println("Alespoň jeden film je komedie");
            } else {
                System.out.println("Žádný film není komedie");
            }
        }
    }