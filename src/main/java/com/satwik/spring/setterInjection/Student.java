package com.satwik.spring.setterInjection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private List<String> courses;  // List of courses the student is enrolled in
    private Set<String> hobbies;   // Set of hobbies the student has
    private Map<String, Double> grades;  // Map of course names to grades
    private boolean active;       // Indicates if student is currently active
    private Address address;      // Reference type field for student's address

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public Set<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(Set<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<String, Double> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, Double> grades) {
        this.grades = grades;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student {")
                .append("\n  id: ").append(id)
                .append("\n  name: ").append(name)
                .append("\n  age: ").append(age)
                .append("\n  gender: ").append(gender)
                .append("\n  courses: ").append(courses)
                .append("\n  hobbies: ").append(hobbies)
                .append("\n  grades: ").append(grades)
                .append("\n  active: ").append(active)
                .append("\n  address: ").append(address)
                .append("\n}");

        return sb.toString();
    }


}
