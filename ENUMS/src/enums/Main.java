package enums;

public class Main {

    public static void main(String[] args) {
	 days day_no=selector();
	 switch (day_no){
         case MONDAY -> System.out.println("Monday");
         case TUESDAY -> System.out.println("Tuesday");

     }
    }
    public static days selector(){
        return days.MONDAY;
    }
}
