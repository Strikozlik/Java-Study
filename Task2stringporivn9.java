public class Task2stringporivn9 {                               /*У методі main напиши код попарного порівняння за
                                                                посиланням рядків string1, string2 і string3 з
                                                                виведенням відповідного повідомлення після кожного порівняння:
                                                                «посилання на рядки однакові» або «посилання на рядки різні».*/
    public static String string1 = "Аміго";
    public static String string2 = string1;
    public static String string3 = new String(string1);

    public static void main(String[] args) {
        String same = "посилання на рядки однакові";
        String different = "посилання на рядки різні";
        if (string1==string2)
            System.out.println(same);
        else
            System.out.println(different);
        if(string1==string3)
            System.out.println(same);
        else
            System.out.println(different);
        if(string2==string3)
            System.out.println(same);
        else
            System.out.println(different);
    }
}
