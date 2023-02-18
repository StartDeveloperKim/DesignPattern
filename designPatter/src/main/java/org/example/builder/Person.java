package org.example.builder;

public class Person {
    private String name;
    private Long weight;

    private Person(Builder builder) {
        this.name = builder.name;
        this.weight = builder.weight;
    }

    public static class Builder {
        private String name;
        private Long weight;

        public Builder() {}

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder weight(Long weight) {
            this.weight = weight;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

}
