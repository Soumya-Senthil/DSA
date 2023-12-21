
public class LeftPyramidIteration {

	public static void main(String[] args) {
		int count=1;
		for(int i=1; i<=5;i++) {
			String str="";
			
			for(int j=1;j<=i;j++) {
				str+=count;
				str+=' ';
				count++;
				
			}
			
						
			System.out.println(str);

	}

}
}
