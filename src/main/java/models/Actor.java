package models;

public class Actor {
    //1. Pola
    private String firstName;
    private String lastName;
    private int rating;
    private boolean isOscarPrized;

    //2. Constructors (domyślnie konstruktor bezparametrowy)

    public Actor(String firstName, String lastName, int rating, boolean isOscarPrized) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rating = rating;
        this.isOscarPrized = isOscarPrized;
    }

    public Actor(){

    }

    public Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //3. Metody

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isOscarPrized() {
        return isOscarPrized;
    }

    public void setOscarPrized(boolean oscarPrized) {
        isOscarPrized = oscarPrized;
    }

    public int calculateSalary(int movies, int bonus) {
        if (getRating() > 1 && getRating() <= 19){
            return movies * bonus + 150000;
        } else if (getRating() > 19 && getRating() <= 39) {
            return movies * bonus + 50000;
        }
        return movies * bonus;
    }
}
