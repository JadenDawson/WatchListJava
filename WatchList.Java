import java.util.ArrayList;

public class WatchList implements WatchListInterface {
    
    // Private backing field using ArrayList
    private ArrayList<String> movies;

    // Constructor initializing the ArrayList
    public WatchList() {
        movies = new ArrayList<>();
    }

    @Override
    public void addMovie(String title) {
        movies.add(title);
    }

    @Override
    public boolean removeMovie(String title) {
        return movies.remove(title);
    }

    @Override
    public void updateMovie(int index, String newTitle) {
        movies.set(index, newTitle);
    }

    @Override
    public String getMovie(int index) {
        return movies.get(index);
    }

    @Override
    public int getSize() {
        return movies.size();
    }

    @Override
    public void printWatchlist() {
        for (int i = 0; i < movies.size(); i++) {
            System.out.println(i + ": " + getMovie(i));
        }
    }
}
