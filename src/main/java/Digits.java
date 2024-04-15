import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ 
	  for(int i=0;i<count;i++){
		 digitList[i].add(num%(10*i));
	  }
	}

	public boolean isStrictlyIncreasing()
	{ 
		int low = digitList.get(0);
		for(int i=0;i<digitList.size();i++){
			if(digitList.get(i)<low){
				return false;
			}else{
				low = digitList.get(i);
			} 
		}return true;
	}

	
	
	public String toString()
	{
		return digitList.toString();
	}
}
