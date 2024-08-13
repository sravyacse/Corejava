public class MethodOverloading{
    public void m1(String s){
        System.out.println("String arg");
    }
    public void m1(StringBuffer s){
        System.out.println("StringBuffer arg");
    }
    public void m1(Object o){
        System.out.println("Object type arg");
    }

    public static void main(String[] args){
        MethodOverloading m = new MethodOverloading();
        m.m1(new StringBuffer());
        //m.m1(null);
        m.m1("Hello");
    }
}