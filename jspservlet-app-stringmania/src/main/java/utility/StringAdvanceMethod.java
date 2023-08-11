package utility;

public class StringAdvanceMethod {
	//Enter the code here...
	private String input1;
	private String input2;
	public String getInput1() {
		return input1;
	}
	public void setInput1(String input1) {
		this.input1 = input1;
	}
	public String getInput2() {
		return input2;
	}
	public void setInput2(String input2) {
		this.input2 = input2;
	}
	public String concat(String one, String two){
		return one+two;
	}
	public String split(String one, String two){
		String[] parts = one.split(two);
        
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < parts.length - 1; i++) {
            output.append(parts[i]).append("  "); // Append two spaces after each part
        }
        output.append(parts[parts.length - 1]); // Append the last part without spaces
        
        return output.toString();	
	}
	public String indexOf(String one, String two) {
		return Integer.toString(one.indexOf(two));
	}
	public String trim(String str){
		return str.trim();
	}
}
