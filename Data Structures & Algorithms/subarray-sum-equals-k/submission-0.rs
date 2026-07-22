impl Solution {
    pub fn subarray_sum(nums: Vec<i32>, k: i32) -> i32 {
        let mut cnt = 0 as i32;
        let mut cur_sum = 0;
        let mut prefix_sum = HashMap::new();
        prefix_sum.insert(0,1);

        for &num in &nums {
            cur_sum += num;
            let diff = cur_sum - k;
            cnt += prefix_sum.get(&diff).unwrap_or(&0);
            *prefix_sum.entry(cur_sum).or_insert(0) += 1;
        }
        cnt
    }
}
