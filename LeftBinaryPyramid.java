
public class LeftBinaryPyramid {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			String str="";
			for(int j=0;j<=i;j++) {
				if((i+j)%2==0)
					str+=1;
					else
						str+=0;
			}
			System.out.println(str);
		}

	}

}
