import java.util.*;

class math{

public static void main(String str[]){

test t1=new test();
t1.testStringUtil();
Check.check();
}
}

class concate{
  public String concat(String a,String b) {
 
        String result = null;
        
            result = a + b;
                            
        return result.toLowerCase();
 
    }
}
class test extends concate{
void testStringUtil() {
         String result = concat("Hello ", "World");
         System.out.println("Result is "+result);
 
        }

}
class Check{
   static void check(){
      System.out.println(Character.isLowerCase('h'));
      System.out.println(Character.isUpperCase('e'));
      System.out.println(Character.isUpperCase('l'));
      System.out.println(Character.isLowerCase('l'));
      System.out.println(Character.isLowerCase('o'));
}
  }     