pub struct Solution {}

impl Solution {
    pub fn sort_array_by_parity(mut nums: Vec<i32>) -> Vec<i32> {
        for i in 0..nums.len() {
            if nums[i] % 2 != 0 {
                for j in i + 1..nums.len() {
                    if nums[j] % 2 == 0 {
                        swap(&mut nums, i, j);
                        break;
                    }
                }
            }
        }
        nums
    }
}

fn swap(p0: &mut Vec<i32>, p1: usize, p2: usize) {
    let temp = p0[p1];
    p0[p1] = p0[p2];
    p0[p2] = temp;
}

#[cfg(test)]
mod tests {
    use super::Solution;

    #[test]
    fn test() {
        assert_eq!(vec![2, 4, 3, 1], Solution::sort_array_by_parity(vec![3, 1, 2, 4]));
        assert_eq!(vec![0], Solution::sort_array_by_parity(vec![0]));
    }
}
