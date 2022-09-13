package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        int res;

        if( (year % 4 == 0) && (year % 100 != 0) || year % 400 == 0 ){
            res = 1;
        }else {
            res = 0;
        }
        switch (res){
            case (1):
                System.out.println("leap");
                break;
            case (0):
                System.out.println("not leap");
                break;
        }
    }
}
