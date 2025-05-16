package org.rothurtech;

import java.util.Collections;
import java.util.List;

// 1. convert class to an immutable class
// 2. make Employee class as a singleton
// 3. Docker installment and database (Postgres MongoDB Redis ElasticSearch Cassandra) volume attached
// 4. Maven
// 5. Version manager SDKman/Jenv
// 6. Homebrew

public final class Employee {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
    private final Boolean flagged;
    private final List<Employee> list;

    public Employee(String firstName, String lastName, String email, String password, Boolean flagged, List<Employee> list) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.flagged = flagged;
        this.list = List.copyOf(list);
        //this.list = list;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getFlagged() {
        return flagged;
    }

    public List<Employee> getList() {
        //return Collections.unmodifiableList(list);
        return list;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "flagged=" + flagged +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
