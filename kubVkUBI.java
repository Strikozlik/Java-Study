public class kubVkUBI {
    public static void main(String[] args) {

        System.out.println(eidghtin (3));     // пропускаэм через метод число а
    }
    public static long cube(long a){            // цим методом число а підноситься до кубу  3*3*3=27
        return a*a*a;
    }
    public static long ninthDegree( long a){    //переміщується з методу eightin і бачить що   всередині цього методу метод
        // cube   і переміщується  в метод cube,який верне обчислене число,а саме 27
        return cube(cube(a));                   // і число 27 заходить в цей метод і підноситься до кубу 27*27*27 =19683
    }
    public static long eidghtin(long a){        // спочатку викликаэться цей метод,ы комп бачить що  в ньому э метод
        //ninthDegre і переміщається в нього,який идасть число 19683 яке знову
        return ninthDegree(cube(a));           // піднесеться до  кубу 19683*19683*19683 = 7625597484987
    }
}




