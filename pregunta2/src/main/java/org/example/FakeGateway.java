package org.example;
import com.google.gson.Gson;

public class FakeGateway {
    public static void main(String[] args) {
        // Create an array of Assignment objects
        Assignment[] assignments = {
                new Assignment("Sergey Prokopyev", "ISS"),
                new Assignment("Alexander Gerst", "ISS"),
                new Assignment("Serena Aunon-Chancellor", "ISS"),
                new Assignment("Oleg Kononenko", "ISS"),
                new Assignment("David Saint-Jacques", "ISS"),
                new Assignment("Anne McClain", "ISS"),
                new Assignment("Alexey Ovchinin", "ISS")};

        // Convert the custom class instance to JSON
        Gson gson = new Gson();
        String jsonObject = gson.toJson(assignments);

        }
}

