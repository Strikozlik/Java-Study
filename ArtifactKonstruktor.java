public class ArtifactKonstruktor {
    private   int number;
    private String culture;
    private  int age;

    public ArtifactKonstruktor(int number){
        this.number = number;
    }
    public ArtifactKonstruktor(int number,String culture){
        this.number = number;
        this.culture = culture;
    }
    public ArtifactKonstruktor(int number,String culture,int age){
        this.number = number;
        this.culture = culture;
        this.age = age;
    }

    public static void main(String[] args) {
        ArtifactKonstruktor artifactKonstruktor = new ArtifactKonstruktor(25);
        ArtifactKonstruktor artifactKonstruktor1 = new ArtifactKonstruktor(24,"trypillja");
        ArtifactKonstruktor artifactKonstruktor2 = new ArtifactKonstruktor(23,"Aztek",12);

        System.out.println(artifactKonstruktor.number);
        System.out.println(artifactKonstruktor1.number + artifactKonstruktor1.culture);
        System.out.println(artifactKonstruktor2.number + artifactKonstruktor2.culture + artifactKonstruktor2.age);

    }

}
