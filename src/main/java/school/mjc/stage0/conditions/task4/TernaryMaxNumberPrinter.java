package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int result = first > third && first > second?
                result = first:
                second > third ? second : third;
        System.out.println(result);
    }
}
