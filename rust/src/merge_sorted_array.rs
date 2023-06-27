pub struct Solution {}

impl Solution {
    pub fn merge(nums1: &mut Vec<i32>, m: i32, nums2: &mut Vec<i32>, n: i32) {
        let (mut m, mut n) = (m as usize, n as usize);
        for i in (0..m + n).rev() {
            nums1[i] = match (m == 0, n == 0) {
                (true, false) => {
                    n -= 1;
                    nums2[n]
                }
                (false, true) => {
                    m -= 1;
                    nums1[m]
                }
                (_, _) => {
                    if nums1[m - 1] > nums2[n - 1] {
                        m -= 1;
                        nums1[m]
                    } else {
                        n -= 1;
                        nums2[n]
                    }
                }
            }
        }
    }
}


#[cfg(test)]
mod tests {
    use super::Solution;

    #[test]
    fn test() {
        let mut nums1 = vec![1, 2, 3, 0, 0, 0];
        let mut nums2 = vec![2, 5, 6];
        Solution::merge(&mut nums1, 3, &mut nums2, 3);
        assert_eq!(vec![1, 2, 2, 3, 5, 6], nums1);

    }

    #[test]
    fn test1() {
        let mut nums1 = vec![0];
        let mut nums2 = vec![1];
        Solution::merge(&mut nums1, 0, &mut nums2, 1);
        assert_eq!(vec![1], nums1);
    }
}
