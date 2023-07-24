package org.example;
import java.util.List;
public class AstroResponse {
    private final int number;
    private final String message;
    private final List<Assignment> people;
    // constructors, getters y setters, toString
    public AstroResponse(int number, String message, List<Assignment> people) {
        this.number = number;
        this.message = message;
        this.people = people;
    }
    // Getters
    public int getNumber() {
        return number;
    }

    public String getMessage() {
        return message;
    }
    public List<Assignment> getPeople() {
        return people;
    }

    @Override
    public String toString() {
        return "AstroResponse{" +
                "number=" + number +
                ", message='" + message + '\'' +
                ", people=" + people +
                '}';
    }
}
