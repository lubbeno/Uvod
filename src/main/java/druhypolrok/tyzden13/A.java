package druhypolrok.tyzden13;

public class A {

    private String a = "A";

    public void testA(){
        System.out.println( "A trieda");
    }
}

class B {
  public String b = "B";

   private void testB(){
       System.out.println( "trieda B");
   }
}

class C{

    void testC(){
        A a1 = new A();
       // String zobrazA = a1.a; nefunguje lebo a je private
            a1.testA();
        B b1 = new B();
        String zobrazb = b1.b;
        // b1.testB(); nefunguje lebo je private
    }

}