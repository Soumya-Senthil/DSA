
public class slantpattern {

	public static void main(String[] args) {
	int n=5;
		
		for(int i=1; i<=n;i++) {
			String str="";
			
			for(int j=1;j<=2*n-1;j++) {		
			
			if((i+j)<=n ||(i+j)>=2*n+1) {
				
				str+=" ";
				
			}
				else
					
					str+="*";
			
		}
			System.out.println(str);
	}

}
}
