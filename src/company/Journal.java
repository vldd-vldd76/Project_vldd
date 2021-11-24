package company;

public class Journal extends TopClass {
    void getInfo(int i) {
        System.out.println(type + ", название: " + title[i] + ", тематика: " + topic[i] + ", дата выхода в печать: " + published[i]);
    }
}
