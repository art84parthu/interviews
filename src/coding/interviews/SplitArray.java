package coding.interviews;

public class SplitArray {

	/**
	 * Split array into two paths such that the 
	 * number of elements in part 1 which equals X is equal to the
	 * number of elements in part 2 which does not equal X
	 * 
	 * NOTE: Similar to codility practice lesson 1. 
	 * 
	 * @param A
	 * @param X
	 * @return index 
	 */
	public static int split(int[] A, int X){
		int len = A.length;
		
		if(len <= 1) return -1;
		
		int count1 = A[0] == X ? 1 : 0;
		int count2 = 0;
		
		for(int i=1; i<A.length; i++){
			if(A[i] != X){
				count2 += 1;				
			}
		}
		
		if(count1==count2) return 1;
		
		for(int i=1; i<len; i++){
			if(A[i] == X){
				count1 += 1;
			}
			
			if(A[i] != X){
				count2 -= 1;
			}
			
			if(count1 == count2) return (i+1);
		}
		
		return -1;
	}
	
	public static void main(String[] args){
		System.out.println(split(new int[]{5, 2, 5, 3, 7, 8, 5, 3}, 5));
		System.out.println(split(new int[]{5, 2, 5, 8, 5, 3}, 5));
		System.out.println(split(new int[]{9, 9, 3, 2, 9, 9, 6}, 9));
	}
}
