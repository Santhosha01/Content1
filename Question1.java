
public class Question1 {

	public static void main(String[] args) {
		int arr[]= {6,7,5,3,2,1};
		int min=arr[0],max=0;
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				index=i;
			}
		}
	     if(index==arr.length) {
	    	 System.out.println(0);
	     }
	     else {
		   for(int j=index;j<arr.length;j++) {
			   if(arr[j]>max) {
				   max=arr[j];
			   }
		   }
		   int diff=max-min;
		   System.out.println(diff);
	     }
	}

}
