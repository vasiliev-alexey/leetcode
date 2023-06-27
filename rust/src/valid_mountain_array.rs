pub struct Solution {}

impl Solution {
    pub fn valid_mountain_array(arr: Vec<i32>) -> bool {

        if arr.len() < 3 {
            return  false;
        }
        let mut i = 0;
        while i < arr.len() - 1 {
            if arr[i] < arr[i + 1] {
                i += 1;
            } else {
                break;
            }
        }
        if i == 0 || i == arr.len() - 1 {
            return false;
        }
        while i < arr.len() - 1 {
            if arr[i] > arr[i + 1] {
                i += 1;
            } else {
                break;
            }
        }
        i == arr.len() - 1


    }
}

#[cfg(test)]
mod tests {
    use super::Solution;

    #[test]
    fn test() {
        assert_eq!(Solution::valid_mountain_array(vec![1, 2, 3, 0, 0, 0]), false);
        assert_eq!(Solution::valid_mountain_array(vec![3, 5, 5]), false);
        assert_eq!(Solution::valid_mountain_array(vec![0, 3, 2, 1]), true);
        assert_eq!(Solution::valid_mountain_array(vec![9, 8, 7, 6, 5, 4, 3, 2, 1, 0]), false);
    }
}
