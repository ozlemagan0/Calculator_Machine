import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1, n2, sum, ext, mul, div;
        int selectNum;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number:");
        n1 = sc.nextDouble();

        System.out.print("Enter second number:");
        n2 = sc.nextDouble();

        System.out.print("For addition 1\nFor extraction 2\nFor multiplication 3\nFor division 4\n");
        System.out.print("Your choose:");
        selectNum = sc.nextInt();

        //With If-Else

        /*if(selectNum==1){
            sum = n1 + n2;
            System.out.print("Result:"+sum);
        } else if (selectNum==2){
            ext = n1 - n2;
            System.out.print("Result:"+ext);
        } else if (selectNum==3){
            mul = n1 * n2;
            System.out.print("Result:"+mul);
        } else if (selectNum==4){
            if(n2!=0){
            div = n1 / n2;
            System.out.print("Result:"+div);
            }
            else {
                System.out.print("The second number can not be 0!\n");
            }
        } else {
            System.out.print("U entered wrong number!");
        } */


        //With Switch-Case

        switch (selectNum){
            case 1:
                sum = n1 + n2;
                System.out.print("Result:"+sum);
                break;
            case 2:
                ext = n1 - n2;
                System.out.print("Result:"+ext);
                break;
            case 3:
                mul = n1 * n2;
                System.out.print("Result:"+mul);
                break;
            case 4:
                if(n2!=0) {
                    div = n1 / n2;
                    System.out.print("Result:" + div);
                }
                else{
                    System.out.print("The second number can not be 0!\n");
                }
                break;
            default:
                System.out.print("U entered wrong number!");
                break;
        }
    }
}
