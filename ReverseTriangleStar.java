
public class ReverseTriangleStar {


	public static void main(String[] args) {
		
		int n=6;
		for(int i=0; i<n;i++) {
			String str="";
			for(int j=1;j<=i;j++) {
				str+=' ';
			}
			for(int j=2;j<=2*(n-i);j++) {
				str+='*';
			}			
			
			System.out.println(str);
		}
	}

}
