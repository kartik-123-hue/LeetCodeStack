public class FinalPrices {
    class Stack{
        int[] data;
        int top;
        Stack(){
            data=new int[500];
            this.top=-1;
        }
        void push(int data){
            this.data[++top]=data;
        }
        int pop(){
            if(isEmpty()){
                return -1;
            }
            return this.data[top--];
        }
        int peek(){
            return this.data[top];
        }
        boolean isEmpty(){
            return top==-1;
        }
    }
    public int[] finalPrices(int[] prices) {
        Stack stack=new Stack();
        int[] res=new int[prices.length];
        System.arraycopy(prices,0,res,0,prices.length);
        for(int i=0;i<prices.length;i++){
            while(!stack.isEmpty() && prices[stack.peek()]>=prices[i]){
                int j=stack.pop();
                res[j]-=prices[i];
            }
            stack.push(i);
        }
        return res;
    }
}
