import java.util.regex.*;
public class PatternCheck 
{
 public static void main(String[] args) {
 String regex="mo.";
 String str="momo";
 Pattern p=Pattern.compile(regex);
 Matcher m=p.matcher(str);
 while(m.find()) 
 {
  System.out.println(true);
 }
 }
}



