import java.util.ArrayList;


public class TokenGenerator {
	public static void main(String[] args) {
		System.out.println(generateToken(8,true,true,true));
	}
	
	public static String generateToken(int length, boolean uppercase, boolean lowercase, boolean number){

Boolean[] params = {uppercase,lowercase,number};

ArrayList<String> newParams = new ArrayList<>();

ArrayList<String> token = new ArrayList<>();

String[] chars = {
         "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "abcdefghijklmnopqrstuvwxyz",
         "0123456789"
	    };
	    for(int i = 0; i < params.length; i++){
	        
	        if(params[i] == true){
				newParams.add(chars[i]);
	        }
	        
		}
		
		String newStr = String.join("",newParams);
		char[] newStr2 = newStr.toCharArray();

		for (int j = 0; j < length; j++){

			int rand = (int)  (Math.random() * newStr2.length);

			token.add(j, String.valueOf(newStr2[rand]));

		}
	    
	    
	    
	    return  String.join("",token);
	}
}