public class LeftpyramidFull {	
		public static void main(String[] args) {
			
			
			for(int i=0;i<5;i++) {
				String str="";
				for(int j=0;j<=i;j++) {
					str+='*';
				}
				System.out.println(str);
			}			
			
			for(int i=2; i<=5;i++) {
				String str="";				
				for(int j=1;j<=6-i;j++) {
					str+='*';
				}							
				
				System.out.println(str);
			}
			
		}

	}


