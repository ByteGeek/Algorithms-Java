
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[]{1,5,6,2,9,3,11,8,7};
		int i=0,j=0,temp=0;
		for (i=0;i<a.length;i++){
			for (j=i;j<a.length-1;j++){
				temp =0;
				if(a[j]>a[j+1]){
					temp =a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
			
	}

}
