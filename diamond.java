
public class diamond {

	public static void main(String[] args) {
		 int n = 11;

		    for (int i = 0; i < n; i++)
		    {
		       String str="";
		        for (int j = 0; j < n; j++)
		        {
		            //Upper Half of Hollow Star
		            if (j == (n / 2 - i) || j == (n / 2 + i))
		            	 str+="*";
		            //Lower Half of Hollow Star
		            else if (j == (i - n / 2) || j == n - (i - n / 2) - 1)
		            	str+="*";
		            else
		            	str+=" ";
		        }
		        
		        System.out.println(str);
		    }

	}

}
