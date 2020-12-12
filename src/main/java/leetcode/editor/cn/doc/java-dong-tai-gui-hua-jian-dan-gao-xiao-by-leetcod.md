### 解题思路
本题解 采用了 **`动态规划`** 思想：
> 1、初始化 dp数组，因为要保存0级台阶，所以长度为 n+1
> dp[i]表示 第i级台阶 一共有 dp[i] 种到达情况
> 2、循环计算：
> 到达当前台阶的情况有如下两种：
>>  1、上一级台阶(dp[i-1]) 跨一步
>>  2、上一级的上一级的台阶(dp[i-2]) 跨两步

### 运行结果
![image.png](https://pic.leetcode-cn.com/1607334221-KAGLcx-image.png)

### 代码

```java
class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        /*
            初始化 dp数组，因为要保存0级台阶，所以长度为 n+1
            dp[i]表示 第i级台阶 一共有 dp[i] 种到达情况
         */
        int[] dp = new int[n + 1];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            /*
                到达当前台阶的情况有如下两种：
                    1、上一级台阶 跨一步
                    2、上一级的上一级的台阶 跨两步
             */
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
```
打卡131天，加油！！！
今天是 模块化刷算法 的第一天，敬请关注本人 模块化题解-动态规划专题 博文：
[《【算法精研】动态规划 总集篇》](https://www.cnblogs.com/codderYouzg/p/14067635.html)