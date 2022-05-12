package model;

import java.util.Arrays;

public class Name {
    private String title, first, last;
    private String[] detalles;

    public Name() {
    }

    public Name(String title, String first, String last, String[] detalles) {
        this.title = title;
        this.first = first;
        this.last = last;
        this.detalles = detalles;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String[] getDetalles() {
        return detalles;
    }

    public void setDetalles(String[] detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString() {
        return "Name{" +
                "name='" + title + '\'' +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", detalles=" + Arrays.toString(detalles) +
                '}';
    }
}
