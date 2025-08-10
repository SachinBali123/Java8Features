package com.learn.java8.factory;

import com.learn.java8.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookFactory {
    public static List<Book> getBookList(){
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(101, "Java", 500));
        bookList.add(new Book(102, "Python", 300));
        bookList.add(new Book(103, "C", 200));
        bookList.add(new Book(104, "C++", 250));
        bookList.add(new Book(105, "Spring", 500));
        bookList.add(new Book(106, "Spring Boot", 350));
        bookList.add(new Book(107, "AWS", 700));
        return bookList;
    }
}
