package org.example;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FakeGateway implements Gateway< Map<String, Long>> {

    @Override
    public Map<String, Long> getResponse() {
        Map<String, Long> astroDataMap = new HashMap<>();
        List<Assignment> assignments = List.of(new Assignment[]{
                new Assignment("Sergey Prokopyev", "ISS"),
                new Assignment("Alexander Gerst", "ISS"),
                new Assignment("Serena Aunon-Chancellor", "ISS"),
                new Assignment("Oleg Kononenko", "ISS"),
                new Assignment("David Saint-Jacques", "ISS"),
                new Assignment("Anne McClain", "ISS"),
                new Assignment("Alexey Ovchinin", "ISS"),
                new Assignment("Jing Haiping", "Tiangong"),
                new Assignment("Gui Haichow", "Tiangong"),
                new Assignment("Zhu Yangzhu", "Tiangong"),});

        for (Assignment assignment : assignments) {
            String craft = assignment.getCraft();
            astroDataMap.put(craft, astroDataMap.getOrDefault(craft, 0L) + 1);

        }return astroDataMap;

}}

