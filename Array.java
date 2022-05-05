class Array
{
	 public static void main(String[] args) 
	 {
		int[] numbers={ 2, 9,7,6,5,8,1,77,99,66,22,33,44};
		int sum=0;
		Double average;
		for(int number:numbers){
			sum+=number;
		}
		int arrayLength=numbers.length;
		average=  ((double)sum / (double) arrayLength);
		System.out.println("Sum="+sum);
		System.out.println("Average="+average);
	}

}