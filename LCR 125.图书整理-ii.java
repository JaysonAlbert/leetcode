/*
 * @lc app=leetcode.cn id=LCR 125 lang=java
 * @lcpr version=30201
 *
 * [LCR 125] 图书整理 II
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class CQueue {

   LinkedList<Integer> a,b;

    public CQueue() {
        a = new LinkedList<Integer>();
        b = new LinkedList<Integer>();
    }
    
    public void appendTail(int value) {
        a.addLast(value);;
    }
    
    public int deleteHead() {
        if(!b.isEmpty()){
            return b.removeLast();
        }
        if(a.isEmpty()){
            return -1;
        }

        while(!a.isEmpty()){
            b.addLast(a.removeLast());
        }
        return b.removeLast();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
// @lc code=end



/*
// @lcpr case=start
// ["BookQueue", "push", "push", "pop"][[], [1], [2], []]\n
// @lcpr case=end

 */

