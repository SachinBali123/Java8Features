package com.learn.java8.lamda;

import com.learn.java8.factory.BookFactory;
import com.learn.java8.model.Book;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 public class BookSortingExample {
    public static void main(String[] args) {
        System.out.println("This is a Demo Example of Sorting books using Stream and Lambda!");
        System.out.println("Available Book List :");
        BookFactory.getBookList().forEach(System.out::println);

        System.out.println("\n Sorting Book With Custom Comparator:");
        sortBookWithCustomComparator(BookFactory.getBookList()).forEach(System.out::println);

        System.out.println("\n Sorting Book With Anonymous Comparator:");
        sortBookWithAnonymousComparator(BookFactory.getBookList()).forEach(System.out::println);

        System.out.println("\n Sorting Book With Lambda Function:");
        sortBookWithLambdaFunction(BookFactory.getBookList()).forEach(System.out::println);

        System.out.println("\n Sorting Book By Name Using Stream AIP: Comparator.comparing(Book::getName)");
        sortBookByNameUsingStreamAIP(BookFactory.getBookList()).forEach(System.out::println);

        System.out.println("\n Sorting Book By Id Descending Using Stream AIP: Comparator.comparing(Book::getId)");
        sortBookByIdUsingStreamAIP(BookFactory.getBookList()).forEach(System.out::println);

        System.out.println("\n Sorting Book By Pages Using Stream AIP: Comparator.comparing(Book::getPages)");
        sortBookByPagesUsingStreamAIP(BookFactory.getBookList()).forEach(System.out::println);

    }
   // Sorting Books With Custom Comparator:
    private static List<Book> sortBookWithCustomComparator(List<Book> bookList){
        Collections.sort(bookList, new MyComparator());
        return bookList;
    }


    // Sorting Books With Anonymous Comparator:
     private static List<Book> sortBookWithAnonymousComparator(List<Book> bookList){
         bookList.sort(new Comparator<Book>(){
             @Override
             public int compare(Book o1, Book o2) {
                 return o1.getName().compareTo(o2.getName());
             }
         });
         return bookList;
     }

    // Sorting Book With Lambda Function:
     private static List<Book> sortBookWithLambdaFunction(List<Book> bookList){
          bookList.sort((b1, b2) -> b1.getName().compareTo(b2.getName()));
          return bookList;
     }

     // Sorting Book By Name Using Stream AIP: Comparator.comparing(Book::getName)
     private static List<Book> sortBookByNameUsingStreamAIP(List<Book> bookList){
         return bookList.stream().sorted(Comparator.comparing(Book::getName)).toList();
     }

     // Sorting Book By Id Descending Using Stream AIP: Comparator.comparing(Book::getId)
     private static List<Book> sortBookByIdUsingStreamAIP(List<Book> bookList){
         return bookList.stream().sorted(Comparator.comparing(Book::getId).reversed()).toList();
     }

     // Sorting Book By Pages Descending Using Stream AIP: Comparator.comparing(Book::getPages)
     private static List<Book> sortBookByPagesUsingStreamAIP(List<Book> bookList){
        return bookList.stream().sorted(Comparator.comparing(Book::getPages).reversed()).toList();
     }

}

// class Custom Comparator for Sorting
class MyComparator implements Comparator<Book>{
   //Sorting ASC Natural Order
   @Override
   public int compare(Book b1, Book b2){
        return b1.getName().compareTo(b2.getName());
   }
    // Sorting DSC Descending Order
    //@Override
    //public int compare(Book b1, Book b2){
    //    return b2.getName().compareTo(b1.getName());
    //}
}
