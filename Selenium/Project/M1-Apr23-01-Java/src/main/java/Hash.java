import java.util.HashMap;
import java.util.Map;

public class Hash {
    public static void main(String[] args) {


    HashMap<Integer,String> hashMap = new  HashMap<Integer, String>();
    hashMap.put(1,"Green");
        hashMap.put(2,"red");
        hashMap.put(3,"black");
        hashMap.put(4,"white");
        hashMap.put(5,"yellow");
        System.out.println("arraylist size is after removal of 1st colour" + hashMap.remove(1));
}}
