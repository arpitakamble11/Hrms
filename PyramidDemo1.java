import java.util.*;
class PyramidDemo1{
public static void main(String[] args){
int rc=5,spacecount=4,starcount=1;
for(int i=1;i<=rc;i++){
 System.out.println();

       for(int j=1;j<=spacecount;j++){
	      System.out.print(" ");
	   }
	   for(int k=1;k<=spacecount;k++){
	      System.out.print("*");
	   }
	   spacecount--;
	   starcount =starcount+2;

}


}
}