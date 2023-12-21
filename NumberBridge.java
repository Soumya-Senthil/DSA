
public class NumberBridge {

	public static void main(String[] args) {
		for(int i=1; i<5;i++) {
			String str="";
			for(int j=1;j<=i;j++) {
				str+=j;
			}
			for(int j=1;j<5-i;j++) {
				str+=' ';
			}
			for(int j=1;j<5-i;j++) {
				str+=' ';
			}
			//for(int j=1;j<=i;j++) {
				//str=str+((i-j)+1);
			//}
			for(int j=i;j>=1;j--) {
				str=str+j;
			}
			System.out.println(str);
		}
		

	}

}
