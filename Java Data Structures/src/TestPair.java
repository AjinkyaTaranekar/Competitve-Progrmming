public class TestPair {
    public static void main(String[] args) {
        Pair<Integer,Integer> pair1=new Pair<>(4,5);
        Pair<Integer,Integer> pair2=new Pair<>(4,5);

        System.out.println(pair1.isEqualTo(pair2));
        System.out.println(pair1.isLessThan(pair2));
        System.out.println(pair1.isGreaterThan(pair2));
        System.out.println(pair1.isLessThanEqualTo(pair2));
        System.out.println(pair1.isGreaterThanEqualTo(pair2));
    }
}
