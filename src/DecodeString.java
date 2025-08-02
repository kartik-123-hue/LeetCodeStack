import java.util.ArrayList;

public class DecodeString {
    class Stack{
        ArrayList<String> data;
        int top;
        Stack(){
           data=new ArrayList<>();
            top=-1;
        }
        String pop(){
            return data.remove(top--);
        }

        void push(String c){
            data.add(++top,c);
        }

        String peek(){
            return data.get(top);
        }

        boolean isEmpty(){
            return top==-1;
        }
    }
    public String decodeString(String s) {
        Stack stack=new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=']'){
                stack.push(String.valueOf(s.charAt(i)));
            }
            else{

                StringBuilder currentString= new StringBuilder();
                while(!stack.isEmpty() && !stack.peek().equals("[")){
                    currentString. insert(0,stack.pop());
                }
                stack.pop();
                StringBuilder repeater=new StringBuilder();
                while ((!stack.isEmpty()) && Character.isDigit(stack.peek().charAt(0))){
                    repeater.insert(0,stack.pop());
                }
                stack.push(currentString.toString().repeat(Integer.parseInt(repeater.toString())));
            }
        }
        StringBuilder result=new StringBuilder();
        for(String str:stack.data){
            result.append(str);
        }
        return result.toString();
    }
}
