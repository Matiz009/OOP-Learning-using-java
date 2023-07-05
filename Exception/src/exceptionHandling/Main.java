package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a=12;
        int b=0;
        try {
            if(b==0){
                throw new MyException("Error");//throws my exception
            }
            int c = a / b;//runtime exceptions or unchecked exceptions
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
