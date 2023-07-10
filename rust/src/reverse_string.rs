pub struct Solution {}

impl Solution {
    pub fn reverse_string(s: &mut Vec<char>) {
        let length = s.len();

        for i in 0..length / 2 {
            s.swap(i, length - 1 - i);
        }
    }
}



#[cfg(test)]
mod tests {
    use super::Solution;

    #[test]
    fn test() {
        let mut test = vec!['h','e','l','l','o'];
        Solution::reverse_string(&mut test);
        assert_eq!(vec!['o','l','l','e','h'], test);
        let mut test = vec!['H','a','n','n','a','h'];
        Solution::reverse_string(&mut test);
        assert_eq!(vec!['h','a','n','n','a','H'],test);

    }
}
