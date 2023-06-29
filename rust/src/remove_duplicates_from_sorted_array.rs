pub struct Solution {}

impl Solution {
    pub fn remove_duplicates(nums: &mut Vec<i32>) -> i32 {
        let mut i = 1;
        for j in 1..nums.len() {
            if nums[j-1] != nums[j] {
                nums[i] = nums[j];
                i += 1;
            }
        }
        return i as i32;
    }
}

#[cfg(test)]
mod tests {
    use super::Solution;

    #[test]
    fn test() {
        assert_eq!(5, Solution::remove_duplicates(&mut vec![0,0,1,1,1,2,2,3,3,4]));
        assert_eq!(2, Solution::remove_duplicates(&mut vec![1, 1, 2]));

    }
}
