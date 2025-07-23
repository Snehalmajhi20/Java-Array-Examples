class Array2D 
{
	public static void main(String[] args) 
	{
		int [] [] num = {{1,2,3},{5,6,7},{8,45}};
		
		System.out.println("Length of the first row: " + num[0].length);
        System.out.println("Length of the second row: " + num[1].length);
        System.out.println("Length of the third row: " + num[2].length);
		System.out.println("------------------------------------------");
		System.out.println(" 2D array ");
		System.out.println("------------------------------------------");
		
		//using for loop
		
		for(int i = 0; i<num.length; i++){
			for(int j=0; j<num[i].length; j++){
				System.out.println(num[i][j]);
			}
			System.out.println();
		}
		
		// for each loop
		
		/*for(int [] a : num){
			for(int element : a){
				System.out.println(element);
			}
			System.out.println();
		}
		*/
	}
}
