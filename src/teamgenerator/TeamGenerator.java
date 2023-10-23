/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teamgenerator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Clara
 */
public class TeamGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Person> people = new ArrayList<>();
        List<Team> teams = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader("MockData.txt"))){
            
            String line;
            
            while ((line= reader.readLine()) !=null){
                String[] data = line.split(",");
                if (data.length == 4){
                    int id = Integer.parseInt(data[0]);
                    String firstName = data[1];
                    String lastName = data[2];
                    String email = data[3];
                    people.add(new Person(id, firstName, lastName, email));
                }
          }
        }catch (IOException e){
        }
        
        Collections.shuffle(people);
        
        
        for (int i = 1; i <= 20; i++){
            List<Person> teamMembers = new ArrayList<>();
            for (int j = 0; j < 5; j++){
                Person person = people.remove(0);
                teamMembers.add(person);
              
            }
            Team team = new Team("Team" + i, teamMembers);
            teams.add(team);
        }
        
        for (Team team : teams){
            System.out.println("Team: " + team.getName());
            for (Person person : team.getMembers()){
                System.out.println(person);
            }
            System.out.println();
            
        
        }
            
    }
    
}
