import java.util.ArrayList;
import java.util.Scanner;
public class hw0502_b10115004_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack list=new MyStack();
		Scanner input=new Scanner(System.in);
		int i;
		for(i=0;i<5;i++)
		{
			list.push(input.next());
		}
		for(i=0;i<5;i++)
		{
			System.out.print(list.pop());
		}
		
	}

}
class MyStack extends ArrayList {
	  

	  public boolean isEmpty() {
	    return super.isEmpty();
	  }

	  public int getSize() {
	    return super.size();
	  }

	  public Object peek() {
	    return super.get(getSize() - 1);
	  }

	  public Object pop() {
	    Object o = super.get(getSize() - 1);
	    super.remove(getSize() - 1);
	    return o;
	  }

	  public Object push(Object o) {
		  super.add(o);
	    return o;
	  }

	  public int search(Object o) {
	    return super.lastIndexOf(o);
	  }

	  /** Override the toString in the Object class */
	  public String toString() {
	    return "stack: " + super.toString();
	  }
	}