
public class trianglereversepattern {
	public static void main(String[] args) {
		
		//Striver 19 and 20 can be solved b reversing order of the following two blocks
		
		int n=5;
		
		
		for(int i=1; i<n;i++) {
			String str="";
			
			for(int j=1;j<=n-i;j++) {
				str+='*';
			}
			for(int j=1;j<=i;j++) {
				str+=' ';
			}
			for(int j=2;j<=i;j++) {
				str+=' ';
			}	
			for(int j=1;j<=n-i;j++) {
				str+='*';
			}
			
			System.out.println(str);
		}
		
		for(int i=1; i<n;i++) {
			String str="";
			for(int j=1;j<=i;j++) {
				str+='*';
			}
			for(int j=1;j<=n-i;j++) {
				str+=' ';
			}
			for(int j=2;j<=n-i;j++) {
				str+=' ';
			}
			for(int j=1;j<=i;j++) {
				str+='*';
			}
			System.out.println(str);
		}
		
	}

}
