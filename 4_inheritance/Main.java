public class Main{
    public static void main(String[] args) {
        Object obj = new Object();
        Object obj2 = obj;
        System.out.println(obj == obj2);
        System.out.println(obj2.hashCode());
        System.out.println(obj.hashCode());
        System.out.println(obj.equals(obj2));
        System.out.println(obj.toString());
    }
}