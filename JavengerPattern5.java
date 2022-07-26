 class JavengerPattern5 {
	public static void main(String[] args) {
		System.out.println("\n\n\n");
	 	int n=13;
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=n;j++) {
    		if(i==1||i==n||i-j>=n/2||i+j<=n/2+2)	{
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
