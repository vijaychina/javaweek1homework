public class Programme_1 {
    /**
     * / Instance object
     * Scope within the class
     * memory allocation - when object is created
     * Memory - heap
     */
    int a = 20; // a is a Instance or Global variable
    int b = 40; // b is b  Instance or Global variable


    public static void main(String[] args) {
        Programme_1 obj = new Programme_1();
        System.out.println(obj.a);
        System.out.println(obj.b);

    }
    public void myMethod(){
        Programme_1 v1 = new Programme_1();
        Programme_1 v2 = new Programme_1();
        System.out.println(v1.a);
        System.out.println(v2.b);
    }

}
