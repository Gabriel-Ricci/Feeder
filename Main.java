public class Main 
{
       public static void main(String[] args) 
    {
        Feeder i = new Feeder(500);
        i.simulateOneDay(12);
        System.out.println(i);
        Feeder a = new Feeder(1000);
        a.simulateOneDay(22);
        System.out.println(a);
        Feeder n = new Feeder(100);
        n.simulateOneDay(5);
        System.out.println(n);
        Feeder j = new Feeder(2400);
        System.out.println(j.simulateManyDays(10, 4));
        Feeder p = new Feeder(250);
        System.out.println(p.simulateManyDays(10, 5));
        Feeder l = new Feeder(0);
        System.out.println(l.simulateManyDays(5, 10));
    }
}