pub struct Solution {}

impl Solution {
    pub fn replace_elements(mut arr: Vec<i32>) -> Vec<i32> {
        let n = arr.len();
        if n == 1 {
            return vec![-1];
        }
        let mut max = arr[n - 1];
        arr[n - 1] = -1;
        for i in (0..=(n - 2)).rev() {
            let temp = arr[i];
            arr[i] = max;
            max = max.max(temp);
        }
        arr

    }
}

#[cfg(test)]
mod tests {
    use super::Solution;

    #[test]
    fn test() {
        assert_eq!(vec![18, 6, 6, 6, 1, -1], Solution::replace_elements(vec![17, 18, 5, 4, 6, 1]));
        assert_eq!(vec![-1], Solution::replace_elements(vec![400]));
    }
}
