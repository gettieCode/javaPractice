import java.util.*; //scanner

public class Main {
    public static void main (String[] args){
    /* 
        float height = 1.5932f; ///lagi may letter f if wala gamitin ay double

        char letter ='a', digit = 0;
        String name = "Kristine";;
        System.out.println("Gerts" + name + " age is "+ String.format("%.2f meters", height));
        System.out.print("hahahahahah");
        System.out.print(" wowowow");
        System.out.println(letter+digit);

        //comparision
        String str1 = "pass";
        String str2 = "Pass";
        boolean isEqual = str1.equals(str2);
        System.out.println(isEqual); //false

        //copying
        String str3 = "mama"; 
        String str4 = str3;

        System.out.println(str4);

        //sacnner obj
        Scanner input = new Scanner(System.in); //create object
        System.out.print("Enter your name: "); //create question
        String nameMo = input.nextLine(); //create ng placeholder
        System.out.println(nameMo); //print input
        input.close(); //always close

        //pascal's triangle using nCr formula
*/
        System.out.println(74+36);
        System.out.println(-5+8*6);
        System.out.println((55+9)%9);
        System.out.println(20+-3*5/8);
        System.out.println(5+15/3*2-8%3);

        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = input.nextInt();
        System.out.print("input second number: ");
        int num2 = input.nextInt();

        System.out.println(num1 + " + " + num2 + " = "+ (num1+num2));
        System.out.println(num1 + " - " + num2 + " = "+ (num1-num2));
        System.out.println(num1 + " x " + num2 + " = "+ num1*num2);
        System.out.println(num1 + " / " + num2 + " = "+ num1/num2);
        System.out.println(num1 + " r " + num2 + " = "+ num1%num2);

        System.out.print("Multiplication table: ");
        int mulNum = input.nextInt();
        for (int i = 1; i<=10; i++){
            System.out.println(mulNum + " x " + i + " = " + mulNum*i);
        }
        System.out.println((25.5*3.5-3.5*3.5)/(40.5-4.5));
        input.close();
    }
}
