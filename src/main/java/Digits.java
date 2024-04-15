import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ 
	  digitList = new ArrayList <Integer>();
	  if(num=0)
          	digitList[i].add(0);
	  int n = num;
	  while(n>0)
		 digitList[i].add(0,num%10));
		 n = n/10
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
