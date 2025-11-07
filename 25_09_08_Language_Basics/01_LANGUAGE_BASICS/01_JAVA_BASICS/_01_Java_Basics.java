import java.util.Scanner;

class _01_Java_Basics {
    public static void main(String[] args) {

        // loops

        Scanner scanner = new Scanner(System.in);

        /*
         * int i ;
         * for(i=0;i<=25;i++){
         * System.out.println(i);
         * }
         */

        /*
         * 
         * int size = scanner.nextInt();
         * int[] arr = new int[size];
         * for (int i = 0; i < size; i++) {
         * arr[i] = scanner.nextInt();
         * }
         * 
         * int sum = 0;
         * for (int i = 0; i <= size - 1; i++) {
         * sum += arr[i];
         * }
         * 
         * for (int ele : arr) {
         * System.out.println(ele + " ");
         * 
         * }
         * System.out.println(sum);
         */
  
         scanner.close();

        // Conditional Statement

        // SWITCH
        /*
         * Given the day number print which day it is of the week ,
         * asssume week starts from Monday and ends on Sunday
         */

        /*
         * Scanner scanner = new Scanner(System.in);
         * 
         * int dayNumber = scanner.nextInt();
         * 
         * switch (dayNumber) {
         * case 1:
         * System.out.println("Monday");
         * break;
         * case 2:
         * System.out.println("Tuesday");
         * break;
         * case 3:
         * System.out.println("Wednesday");
         * break;
         * case 4:
         * System.out.println("Thrusday");
         * break;
         * case 5:
         * System.out.println("Friday");
         * break;
         * case 6:
         * System.out.println("Saturday");
         * break;
         * case 7:
         * System.out.println("Sunday");
         * break;
         * 
         * default:
         * System.out.println("Invalid Day Number");
         * 
         * }
         */

        // IF ELSE

        // Given an age , print "adult ", if the age >=18 , or print "Teen"
        // int age = scanner.nextInt();
        // if (age >= 10)
        // System.out.println("adult");
        // else
        // System.out.println("Teen");

        // IF ELSE IF
        /*
         * Given the marks of a student , tell the grade he is getting fall under which
         * - Grade A (>=90)
         * - Grade B (>=70 and <90)
         * - Grade C (>=50 and <50)
         * - Grade D (>=35 and <50)
         * - Fail ( <35 )
         * 
         */
        /*
         * int marks = scanner.nextInt();
         * if(marks >=90) System.out.println("Grade A");
         * else if(marks>=70 ) System.out.println("Grade B");
         * else if(marks>=50 ) System.out.println("Grade C");
         * else if(marks>=35 ) System.out.println("Grade D");
         * else System.out.println("Fail");
         */

        // Nested IF ELSE
        /*
         * you are given three intergers a,b,c
         * print which of these is the largest ,
         * if two or more integers are equal and are the largest ,
         * the program should indicate that as well
         */
        /*
         * int num1 = scanner.nextInt();
         * int num2 = scanner.nextInt();
         * int num3 = scanner.nextInt();
         * if (num1 > num2) {
         * if (num1 > num3)
         * System.out.println("num1 is the largest");
         * else if (num3 > num1)
         * System.out.println("num3 is the largest");
         * 
         * } else if (num2 > num1) {
         * if (num2 > num3)
         * System.out.println("num2 is the largest");
         * else if (num3 > num2)
         * System.out.println("num3 is the largest");
         * 
         * } else
         * System.out.println("No one is the largest");
         * 
         */
        // scanner.close();

        // Arrays
        /*
         * int[] arr = new int[5]; // created 5 new objects in our memory
         * 
         * arr[0] = 0;
         * arr[1] = 1;
         * arr[2] = 2;
         * arr[3] = 3;
         * arr[4] = 4;
         * System.out.println(arr[3]);
         * 
         * for (int i = 0; i < arr.length; i++) {
         * 
         * }
         * 
         * int[] arr1 = { 10, 20, 30, 40, 50 };
         * int[][] arr2 = { { 10, 20, 90 }, { 30, 40, 75, 50 }, { 60, 91, 70, 80 } };
         * int[] zero_index = arr2[0]; // {10,20 ,90}
         * System.out.println(zero_index[1]); // to acces 10
         * System.out.println(arr2[0][1]); // to acces 10
         */

        // Constants (Final keyword)
        /*
         * 
         * final double x =20;
         * System.out.println(x);
         */

        // Implicit & expilcit Conversion
        /*
         * 
         * double x = 10.8;
         * int y = (int)x;
         * System.out.println(x);
         * System.out.println(y);
         * 
         */

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
