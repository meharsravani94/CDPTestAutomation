package main.java.com.cdp.Scripts;

public class jsonapitest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		public static void main( String[] args ) throws IOException, ProcessingException
		{
		    File schemaFile = new File("/Users/XYZ/schema.json");
		    File jsonFile = new File("/Users/XYZ/data.json");
		    	
		    if (ValidationUtils.isJsonValid(schemaFile, jsonFile)){
		    	System.out.println("Valid!");
		    }else{
		    	System.out.println("NOT valid!");
		    }
		}
		
		

	}

}
