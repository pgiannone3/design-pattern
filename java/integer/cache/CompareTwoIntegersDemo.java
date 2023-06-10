package integer.cache;

/*
        * The code creates two Integer objects with the value 128 and assigns them to variables i1 and i2.
        * In Java, Integer objects are immutable and in some cases can be stored in an internal cache within
        * the JVM, so that two Integer objects with the same value have the same reference.
        * However, this internal cache is limited and works only for a predefined range of values,
        * typically between -128 and 127. Thus, in the case of i1 and i2, since the value 128 is not within this range,
        * Java creates two separate Integer objects, each with its own reference.
        * So when you compare the two references with ==, the result is false because the two objects are not the same.
        * In the case of i3 and i4, however, both values are within the range of the internal cache,
        * so Java uses the same Integer object for both variables. In this case,
        * when you compare the two references with ==, the result is true because you are comparing
        * the same instance of the Integer object.
 */

public class CompareTwoIntegersDemo {
    public static void main(String[] args) {

        Integer i1 = 128;
        Integer i2 = 128;

        Integer i3 = 100;
        Integer i4 = 100;

        System.out.println(i1 == i2);
        System.out.println(i3 == i4);
    }
}
