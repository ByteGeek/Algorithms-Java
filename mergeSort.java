
public class mergeSort {
	public int lengths;
	public int numbers[];
	public int helper[];
	
	public static void main(String[] args){
		int inputArr[] =  new int[]{1,4,3,7,5,4,8};
		mergeSort m = new mergeSort();
		m.sort(inputArr);
	}
	
	public void sort(int[] values){
		this.lengths= values.length;
		this.numbers = values;
		this.helper= new int[lengths];
		int low=0;
		int high = numbers.length-1;
		this.MergeSort(low,high);
		for(int i=0;i<lengths;i++){
			System.out.println(numbers[i]);
		}
	}
	
	public void MergeSort(int low, int high){
		int mid = (low+high)/2;
		if(low<high){
			MergeSort(low,mid);
			MergeSort(mid+1,high);
			merge(low,mid,high);
		}	
	}	
	
	public void merge(int low, int mid, int high){
		int i=0;
		for(i=low; i<=high; i++){
			helper[i]=numbers[i];
		}
		i = low;
		int j= mid+1;
		int k= low;
		while(i<=mid && j<=high){
			if(helper[i]<helper[j]){
				numbers[k]=helper[i];
				i++;
			}else{
				numbers[k]=helper[j];
				j++;
			}
			k++;
		}
		/*Copy the remanining of the left side array in to target array*/
		while(i<=mid){
			numbers[k]=helper[i];
			i++;
			k++;
		}
	}

}
