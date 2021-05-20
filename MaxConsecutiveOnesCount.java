class MaxConsecutiveOnesCount{
	public static void main(String arg[]){
		int count=0,previousCount=0;
		int array[]={0,1,0,1,0,0,1,1,1,0,0,0,1,1,1,1,1};
			for(int i=0;i<array.length;i++){
				if(array[i]%2!=0)
					count++;
				else
					if(count>=previousCount){
						previousCount=count;
						count=0;
					}
			}
			if(count>=previousCount)
				System.out.println("Maximum number of consecutive ones = " + count);
			else
				System.out.println("Maximum number of consecutive ones = " + previousCount);
	}
}