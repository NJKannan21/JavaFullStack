package guviPortalTaskOne;

public class findSmallestAmg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {58, 48, 75};

		if(nums[0] < nums[1] && nums[0] < nums[2]) {
			System.out.println(nums[0] + " is the smallest Number");
		} else if(nums[1] < nums[0] && nums[1] < nums[2]) {
			System.out.println(nums[1] + " is the smallest Number");
		} else {
			System.out.println(nums[2] + " is the smallest Number");
		}

	}

}
