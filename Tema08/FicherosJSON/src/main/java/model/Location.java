package model;

public class Location {

    private Object street,coordinates,timezone;
    private String city,country,state;
    private int postcode;

    public Location(Object street, Object coordinates, Object timezone, String city, String country, String state, int postcode) {
        this.street = street;
        this.coordinates = coordinates;
        this.timezone = timezone;
        this.city = city;
        this.country = country;
        this.state = state;
        this.postcode = postcode;
    }

    public Location() {
    }

    public Object getStreet() {
        return street;
    }

    public void setStreet(Object street) {
        this.street = street;
    }

    public Object getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Object coordinates) {
        this.coordinates = coordinates;
    }

    public Object getTimezone() {
        return timezone;
    }

    public void setTimezone(Object timezone) {
        this.timezone = timezone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Location{" +
                "street=" + street +
                ", coordinates=" + coordinates +
                ", timezone=" + timezone +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", postcode=" + postcode +
                '}';
    }
}