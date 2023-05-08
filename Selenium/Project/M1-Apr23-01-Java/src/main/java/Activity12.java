
interface Addable1 {
    abstract int sum(int a, int b);
}
public class Activity12 {
    public static void main(String[] args) {
Addable1 ad1= (a,b)-> (a+b);
        System.out.println(ad1.sum(10,20));
        Addable1 ad2 =(a,b)-> {
            return (a+b);
          //  return  ad2.sum(10,30);

        };
        System.out.println(ad2.sum(10,20));
    }
}
