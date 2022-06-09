public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int steps = 0;
        double rand;
        System.out.println("(" + x + ", " + y + ")");
        while (Math.abs(x) + Math.abs(y) != r) {
            rand = Math.random();
            if (rand < 0.25)
                x -= 1;
            else if (rand < 0.50)
                y -= 1;
            else if (rand < 0.75)
                x += 1;
            else 
                y += 1;
            System.out.println("(" + x + ", " + y + ")");
            steps += 1;
        }
        System.out.println("steps = " + steps);
    }
}
