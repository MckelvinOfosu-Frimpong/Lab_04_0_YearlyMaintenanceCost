public class Main {

    public static void main(String[] args)
    {
	int winterCost = 500;
    int springCost = 480;
    int summerCost = 610;
    int fallCost = 260;
    int yearlyCost = winterCost + springCost + summerCost + fallCost;

        System.out.println("Your cost per season is: ");
        System.out.println("Winter $ " + winterCost);
        System.out.println("Spring $ " + springCost);
        System.out.println("Summer $ " + summerCost);
        System.out.println("Fall $ " + fallCost);
        System.out.println("Your yearly total is $ " + yearlyCost);
    }
}
