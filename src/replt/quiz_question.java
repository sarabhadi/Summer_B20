package replt;
import java.util.*;
public class quiz_question {


        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            System.out.println("what is the farthest planet in the solar system:" );
            System.out.println("a)venus" );
            System.out.println("b)pluto" );
            System.out.println("c)neptune" );

            String a = s.nextLine();

            //your code here
            if(a.equals("a")){
                System.out.println("a is wrong");
            }else if(a.equals("b")){
                System.out.println("b is correct");
            }else if(a.equals("c")){
                System.out.println("c is wrong");

            }else{
                System.out.println(a+" is not a valid answer");
            }
}}
