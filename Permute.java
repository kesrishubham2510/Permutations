import java.util.HashSet;
import java.util.Set;

public class Permute {

	String input;
	
	Permute(String val)
	{
		input=val;
		Find_Permutations(input,0,input.length()-1);
		Print_Result_Set();
	}
	
	static Set<String> Permutations = new HashSet<String>();
	
	private void Find_Permutations(String input,int left_index,int right_index)
	{
		if(left_index==right_index)
		  Permutations.add(input);
		
		else
		{
			for(int i=left_index;i<=right_index;i++)
			{
				input = Swap(input,left_index,i);
				Find_Permutations(input,left_index+1,right_index);
				input = Swap(input,left_index,i);
			}
		}
	}
	
	private String Swap(String input,int index_1,int index_2)
	{
		char []input_Array = input.toCharArray();
		String Result ;
		char temp;
		
		temp=input_Array[index_1];
		input_Array[index_1]=input_Array[index_2];
		input_Array[index_2]=temp;
		
		Result=String.valueOf(input_Array);
		return Result;		
	}
	
     protected void Print_Result_Set()
     {
    	 System.out.println(Permutations);
     }
}
