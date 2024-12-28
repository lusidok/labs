class MovieIterator implements Iterator {

    private String[] movies;
    private int position;

    public MovieIterator(String[] movies) {
        this.movies = movies;
        this.position = 0;
    }
    @Override
    public boolean hasNext() {
        return position < movies.length;
    }
    @Override
    public String next() {
        if (this.hasNext()) {
            return movies[position++];
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}