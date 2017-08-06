package co.inventorsoft.oop.basic.model;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Person {

    private String firstName;

    private String lastName;

    private Passport passport;

    private LocalDateTime birthDate;

    /**
     * Constructor for existing persons
     *
     * @param firstName person's first name
     * @param lastName  person's last name
     * @param birthDate person's birth date
     */
    public Person(final String firstName, final String lastName, final LocalDateTime birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    /**
     * Constructor for newborns
     *
     * @param firstName newborn first name
     * @param lastName  newborn last name
     */
    public Person(final String firstName, final String lastName) {
        this(firstName, lastName, LocalDateTime.now());
    }

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

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public long getAge() {
        return ChronoUnit.YEARS.between(birthDate, LocalDateTime.now());
    }
}