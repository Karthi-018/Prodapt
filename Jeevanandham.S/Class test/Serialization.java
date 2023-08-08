class Serialization implements Serializable
{
	
	public static void object(Song obj)
	{

		 try
                (FileOutputStream fis = new FileOutputStream("file.txt");
                 ObjectOutputStream oos = new ObjectOutputStream(fis);)
        	{
            		oos.writeObject(obj);
            		System.out.println("success");
        	}
        	catch (Exception e){
            		System.out.println(e);
        	}
	}
}