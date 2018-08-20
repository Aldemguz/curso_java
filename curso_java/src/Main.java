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
        Employeer employeer3 = new Employeer("Gladymar");
        Employeer employeer4 = new Employeer("Edicson");
        Employeer employeer5 = new Employeer("Omar");
        Employeer employeer6 = new Employeer("Elba");
        Employeer employeer7 = new Employeer("Monica");
        Employeer employeer8 = new Employeer("Estefani");
        
        System.out.println(employeer1.getData());
        System.out.println(employeer2.getData());
        System.out.println(employeer3.getData());
        System.out.println(employeer4.getData());
        System.out.println(employeer5.getData());
        System.out.println(employeer6.getData());
        System.out.println(employeer7.getData());
        System.out.println(employeer8.getData());
        
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