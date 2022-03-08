public class SortString {
    public static String sortString(String words) {
        String [] arr = words.split(" ");
        StringBuilder result = new StringBuilder("");
        for(int i = 0;i<10;i++){
            for(String s :arr){
                if(s.contains(String.valueOf(i))){
                    result.append(s+" ");
                }
            }
        }return  result.toString().trim();
    }
}
       /* if(words == ""){
            return "";
        }
        String [] mas = words.split(" ");
        String [] res = new String[mas.length];
        StringBuilder result = new StringBuilder();
        int place = 0;
        for(int i=1;i<=9;i++){
            String s = ""+i;
            for (String ma : mas) {
                if (ma.indexOf(s) >= 0) {
                    res[place] = ma;
                }
            }place++;
        }
        for (String s:res){
            result.append(s+" ");
        }
        return result.toString().trim();

    }
    public static void main(String[] args) {
        String test = "";
        System.out.println(sortString(test));


    }
}*/


