package JavaPackage;

public class VisitorCounter {

    private static int ctr;

    public static int readCounterValue() {
        ctr++;
        return ctr;
    }
}
