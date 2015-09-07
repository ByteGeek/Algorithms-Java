
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[]{1,3,2,5,4,7,6};
		int length = a.length;
		int i=0,j=0,key=0;
		for(i=1;i<length;i++){
			key =a[i];
			j=i-1;
			while(j>=0&&a[j]>key){
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=key;
		}
		for(i=0;i<length;i++)
		System.out.println(a[i]);
	}

}
