import java.util.Scanner;

class _01_Java_Basics {
    public static void main(String[] args) {

        // INPUT / OUTPUT
        /*
         * Scanner scanner = new Scanner(System.in); // this is mandatory
         * 
         * // we have to write differnt things for double , boolean , like for "INT" we
         * use ".nextInt()" , for "STRING" we use ".next()"
         * int num = scanner.nextInt();
         * System.out.println(num);
         * String firstName = scanner.next();
         * String lastName = scanner.next();
         * System.out.println(firstName + " " + lastName);
         * scanner.close();// this is mandatory
         * 
         */
      
         // STRINGS
        /*
         * String name = "abc hjkl";
         * String last_name = " 123cvbnm";
         * String full_name = name + " " + last_name;
         * name += " " + last_name;
         * boolean result = name.equals(last_name);
         * // boolean result = name==last_name
         * System.out.println(name.charAt(0));
         * System.out.println(name.substring(0));
         * System.out.println(name.substring(0, 3)); // includes beginIndex but not the
         * EndIndex
         * System.out.println(full_name);
         * System.out.println(result);
         */

        // OPERATORS
        /*
         * // Ternary Operators
         * // condition ? first : second
         * 
         * int num1=8;
         * int num2=10;
         * 
         * int num3 = num1>num2 ? num1 :num2; // 8 > 10 ?
         * System.out.println(num3);
         * 
         */

        // Bitwise Operators (Will learn )

        /*
         * // Assignment Operators
         * // +=
         * 
         * int num1=9;
         * int num2=10;
         * int result =0;
         * result +=num1+num2;
         * 
         * System.out.println(result);
         */

        /*
         * // Logical Operator
         * // && , ||
         * boolean first =true;
         * boolean second = true;
         * boolean result = first && second ;
         * 
         * System.out.println("result: "+ result);
         */

        /*
         * //Relational Operators
         * // == , != , > , < , >= , <=
         * 
         * int num1 =7;
         * int num2 =8;
         * 
         * boolean result = num1==num2;
         * System.out.println(result);
         * 
         */

        /*
         * // Urnary Operators
         * // + , - , ++ , -- , !
         * 
         * int num1 = -6;
         * int num2 = -num1;
         * System.out.println(num2);
         * 
         * boolean fl1 = true;
         * boolean fl2 = !fl1;
         * System.out.println(fl2);
         * fl2 = !!fl1; // used 2 times ! , which turns the value 2 times
         * System.out.println(fl2);
         * 
         * int num3=8;
         * int num4=num3++;
         * 
         * System.out.println("num3: "+num3);
         * System.out.println("num4: "+num4);
         * 
         */

        /*
         * //Arithmetic Operators
         * // - , + , / , * , %
         * 
         * int num1=10;
         * int num2=3;
         * 
         * double num3 =num1/num2;
         * System.out.println(num3);
         */

        // DATA TYPES
        /*
         * short x;
         * int i;
         * float f;
         * double d;
         * char ch = 'a';
         * System.out.println(ch);
         */

        // System.out.println("hello");
    }
}
