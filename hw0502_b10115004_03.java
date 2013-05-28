import java.util.*;

public class hw0502_b10115004_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		Scanner input=new Scanner(System.in);
		int i;
		for(i=0;i<5;i++)
		{
			list.add(input.nextInt());
		}
		sort(list);
		System.out.println(list);
	}
	public static void sort(ArrayList<Integer> list)
	{
		int i,j,k;
		for(i=0;i<4;i++)
		{
			for(j=i+1;j<5;j++)
			{
				if(list.get(i)>list.get(j))
				{
					k=list.get(j);
					list.remove(j);
					list.add(i,k);
					

				}
				
			}
		}
	}

}
