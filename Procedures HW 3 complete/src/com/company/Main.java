package com.company;

public class Main {

//hw 2
    public static void main(String[] args) {
        Book[] books = new Book[2];
        books[0] = new Book("Metamorphosis", new String[]{"Franz Kafka"}, 1915);
        books[1] = new Book("Demian", new String[]{"Hermann Hesse"}, 1919);
        for (Book book : books)
            System.out.println(book);
    }
}

class Book
{
    public Book (String title, String[] authors, int publicationYear)
    {
        this.title = title;
        this.authors = authors;
        this.publicationYear = publicationYear;
    }

    public String toString ()
    {
        StringBuffer strBuffer = new StringBuffer ();
        int numAuth = authors.length;
        for (int i = 0; i < numAuth; i = i + 1)
        {
            strBuffer.append (authors [i]);
            if (i != numAuth - 1)
                strBuffer.append (" & ");
        }
        strBuffer.append (": " + title + " ");
        strBuffer.append ("(" + publicationYear + ")");

        return strBuffer.toString ();
    }

    public String getTitle ()
    {
        return title;
    }

    public String[] getAuthors ()
    {
        return authors;
    }

    public int getPublicationYear ()
    {
        return publicationYear;
    }

    public int numAuthors ()
    {
        return authors.length;
    }

    public boolean newerThan (Book book)
    {
        return publicationYear > book.getPublicationYear ();
    }

    private String title;
    private String[] authors;
    private int publicationYear;
}




