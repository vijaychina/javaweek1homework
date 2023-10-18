public class Programme_2 {
    /**
     * static variable - class
     * scope - within the class
     * memory allocation - when class is loaded
     * store - non heap memory
     */
    static int a = 20; // a is a static or Global variable
    static int b = 40; // b is b static or Global variable

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(Programme_2.a);
        System.out.println(b);
        System.out.println(Programme_2.b);
    }
    public void v1(){
        System.out.println(a);
        System.out.println(Programme_2.a);
        System.out.println(Programme_2.b);
    }

}
