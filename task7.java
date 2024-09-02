import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter Number For Check Palindrome ");
        int num=input.nextInt();
        int org_num=num;
        int rev=0;

        while(num!=0){
      rev=rev*10 + num%10;
      num=num/10;

        }
        if(org_num==rev){

            System.out.print("Palindrome number --> "+org_num);
        }
        else{
            System.out.println("not Palindrome --> "+org_num);
        }

    }
}
