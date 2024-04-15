import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ 
          int count = 0;
	  while (num>=9){
		num=num/10;
		count++;
	  }
	  int [] digitList = new int [count];
	  for(int i=0;i<count;i++){
		 digistList[i]=num%(10*i);
	  }
	}

	public boolean isStrictlyIncreasing()
	{ 
		int low = digitList[0];
		for(int i=0;i<digitList.length;i++){
			if(digitList[i]<low){
				return false;
			}else{
				low = digitList[i];
			} 
		}return true;
	}

	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
