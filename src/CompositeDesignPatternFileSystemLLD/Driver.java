package CompositeDesignPatternFileSystemLLD;

public class Driver {
    public static void main(String[] args) {

        Directory movies = new Directory("Movies");
        Directory thrillerMovies = new Directory("Thriller Movies");
        File paradox = new File("Paradox");
        movies.add(paradox);
        movies.add(thrillerMovies);
        File race2 = new File("Race2");
        thrillerMovies.add(race2);
        movies.add(new File("Stree2"));

        movies.ls();
    }
}
