package teamgenerator;



import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Clara
 */
public class Team {
    
    private String name;
    private List<Person> members;
    
    public Team(String name, List<Person> members) {
        this.name = name;
        this.members = members;
    }
    
    public String getName() {
        return name;
    }
    
    public List<Person> getMembers() {
        return members;
    }
    
}
