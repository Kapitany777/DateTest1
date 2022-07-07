import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main
{
    private static void example1()
    {
        var dateFormat = new SimpleDateFormat("yyyyMMdd");

        try
        {
            var date = dateFormat.parse("Bad data!!!");
            System.out.println(date.toString());
        }
        catch (ParseException e)
        {
            System.out.println("Example1: Invalid date!");
        }
    }

    private static void example2()
    {
        var dateFormat = new SimpleDateFormat("yyyyMMdd");

        try
        {
            var date = dateFormat.parse("20220705");
            System.out.println(date.toString());
        }
        catch (ParseException e)
        {
            System.out.println("Example2: Invalid date!");
        }
    }

    private static void example3()
    {
        var dateFormat1 = new SimpleDateFormat("yyyyMMdd");
        var dateFormat2 = new SimpleDateFormat("yyyy.MM.dd.");

        try
        {
            var date = dateFormat1.parse("20220705");
            System.out.println(dateFormat2.format(date));
        }
        catch (ParseException e)
        {
            System.out.println("Example3: Invalid date!");
        }
    }

    private static void example4()
    {
        var dateFormat = new SimpleDateFormat("yyyyMMdd");

        try
        {
            var date1 = dateFormat.parse("20220705");
            var date2 = dateFormat.parse("20220708");

            System.out.println("Before: " + date1.before(date2));
            System.out.println("After : " + date1.after(date2));
        }
        catch (ParseException e)
        {
            System.out.println("Example4: Invalid date!");
        }
    }

    private static void example5()
    {
        var dateFormat = new SimpleDateFormat("yyyyMMdd");

        try
        {
            var date1 = dateFormat.parse("20220705");
            var date2 = dateFormat.parse("20220708");

            long days1 = TimeUnit.DAYS.convert(date2.getTime() - date1.getTime(), TimeUnit.MILLISECONDS);
            System.out.println("date2 - date1 = " + days1 + " days");

            long days2 = TimeUnit.DAYS.convert(date1.getTime() - date2.getTime(), TimeUnit.MILLISECONDS);
            System.out.println("date1 - date2 = " + days1 + " days");
        }
        catch (ParseException e)
        {
            System.out.println("Example4: Invalid date!");
        }
    }

    private static void example6()
    {
        var dateFormat = new SimpleDateFormat("yyyyMMdd");

        try
        {
            var date1 = dateFormat.parse("20220705");

            var today = new Date();
            System.out.println("Today is " + new SimpleDateFormat("yyyy.MM.dd.").format(today));

            long days1 = TimeUnit.DAYS.convert(today.getTime() - date1.getTime(), TimeUnit.MILLISECONDS);
            System.out.println("today - date1 = " + days1 + " days");

            long days2 = TimeUnit.DAYS.convert(date1.getTime() - today.getTime(), TimeUnit.MILLISECONDS);
            System.out.println("date1 - today = " + days1 + " days");
        }
        catch (ParseException e)
        {
            System.out.println("Example4: Invalid date!");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Comparing dates");

        System.out.println("Date example 1");
        example1();
        System.out.println();

        System.out.println("Date example 2");
        example2();
        System.out.println();

        System.out.println("Date example 3");
        example3();
        System.out.println();

        System.out.println("Date example 4");
        example4();
        System.out.println();

        System.out.println("Date example 5");
        example5();
        System.out.println();

        System.out.println("Date example 6");
        example6();
        System.out.println();
    }
}