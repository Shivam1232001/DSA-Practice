package MathAndGeometry;

public class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder s=new StringBuilder();
 
        while(columnNumber>0){
         columnNumber--;
         int remain=columnNumber%26;
         char c=(char)('A'+remain);
         s.insert(0,c);
         columnNumber/=26;
        }
    return s.toString();
     }

     public static void main(String[] args) {
        ExcelSheetColumnTitle obj=new ExcelSheetColumnTitle();
        int num=255;
        int num2=701;
        String res1=obj.convertToTitle(num);
        String res2=obj.convertToTitle(num2);
        System.out.println("Res1="+res1+" "+"Res2="+res2);
     }
}
