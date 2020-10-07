public class Pair<T,U> implements Comparable<Pair>{
    private T first;
    private U second;
    Pair(T first,U second){
        this.first=first;
        this.second=second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public int compareTo(Pair o) {
        String f1=this.getFirst().toString();
        String s1=this.getSecond().toString();
        String f2=o.getFirst().toString();
        String s2=o.getSecond().toString();
        if(f1.equals(f2)&&s1.equals(s2))
            return 0;
        if(f1.compareTo(f2)==0)
            return s1.compareTo(s2);
        else return f1.compareTo(f2);
    }

    //Returns true if both the components of the pair are equal
    public boolean isEqualTo(Pair a){
        return this.compareTo(a) == 0 ;
    }

    //Retuns true if  the 'first' parameter of this Pair is less than the given pair.
    //If they are equal then it checks for the 'second' parameter
    public boolean isLessThan(Pair a){
        return this.compareTo(a)<0;
    }

    //Retuns true if  the 'first' parameter of this Pair is greater than the given pair.
    //If they are equal then it checks for the 'second' parameter
    public boolean isGreaterThan(Pair a){
        return this.compareTo(a)>0;
    }

    //Retuns true if  the 'first' parameter of this Pair is less than or equal to the given pair.
    //If they are equal then it checks for the 'second' parameter
    public boolean isLessThanEqualTo(Pair a){
        return this.isLessThan(a)||this.isEqualTo(a);
    }

    //Retuns true if  the 'first' parameter of this Pair is greater than or equal to the given pair.
    //If they are equal then it checks for the 'second' parameter
    public boolean isGreaterThanEqualTo(Pair a){
        return this.isGreaterThan(a)||this.isEqualTo(a);
    }
}
