public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        double t = Integer.parseInt(args[1]);
        double rand;
        int steps = 0;
        for (int i = 0; i < t; i++) {
            int x = 0;
            int y = 0;
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
                steps += 1;
            }
        }
        String res = "average number of steps = ";
        double avg = steps / t;
        System.out.println(res + avg);
    }
}
