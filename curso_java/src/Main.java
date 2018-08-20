/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aldemaro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employeer employeer1 = new Employeer("Aldemaro");
        Employeer employeer2 = new Employeer("Irina");
        
        System.out.println(employeer1.getData());
        System.out.println(employeer2.getData());
        
        System.out.println(Employeer.getNextId());
    }
    
}

class Employeer{
    
    public Employeer(String name){
        this.name = name;
        this.section = "Administration";
        id = nextid;
        nextid++;
        
    }
    public void setSection(String section){
        this.section = section;
    }
    
    public String getData(){
        return "Name: "+name+", section: "+section+", with id: "+id;
    }
    
    public static String getNextId(){
        return "The next id is: "+nextid;
    }

private final String name;
private String section;
private final int id;
private static int nextid=1;
}