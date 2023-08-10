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
		return one.concat(two);
	}
	public String split(String one, String two){
		String[] parts = one.split(two);
        
        StringBuilder output = new StringBuilder();
        for (String part : parts) {
            output.append(part).append(" "); // Append two spaces after each part
        }
        
        return output.toString();
	}
	public String indexOf(String one, String two) {
		return Integer.toString(one.indexOf(two));
	}
	public String trim(String str){
		return str.trim();
	}
}
