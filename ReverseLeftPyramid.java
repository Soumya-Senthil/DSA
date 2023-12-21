
public class ReverseLeftPyramid {

	public static void main(String[] args) {
		for(int i=1; i<=5;i++) {
			String str="";
			for(int j=1;j<=6-i;j++) {
				str+='*';
			}
			System.out.println(str);
		}
	}

}
