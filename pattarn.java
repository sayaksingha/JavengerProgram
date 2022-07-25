package sayakAvengerTelueskoprog;

class pattarn {
	
	 public static void main(String sayak[]){
      int n=11; System.out.println(" \n\n-----------------------------------------------------------------------------------------------------------------\n\n");
      //Thanks
      
      for(int i=1;i<=n;i++) {
    	  
    	  //T
    	  for(int j=1;j<=n;j++) {
    		  if(i==1||j==n/2+1) {
    			  System.out.print("*");
    		  }
    		  else {
    			  System.out.print(" ");
    		  }
      }
    	  //H
    	  
    	  System.out.print("\t");
    	  for(int j=1;j<=n;j++) {
    		  if(i==((n/2)+1)||j==n||j==1) {
    			  System.out.print("*");
    		  }
    		  else {
    			  System.out.print(" ");
    		  }
      }
    	  //A
    	  
    	  System.out.print("\t");
    	  for(int j=1;j<=n;j++) {
    		  if(j==n||j==1||i==1||i==n/2+1) {
    			  System.out.print("*");
    		  }
    		  else {
    			  System.out.print(" ");
    		  }
      }
    	//N
    	  
    	  System.out.print("\t");
    	  for(int j=1;j<=n;j++) {
    		  if(j==n||j==1||i==j) {
    			  System.out.print("*");
    		  }
    		  else {
    			  System.out.print(" ");
    		  }
      }
    	  //K
    	  
    	  System.out.print("\t");
    	  for(int j=1;j<=n;j++) {
    		  if(j==1||i-j==n/2||i+j==n/2+2) {
    			  System.out.print("*");
    		  }
    		  else {
    			  System.out.print(" ");
    		  }
      }
    	  //S
    	  
    	  System.out.print("");
    	  for(int j=1;j<=n;j++) {
    		  if(j==1&&i<=n/2||i==1||j==n&&i>=n/2+1||i==n||i==n/2+1) {
    			  System.out.print("*");
    		  }
    		  else {
    			  System.out.print(" ");
    		  }
      }
          System.out.println();
	
      }
      
      //NEW LINE 
     System.out.println("\n\n");
     
      //INEWRON PRINT
   
      
      for(int i=1;i<=n;i++) {
    	  
    	  //I
    	  for(int j=1;j<=n;j++) {
    		  if(i==1||j==n/2+1||i==n) {
    			  System.out.print("*");
    		  }
    		  else {
    			  System.out.print(" ");
    		  }
      }
    	  //N
    	  
    	  System.out.print("\t");
    	  for(int j=1;j<=n;j++) {
    		  if(j==n||j==1||i==j) {
    			  System.out.print("*");
    		  }
    		  else {
    			  System.out.print(" ");
    		  }
      }
    	  //E
    	  
    	  System.out.print("\t");
    	  for(int j=1;j<=n;j++) {
    		  if(i==1||i==((n/2)+1)||i==n||j==1) {
    			  System.out.print("*");
    		  }
    		  else {
    			  System.out.print(" ");
    		  }
      }
    	  //W
    	  
    	  System.out.print("\t");
    	  for(int j=1;j<=n;j++) {
    		  if(j==1||j==n||i+j==n+1&&j<=n/2+1||i==j&&j>=n/2+1) {
    			  System.out.print("*");
    		  }
    		  else {
    			  System.out.print(" ");
    		  }
      }
    	  //R
    	  
    	  System.out.print("\t");
    	  for(int j=1;j<=n;j++) {
    		  if(j==1||i==n/2+1||i==1||j==n&&i<=n/2+1||i==j&&i>n/2) {
    			  System.out.print("*");
    		  }
    		  else {
    			  System.out.print(" ");
    		  }
      }
    	  //O
    	  
    	  System.out.print("\t");
    	  for(int j=1;j<=n;j++) {
    		  if(j==1&&i>=2||i==1&&j>=2||j==n||i==n) {
    			  System.out.print("*");
    		  }
    		  else {
    			  System.out.print(" ");
    		  }
      }
    	  //N
    	  

    	  System.out.print("\t");
    	  for(int j=1;j<=n;j++) {
    		  if(j==n||j==1||i==j) {
    			  System.out.print("*");
    		  }
    		  else {
    			  System.out.print(" ");
    		  }
      }
    	  System.out.println();
	 }
      System.out.println("\n");
    //END
      System.out.println("--------------------------------------------------------------------------------------------------------------------");
}
}