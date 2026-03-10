import java.util.*;
public class input2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());
        String name=sc.nextLine();
        System.out.println(name+" is "+n+" years old\n\n"+"see the counting");
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
    }
}