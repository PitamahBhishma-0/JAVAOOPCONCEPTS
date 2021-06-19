package main;

import java.util.LinkedList;

public class Cities {
    LinkedList<String> cities=new LinkedList<>();
    public Cities() {
    	
    }
    public LinkedList<String> getlist(){
    	cities.add("BERLIN");
    	cities.add("NEWYORK");
    	cities.add("KATHMANDU");
    	cities.add("PARIS");
    	cities.add("ROMA");
    	cities.add("LONDON");
    	cities.add("CALIFORNIA");
    	cities.add("SUNAWAL");
    	cities.add("BUTWAL");
    	cities.add("POKHARA");
    	cities.add("JHAPA");
    	return cities;

    }
    
}