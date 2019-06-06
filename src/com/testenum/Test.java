package com.testenum;

public class Test {
	
	public enum Color {
		RED("red", "01"), GREEN("green", "02"), YELLO("yello", "03");
		
		private String name;
		private String code;
		
		private Color(String name, String code){
			this.name = name;
			this.code = code;
		}
		
		public static String getName(String code){
			for (Color c: Color.values()){
				if(c.getCode() == code){
					return c.getName();
				}
			}
			return null;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}
		
	}
	
	public static void main(String[] args){
//		Color[] c = Color.values();
		for(Color c : Color.values()){
			System.out.println(c.GREEN);
		}
	}

}
