package com.ljt.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		char[] str="".toCharArray();
		int[] nums = {-2,-1,-4,-3,0};
		//System.out.print( new Test().rotateString(str,3));//5,2,4,4
		//System.out.print(new Test().ProductList(2,4,4,4));
		System.out.print(new Test().MaximumProduct(nums));

	}
	
	public long MaximumProduct(int[] nums) {
        
		Arrays.sort(nums);
		long min = nums[0];
		long amin = nums[1];
		long cmin = nums[2];
		long max = nums[nums.length-1];
		long amax = nums[nums.length-2];
		long bmax = nums[nums.length-3];

		
		if (amin >= 0)  return max*amax*bmax;
		if (amax <= 0)  return max*amax*bmax;
		
		
		if (min*amin >amax*bmax) {
			return min*amin*max;
		} else {
			return amax*bmax*max;
		}
    }
	
	 public List<Integer> ProductList(int offset, int n, int len1, int len2) {
	        List<Integer> list = new ArrayList<Integer>();
	       
	     
	       
	       return list;
	    }

}
