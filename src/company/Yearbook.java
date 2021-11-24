package company;

public class Yearbook extends TopClass {
    void getInfo(int i) {
        System.out.println(type + ", название: " + title[i] + ", тематика: " + topic[i] +
                ", издательство: " + publishingHouse[i] + ", год издания: " + published[i]);
    }
}
