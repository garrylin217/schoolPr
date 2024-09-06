
	  
     class Test{
	 public static void main(String args[]){
	     String str="";
	     z:
	     for(int x=0;x<3;x++){
	         for(int y=0;y<2;y++){
	             if(x==1) break;
	             if(x==2) break z;
	             str=str+x+y;
	          }
	      }
	      System.out.println(str);
	     }
	 }



	
