package Test;

public class TestJunit {
	
	public int total = 0;
	public int result = 0;
	public int [] arr = {1, 2, 3};
	
	public int sum(int a, int b){
		return a + b;
	}
	public int countCharAt(String word){
		int count = 0;
		for(int i = 0; i < word.length(); i++){
			if(word.charAt(i) == 'i' || word.charAt(i) == 'I'){
				count ++;
			}
		}
		return count;
	}
}
