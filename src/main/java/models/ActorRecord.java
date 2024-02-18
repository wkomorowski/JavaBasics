package models;
public record ActorRecord(String firstName, String lastName, int rating, boolean isOscarPrized) {
    public int calculateSalary(int movies, int bonus) {
        return movies * bonus;
    }
}
