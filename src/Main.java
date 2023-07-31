import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n,num,r,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        n=s.nextInt();
        num=n;
        while(num>9){

            while (num>0){

                r=num%10;
                sum+=r;
                num/=10;
            }
            num=sum;
            sum=0;
        }
        if (num==1){
            System.out.println("Majic number always");
        }
        else {
            System.out.println("Not Majic Number at all");
        }

    }
}