class  DataContainer
{
	public static void main(String[] args) 
	{
		Object[] data = new Object[5];
		data[0] = 101;
		data[1] = "Snehal";
		data[2] = "Bhadrak";
		data[3] = 8.17;
		data[4] = "Java Developer";
		for(Object sc : data){
			//System.out.println(sc);
			
			// Using getClass() to get the data type
            System.out.println("Value: " + sc + ", Type: " + sc.getClass().getName());
		}
	}
}
