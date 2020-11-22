public class Montecarlo
{
    public static void main(String[] args)
    {
        // receive stack, goal, experiments
        int intialStack = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int experiments = Integer.parseInt(args[2]);

        // count of achievement to the target, which is the goal
        int target = 0;

        // simulated stack in each experiment
        int stack = intialStack;

        // loop over experiments
        for(int i = 0; i < experiments; i++){
            stack = intialStack;

            // loop over each bet
            while(stack > 0 && stack < goal){
                // randomized equally probability
                if(Math.random() > 0.5){
                    stack++;
                } else {
                    stack--;
                }
            }

            // if reach the goal, add one in win the experiment
            if(stack == goal) target++; 
        }

        // we should have goal/stack == target/experiments
        System.out.printf("Ganhamos em %d de %d\n", target, experiments);
    }
}