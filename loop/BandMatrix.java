public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int w = Integer.parseInt(args[1]);
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (c >= r - w && c <= r + w)
                    System.out.print("*  ");
                else
                    System.out.print("0  ");
            }
            System.out.println(); 
        }
    }
}
