package ru.gb.sharovartem.lesson_1.task_1.Bider;

public class Person {
    private String firstName;
    private String lastName;
    private String country;
    private String address;
    private String phone;
    private Integer age;
    private String gender;

    public Person(PersonBuilder personBuilder) {
        if (personBuilder == null) {
            throw new IllegalArgumentException("Please provide person builder to build person object.");
        }
        if (personBuilder.lastName == null || personBuilder.lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Please provide person last name.");
        }
        if (personBuilder.firstName == null || personBuilder.firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("Please provide person first name.");
        }
        if (personBuilder.gender == null || personBuilder.gender.trim().isEmpty()) {
            throw new IllegalArgumentException("Please provide person gender.");
        }
        this.firstName = personBuilder.firstName;
        this.lastName = personBuilder.lastName;
        this.country = personBuilder.country;
        this.address = personBuilder.address;
        this.phone = personBuilder.phone;
        this.age = personBuilder.age;
        this.gender = personBuilder.gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    @Override
    public String toString() {
        // Класс StringBuilder также использует паттерн проектирования Builder с реализацией
        // интерфейса java.lang.Appendable
        StringBuilder builder = new StringBuilder();
        builder.append("Person [Last name=").append(lastName).append(", first name=").append(firstName).append(", country=")
                .append(country).append(", address=").append(address).append(", phone=").append(phone)
                .append(", age=").append(age).append(", gender=").append(gender).append("]");
        return builder.toString();
    }

    public static class PersonBuilder {

        protected String firstName;
        protected String lastName;
        protected String country;
        protected String address;
        protected String phone;
        protected Integer age;
        protected String gender;

        public PersonBuilder(){
            super();
        }
        public PersonBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder country(String country){
            this.country = country;
            return this;
        }

        public PersonBuilder address(String address){
            this.address = address;
            return this;
        }

        public PersonBuilder phone(String phone){
            this.phone = phone;
            return this;
        }

        public PersonBuilder age(int age){
            this.age = age;
            return this;
        }

        public PersonBuilder gender(String gender){
            this.gender = gender;
            return this;
        }

        public Person build() {
            Person person = null;
            if (validatePerson()) {
                person = new Person(this);
            } else {
                System.out.println("Sorry! Person objects can't be build without required details");
            }
            return person;
        }

        private boolean validatePerson() {
            return (firstName != null && !firstName.trim().isEmpty() && lastName != null && !lastName.trim().isEmpty())
                    && gender != null && !gender.trim().isEmpty();
        }


    }
}
