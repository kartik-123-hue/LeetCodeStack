import java.util.ArrayList;

class Stack {
    ArrayList<String> data;
    int top;
    Stack(){
        this.data=new ArrayList<>();
        this.top=-1;
    }
    void push(String data){
       this.data.add(data);
       this.top++;
    }
    void pop(){
        if(this.top==-1){
            return;
        }
        this.data.remove(top);
        top--;
    }
    int size(){
        return data.size();
    }

}
public class MinOperations {
    public int minOperations(String[] logs) {
        Stack stack=new Stack();
        for(String log:logs){
            switch (log.substring(0,log.length()-1)){
                case "..":
                    stack.pop();
                    break;
                case ".":break;
                default:stack.push(log);
            }
        }
        return stack.size();
    }
}
