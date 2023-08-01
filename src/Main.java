import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        int inputed, num,sum=0,remain;
        Scanner input= new Scanner(System.in);// create instance to accept a number from user
        System.out.println("Please Enter the number you want to check ");//propting user to enter number
        num=input.nextInt();//Accept number from user
        inputed=num;//storing the accepted value for later display
        while(num>9){// will run until num is one digit
            while(num>0){//nested loop to add each digit num has

                remain=num%10;//gets the last digit of num e.g num=654 then remain=4
                sum+=remain;//to add each digits
                num/=10;// to remove the last digit because we have it on remain
            }
            num=sum;//assign the sum to num so it will go and check the sum is one digit or not
            sum=0;
        }
        if (num==1){//if num is one it will execute the below command
            System.out.println(inputed+" is a majic number");
        }
        else{// if num is not 1 it will execute the below command
            System.out.println(inputed+" is not majic number");
        }


    }
}