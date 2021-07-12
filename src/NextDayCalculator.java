public class NextDayCalculator {
    public static int changeDay(int day, int month, int year) {
        if (day < 30 && month != 2 && month < 12) {
            day++;
        }
        return day+month+year;
    }
    public static int changeMonthOdd(int day,int month,int year){
        if(day==30&&(month==2|month==4|month==6|month==9|month==11)&&month<12){
            month++;
            day=1;
        }
        return day+month+year;
    }
    public static int changeMonthEven(int day,int month,int year){
        if(day==31&&(month==1|month==3|month==5|month==7|month==8|month==10)&&month<12){
            month++;
            day=1;
        }
        return day+month+year;
    }
    public static int changeYear(int day,int month,int year){
        if(day==31&&month==12){
            year++;
            day=1;
            month=1;
        }
        return day+month+year;
    }
}