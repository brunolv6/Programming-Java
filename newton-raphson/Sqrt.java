public class Sqrt
{
    public static void main(String[] args)
    {
        double number = Double.parseDouble(args[0]);

        double EPS = 1E-5;
        
        double anwser = (number + number/2)/2;

        while(Math.abs( ((anwser)*(anwser)) - number ) > EPS){
            anwser = (anwser + (number/anwser))/2;
        }

        System.out.println(anwser);
    }
}