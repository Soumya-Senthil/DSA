
public class TriangleStar {

	public static void main(String[] args) {
		
		int n=11;
		for(int i=1; i<=n;i++) {
			String str="";
			
			for(int j=1;j<=n-i;j++) {
				str+=' ';
			}
			for(int j=2;j<=2*i;j++) {
				
				if(j==2 || j==2*i)				
				str+='*';
				
				else
					str+=' ';
			}
			
			
			System.out.println(str);
		}
		
		for(int i=1; i<n;i++) {
			String str="";
			for(int j=1;j<=i;j++) {
				str+=' ';
			}
			for(int j=2;j<=2*(n-i);j++) {
				if(j==2 || j==2*(n-i))				
				str+='*';
				
				else
					str+=' ';
			}
			
			for(int j=1;j<=i;j++) {
				str+=' ';
			}
			System.out.println(str);
		}
	}

}
