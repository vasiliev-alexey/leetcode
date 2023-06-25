pub struct Solution {}

impl Solution {
    pub fn find_numbers(nums: Vec<i32>) -> i32 {
        nums.into_iter().filter(|x| x.to_string().len() % 2 == 0).count() as i32
     }
}


#[cfg(test)]
mod tests {
    use super::Solution;

    #[test]
    fn test() {
        assert_eq!(2, Solution::find_numbers(vec![12,345,2,6,7896]));
        assert_eq!(1, Solution::find_numbers(vec![555,901,482,1771]));
    }
}
