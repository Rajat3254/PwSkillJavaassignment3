import java.util.Scanner;
public class question_1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int output=(((x+8)/3)%5)*5;
        System.out.println(output);
    }
}