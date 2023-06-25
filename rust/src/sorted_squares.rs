pub struct Solution {}

impl Solution {
    pub fn sorted_squares(nums: Vec<i32>) -> Vec<i32> {
        let mut sq_vec = nums.iter().map(|u| u * u).collect::<Vec<i32>>();
        sq_vec.sort();
        sq_vec
    }
}


#[cfg(test)]
mod tests {
    use super::Solution;

    #[test]
    fn test() {
        assert_eq!(vec![0, 1, 9, 16, 100], Solution::sorted_squares(vec![-4, -1, 0, 3, 10]));
        assert_eq!(vec![4, 9, 9, 49, 121], Solution::sorted_squares(vec![-7, -3, 2, 3, 11]));
    }
}
