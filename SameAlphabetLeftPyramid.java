
public class SameAlphabetLeftPyramid {

	public static void main(String[] args) {
	int N=5;
	for(int i=0;i<N;i++){
        
        String str="";
        for(int j=0;j<=i;j++){
            
            str+=(char)('A'+i);
			
		}
        
        System.out.println(str);
		
	}

}
}

	