
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NextDayCalculatorTest {
    @Test
    public void TestDay(){
        int day =23;
        int month =3;
        int year= 2016;
        int expected = 2043;
        int result = NextDayCalculator.changeDay(day,month,year);
        assertEquals(result,expected);
    }
    @Test
    public void TestMonthOdd(){
        int day =30;
        int month=4;
        int year=2012;
        int expected = 2018;
        int result = NextDayCalculator.changeMonthOdd(day,month,year);
        assertEquals(result,expected);
    }
    @Test
    public void TestMonthEven(){
        int day =31;
        int month=8;
        int year=2010;
        int expected = 2020;
        int result = NextDayCalculator.changeMonthEven(day,month,year);
        assertEquals(result,expected);
    }
    @Test
    public void TestYear(){
        int day =31;
        int month=12;
        int year=2021;
        int expected = 2024;
        int result = NextDayCalculator.changeYear(day,month,year);
        assertEquals(result,expected);
    }
}
