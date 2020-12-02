package qa_iasa;

public class Task3 {

    public static int digitalRoot(int n){
        int res = String
            .valueOf(n)
            .chars()
            .mapToObj(i -> new Integer(String.valueOf((char)i)))
            .peek(System.out::println)
            .reduce(0,(sum,digit)->sum+digit)
        ;
        return (res>9 ? digitalRoot(res) : res);
    };

}