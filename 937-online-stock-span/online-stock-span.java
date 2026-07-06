import java.util.*;
class StockSpanner {
    
    ArrayList<Integer> l;
Stack<Integer> s;
    public StockSpanner() {
        l = new ArrayList<>();
        s=new Stack<>();
    }
    
    public int next(int price) {
        l.add(price);
        while(!s.isEmpty() && l.get(s.peek())<=price){
            s.pop();
        }
    int prevgreater=s.isEmpty()?-1:s.peek();
    int ans=l.size()-1-prevgreater;
    s.push(l.size()-1);
    return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */