package KatySira.SeaBatle7x7;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }

    public void setName(String n){
        name = n;
    }
    public String checkYourself(String userInput){
        String result = "Мимо";
        int index = locationCells.indexOf(userInput);
        if(index>=0){
            locationCells.remove(index);

            if(locationCells.isEmpty()){
                result = "Потопив";
                System.out.println("Ура, ви потопили " + name + " :)");
            }else{
                result = "Попав";
            }
        }return result;
    }
}
