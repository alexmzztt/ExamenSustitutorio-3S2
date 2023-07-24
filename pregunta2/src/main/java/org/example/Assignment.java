package org.example;

public class Assignment {
        private final String name;
        private final String craft;
        // constructors, getters y setters, toString
        public Assignment(String name, String craft) {
            this.name = name;
            this.craft = craft;
        }

        // Getters
        public String getName() {
            return name;
        }

        public String getCraft() {
            return craft;
        }

        @Override
        public String toString() {
            return "Assignment{" +
                    "name='" + name + '\'' +
                    ", craft='" + craft + '\'' +
                    '}';
        }

}
