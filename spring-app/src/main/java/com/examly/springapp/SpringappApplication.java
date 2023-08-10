package com.examly.springapp;


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
		int s = 0;
		int e = one.indexOf(two);
		String result = "";

		while(e != -1){
			String sub = one.substring(s,e);
			result = result + sub + " ";
			s = e + two.length();
			e = one.indexOf(two, s);
		}
		String last = one.substring(s);

		return result+last;
	}
	public String indexOf(String one, String two) {
		return Integer.toString(one.indexOf(two));
	}
	public String trim(String str){
		return str.trim();
	}
}

public class StringBoolean {
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
     public boolean endsWith(String input1, String input2) {
       
        return input1.endsWith(input2);
    }

    public boolean startsWith(String input1, String input2) {
        return input1.startsWith(input2);
    }

    public boolean equals(String input1, String input2) {
        return input1.equals(input2);
    }

    public boolean equalsIgnoreCase(String input1, String input2) {
        return input1.equalsIgnoreCase(input2);
    }

    public boolean contains(String input1, String input2) {
        return input1.contains(input2);
    }
}
public class StringMethod {
    private String input;
    
    public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}

    public String lower(String input) {
        return input.toLowerCase();
    }

    public String upper(String input) {
        return input.toUpperCase();
    }

    public String length(String input) {
        return Integer.toString(input.length());
    }

    public String trim(String input) {
        return input.trim();
    }

    public String firstCharacter(String input) {
        return Character.toString(input.charAt(0));
    }
}

