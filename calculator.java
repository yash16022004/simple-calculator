import java.util.*;

class cal extends value{
    private int a,b,res;
    
    cal(int a,int b){
        this.a=a;
        this.b=b;
        
        System.out.println("a = "+this.a);
        System.out.println("b = "+this.b+"\n");
    }
    public void sum(){
        res = a+b;
        System.out.println("sum = "+res);
    }
    public void sub(){
        res = a-b;
        System.out.println("subtraction = "+res);
    }
    public void mul(){
        res = a*b;
        System.out.println("multiplication = "+res);
    }
    public void div(){
        res = a/b;
        System.out.println("division = "+res);
    }
}
public class calculator {
    public static void main(String args[]){
        Scanner cal=new Scanner(System.in);
        cal c=new cal(67,56);
        int sym=cal.nextInt();
        switch (sym) {
            case 1:
                c.sum();
                break;
            case 2:
                c.sub();
                break;
            case 3:
                c.mul();
                break;
            case 4:
                c.div();
                break;
        
            default:
                System.out.println("this is not exist");
        }
    }    
}
