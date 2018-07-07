package ska_project2;

public class Validator {
	
	//TODO - CODE THE VALIDATOR
	//add the method that will validate all the input
	//collected from the form
	
	
	//static variable to hold any error that occurs
	private static String errorMessage = "";
	
	
	public static String getOrderID(String anID){
		//run the validation
		//add any errors to the error message
		if (anID.length() == 0){
			errorMessage += "Order ID cannot be blank\n";
		}
		return anID;
	}
	
	public static String getFirstName(String aFirstName){
		if (aFirstName.length() == 0){
			errorMessage += "First Name cannot be blank\n";
		}
		return aFirstName;
	}
	
	//method to return the error message	
	public static String getError(){
		return errorMessage;
	}
	
	//method to clear the error message
	public static void clearError(){
		errorMessage = "";
	}

    static String getLastName(String aLastName) {
        if(aLastName.length() == 0){
            errorMessage += "Last Name cannot be blank\n";
        }
        return aLastName;
    }

    static String getStreet(String aStreetName) {
        if(aStreetName.length() == 0){
            errorMessage += "Street cannot be blank\n";
        }
        return aStreetName;
    }

    static String getCity(String aCity) {
       if(aCity.length() == 0){
            errorMessage += "City cannot be blank\n";
        }
        return aCity;
    }

    static String getZip(String aZip) {
        if (aZip.length() < 5 || !aZip.matches("[0-9]+")) {
            errorMessage += "ZIP code must be 5 digits\n";
        }
        return aZip;
    }

    static String getState(String aState) {
        if(aState.length() < 2 || aState.matches("[0-9]+")){
            errorMessage += "State must ba a valid 2 letter abbreviation\n";
        }
        return aState;
    }

    static String getPhone(String aPhone) {
        if(aPhone.length() < 10 || !aPhone.matches("[0-9]+")){
            errorMessage += "Phone number must a valid 10 digit number\n";
        }
        return aPhone;
    }

    static String getMemberShip(String aMemberShip) {
        if (aMemberShip.length() != 6 || Character.isDigit(aMemberShip.charAt(0)) || Character.isDigit(aMemberShip.charAt(1)) || Character.isAlphabetic(aMemberShip.charAt(2)) || Character.isAlphabetic(aMemberShip.charAt(3))
                || Character.isAlphabetic(aMemberShip.charAt(4)) || Character.isAlphabetic(aMemberShip.charAt(5))){
            errorMessage += "Membership must be 6 characters long, begin with 2 letters, and end with 4 digits\n";
    }
        return aMemberShip;
    }

    static String getQuantity(String aQuantity) {
        
            
        if (!aQuantity.matches("[0-9]+") || aQuantity.length() == 0 || aQuantity.isEmpty()){
            
            errorMessage += "Quantity " + "is invalid\n";
            
        }
        
        return aQuantity; //To change body of generated methods, choose Tools | Templates.
    }
	

}
