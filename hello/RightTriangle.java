public class RightTriangle
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int max = Math.max(c, Math.max(a,b));
        int min = Math.min(c, Math.min(a,b));
        int mid = a + b + c - (max + min);
        boolean side = (max*max == min*min + mid*mid) && (min > 0 && max > 0 && mid > 0);
        System.out.println(side);
     }
}
