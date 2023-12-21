
public class LeftPyramidAlphabet {

	public static void main(String args[]) {
	
		for(int i=1; i<=5;i++) {
			String str="";
			for(char ch = 'A'; ch<'A'+(6-i);ch++) {
				str+=ch;
			}	
									
			System.out.println(str);
		}
		
	}

}



