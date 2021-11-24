package company;

public class Book extends TopClass {
    void getInfo(int i) {
        System.out.println(type + ", название: " + title[i] + ", автор: " + authors[i] +
                ", издательство: " + publishingHouse[i] + ", год издания: " + published[i]);
    }
}
