
public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= new int[]{1,3,2,7,6,4,5};
		int i=0,j=0,min=0,temp;
		for(i=0;i<a.length-1;i++){
			min =i;
			for(j=i+1;j<a.length;j++){
				if(a[j]<a[min]){
					min = j;
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		for(i=0;i<a.length;i++){
			System.out.println(a[i]);
		}

	}

}
