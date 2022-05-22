package KatySira.SeaBatle7x7;

import java.util.ArrayList;

public class DotComBust {
    private  GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList =  new ArrayList<DotCom>();
    private int numOfGuesse = 0;

    private void setUpGame(){
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eTos.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Ваша ціль потопити три кораблі");
        System.out.println("Спробуйте потопити їх за мінімальну кількість ходів");

        for(DotCom dotComToSet:dotComsList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }
    private void startPlaying(){
        while(!dotComsList.isEmpty()){
            String userGuess = helper.getUserInput("Зробіть хід");
            checkUserGuess(userGuess);
        }finishGame();
    }
    private  void checkUserGuess(String userGuess){
        numOfGuesse++;
        String result = "Мимо";
        for(DotCom dotComToTest:dotComsList){
            result = dotComToTest.checkYourself(userGuess);

            if(result.equals("Попав")){
                break;
            }
            if(result.equals("Потопив")){
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }
    private void finishGame(){
        System.out.println("Всі кораблі пішли на дно");
        if(numOfGuesse <= 18){
            System.out.println("Це зайняло  у вас всього " + numOfGuesse + " спроб" );
        }else{
            System.out.println("Ха ха ха ,мазіла.Потопив всі кораблі аж за " + numOfGuesse + "пострілів");
            System.out.println("Наступного разу цілься краще");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
