

pub struct Solution {}

impl Solution {
    pub fn remove_duplicates_in_place(nums: &mut Vec<i32>) -> i32 {

        nums.dedup();
        nums.len() as i32




    }
}


#[cfg(test)]
mod tests {
    use super::Solution;

    #[test]
    fn test() {
        let mut nums1 = vec![1,1,2];
        assert_eq!( Solution::remove_duplicates_in_place(&mut nums1) , 2);

        let mut nums1 = vec![0,0,1,1,1,2,2,3,3,4];
        assert_eq!( Solution::remove_duplicates_in_place(&mut nums1) , 5);


    }

}
