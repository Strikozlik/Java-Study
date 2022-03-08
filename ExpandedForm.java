public class ExpandedForm {
    public static String expForm(int num){
        String x = Integer.toString(num);
        String [] mas = x.split("");
        String res = "";
        String zero = "0";
        for(int i = 0;i<mas.length;i++){
            if(!mas[i].equals("0")){
                res+=mas[i]+zero.repeat(mas.length-1-i) + " + ";
            }
        }
        StringBuilder stringBuilder = new StringBuilder(res);
        return stringBuilder.delete(res.length()-3,res.length()-0).toString();
    }
}
