import java.util.*;


public class hw0502_b10115004_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		int i;
		for(i=0;i<10;i++)
		{
			list.add((int)(Math.random()*100));
		}
		System.out.println(list);
		shuffle(list);
	}
	public static void shuffle(ArrayList<Integer> list)
	{
		int i,j;
		for(i=0;i<10;i++)
		{
			j=list.get(i);
			list.remove(i);
			list.add((int)(Math.random()*10),j);
		}
		System.out.println(list);
	}

}

