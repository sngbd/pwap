public class HelloGoodbye
{
    public static void main(String[] args)
    {
        String a = args[0];
        String b = args[1];
        String hello = "Hello " + a + " and " + b + ".";
        String goodbye = "Goodbye " + b + " and " + a + ".";
        System.out.println(hello);
        System.out.println(goodbye);
    }
}
