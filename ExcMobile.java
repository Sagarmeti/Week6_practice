class InvalidMobileNumberException extends Exception{
  InvalidMobileNumberException(String str){
    super(str);
  }
  
}
class CheckMobileNumber{
  void validateMobileNumber(String number) throws InvalidMobileNumberException{
 
    if(number.length()==10){
      System.out.println("valid mobile number");
    }
    else{
      throw new InvalidMobileNumberException("Invalid Mobile Number");
    }
    
  }
}
 

class ExcMobile{
public static void main(String args[]){
  CheckMobileNumber num=new CheckMobileNumber();
  try{
    num.validateMobileNumber("8884032468");
  }
  catch(InvalidMobileNumberException e){
    System.out.println(e);
  }
}
}