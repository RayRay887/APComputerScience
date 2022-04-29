package ap;

public class CodingBat {
	public String endX(String str) {
		  
		  if (str.length() == 0) {
		    return "";
		  }
		  
		  if (str.substring(0,1).equals("x")) {
		    return endX(str.substring(1)) + str.substring(0,1);
		  }
		  return str.substring(0,1) + endX(str.substring(1));
		  
		  for (x = 0; x < str.length()-1; x++) {
		    if (str.substring(x,x+1).equals("x")) {
		      newString = str.substring(x) + "x" 
		    }
		  }
		}
	public String endX(String str) {
		  String newString = "";
		  String nextString = ""; 
		  int x;
		  if (str.length() == 0) {
		    return "";
		  }
		  
		  for (x = 0; x < str.length(); x++) {
		    if (str.substring(x,x+1).equals("x")) {
		      newString += "x"; 
		    } else {
		      nextString += str.substring(x,x+1);
		    }
		  }
		  return nextString + newString;
		}

	public int countHi(String str) {
		  if (str.length() == 0) {
		    return 0;
		  }
		  int count =0;
		  int n;
		 for (n = 0; n < str.length()-1; n++) {
		   if (str.substring(n,n+2).equals("hi")) {
		     count++;
		   }
		 }
		 return count;
		}
	
	
}
