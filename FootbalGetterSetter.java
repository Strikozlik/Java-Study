public class FootbalGetterSetter {
    public static void main(String[] args) {
        Footbal footbal = new Footbal();
        footbal.setClub("Juventus");
        footbal.setYear(1897);
        footbal.setChamp(31);
        footbal.setColors("Black and white");

        System.out.println("Ваш улюблений клуб : " + footbal.getClub() + " .Він був заснований : " + footbal.getYear() + " .Він ставав чемпіоном " +
                footbal.getChamp() + " разів." + "Його кольори + " + footbal.getColors());

    }
}

class Footbal {
    private String club;
    private int year;
    private int champ;
    private String colors;

    public void setClub(String clubname) {
        if (clubname.isEmpty()) {
            System.out.println("Ви нічого не ввели");
        } else {
            club = clubname;
        }
    }

    public String getClub() {
        return club;
    }

    public void setYear(int newyear) {
        if (newyear < 0) {
            System.out.println("Ви ввели некоректні дані");
        } else {
            year = newyear;
        }
    }

    public int getYear() {
        return year;
    }

    public void setChamp(int numbchemp) {
        if (numbchemp < 0) {
            System.out.println("Ви ввели некоректні дані");
        } else {
            champ = numbchemp;
        }
    }

    public int getChamp() {

        return champ;
    }

    public void setColors(String colorclub) {
        if (colorclub.isEmpty()) {
            System.out.println("Введіть кольори клубу");
        } else {
            colors = colorclub;
        }
    }

    public String getColors() {

        return colors;
    }


}