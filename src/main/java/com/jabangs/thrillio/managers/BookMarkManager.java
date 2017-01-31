package com.jabangs.thrillio.managers;

import com.jabangs.thrillio.entities.Book;
import com.jabangs.thrillio.entities.Movie;
import com.jabangs.thrillio.entities.WebLink;

public class BookMarkManager {
    private static BookMarkManager instance = new BookMarkManager();

    private BookMarkManager() {}

    public static BookMarkManager getInstance() {
        return instance;
    }

    public WebLink createWebLink(long id, String title, String url, String host) {
        WebLink webLink = new WebLink();
        webLink.setId(id);
        webLink.setTitle(title);
        webLink.setUrl(url);
        webLink.setHost(host);

        return webLink;
    }

    public Book createBook(long id, String title, int publicationYear, String publisher,
                           String[] authors, String genre, double amazonRating ) {
        Book book = new Book();
        book.setId(id);
        book.setTitle(title);
        book.setPublicationYear(publicationYear);
        book.setAuthors(authors);
        book.setGenre(genre);
        book.setAmazonRating(amazonRating);

        return book;
    }

    public Movie createMovie(long id, String title, String profileUrl, int releaseYear, String [] cast,
                             String[] directors, String genre, double imdbRating) {

        Movie movie = new Movie();
        movie.setId(id);
        movie.setTitle(title);
        movie.setProfileUrl(profileUrl);
        movie.setReleaseYear(releaseYear);
        movie.setCast(cast);
        movie.setDirectors(directors);
        movie.setGenre(genre);
        movie.setImdbRating(imdbRating);

        return movie;
    }
}
