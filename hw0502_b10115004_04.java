import java.util.*;


public class hw0502_b10115004_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> list=new ArrayList<Double>();
		Scanner input=new Scanner(System.in);
		int i;
		for(i=0;i<5;i++)
		{
			list.add(input.nextDouble());
		}
		System.out.println(sum(list));
		
	}
	public static double sum(ArrayList<Double> list)
	{
		int i,j=0;
		for(i=0;i<5;i++)
		{
			j+=list.get(i);
		}
		return j;
	}
	
}
