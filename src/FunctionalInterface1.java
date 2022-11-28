@FunctionalInterface
public interface FunctionalInterface1 {
    void m1();//one abstract method
    //void m2();
   //one default method
    default void m2(){
        System.out.println("default");
    }

}
class main{
    public static void main(String[] args) {
       FunctionalInterface1 i=()->{System.out.println("hello");};
       //call method
        i.m1();
        i.m2();
    }
}
