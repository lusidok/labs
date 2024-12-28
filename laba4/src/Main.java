public class Main {
    public static void main(String[] args) {
        String[] favoriteMovies = {"Interstellar", "Spider Man", "Reel Steel"};

        // Создаем экземпляр итератора
        Iterator movieIterator = new MovieIterator(favoriteMovies);

        // Используем итератор для перебора фильмов
        System.out.println("Список любимых фильмов:");
        while (movieIterator.hasNext()) {
            String movie = movieIterator.next();
            System.out.println(movie);
        }
    }
}