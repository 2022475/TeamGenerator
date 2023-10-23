package teamgenerator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Clara
 */
public class Person {
    
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    
    public Person(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + firstName + " " + lastName + ", Email: " + email;
    }
}
