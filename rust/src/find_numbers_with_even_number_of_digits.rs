pub struct Solution {}

impl Solution {
    pub fn find_max_consecutive_ones(nums: Vec<i32>) -> i32 {
        let mut count = 0;
        let mut max = 0;
        for num in nums {
            if num == 1 {
                count += 1;
            } else {
                count = 0;
            }
            if count > max {
                max = count
            }
        }
        return max;
    }
}


#[cfg(test)]
mod tests {
    use super::Solution;

    #[test]
    fn test() {
        assert_eq!(3, Solution::find_max_consecutive_ones(vec![1, 1, 0, 1, 1, 1]));
        assert_eq!(2, Solution::find_max_consecutive_ones(vec![1, 0, 1, 1, 0, 1]));
    }
}
