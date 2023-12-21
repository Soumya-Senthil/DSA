//Striver 22 InnerReducing Pattern

public class Striver21 {

	public static void main(String[] args) {
		int n=5;
		
		int size=n*2-1;
		int front=0; 
		int last=size-1;
		int a[][]=new int[10000][10000];
		
		while(n!=0) {					
		
		for(int i=front; i<=last; i++) {
			//String str=" ";
			for(int j=front; j<=last; j++) {
				if(i==front || i==last||j==front||j==last) 
				{					a[i][j]=n;
					}		
			}			
		}
		front++;
		last--;
		n--;
	}				
			
for(int i=0; i<size;i++) {
	String str="";
	for(int j=0; j<size;j++) {
		str+=a[i][j];
		
	}
	System.out.println(str);

}
	}
}
