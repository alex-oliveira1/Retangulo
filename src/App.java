import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       int b;
       int h;
       Scanner sc= new Scanner(System.in);
       System.out.println("Digite a base do retangulo");
       b=sc.nextInt();
       System.out.println("Digite a altura do retangulo");
       h=sc.nextInt();
       System.out.println("A area do retangulo é "+area(b,h));
       System.out.println("O perimetro do retangulo é "+perimetro(b, h));
       sc.close();
    }
public static int area(int b, int h){
    int a=b*h;
    return a;
}
public  static int perimetro(int b, int h){
    int p=(2*b)+(2*h);
    return p;
}

}
