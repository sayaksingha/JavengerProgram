

 class JavengerPattern3 {
   public static void main(String a[]) {
	 	int n=13;
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=n;j++) {
    		if(i==1||j==1||j==n||i==n||i+j<=n/2+1||j-i>=n/2)	{
    			System.out.print("*");
    		}
    		else {
    			System.out.print(" ");
    		}
    		}
    		System.out.println();
    	}
   }
}
