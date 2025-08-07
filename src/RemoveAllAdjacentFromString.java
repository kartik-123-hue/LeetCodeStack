public class RemoveAllAdjacentFromString {
    public String removeDuplicates(String s, int k) {
        StringBuilder stack=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(stack.length()>1 && stack.length()-(k-1)>=0 && stack.charAt(stack.length()-1)==s.charAt(i) && checkIfKthRepeatingStringAreEqual(stack.toString()+s.charAt(i),k)){
                System.out.println("The substring going to be removed-"+stack.substring(stack.length()-(k-1)));
                for(int j=0;j<k-1;j++){
                    stack.deleteCharAt(stack.length()-1);
                }
            }
            else{
                stack.append(s.charAt(i));
                System.out.println("The current current formed-"+stack.toString());
            }
        }
        return stack.toString();
    }

    private boolean checkIfKthRepeatingStringAreEqual(String str,int k) {
        if(str.substring(str.length()-(k)).length()==k){
            return str.substring(str.length()-(k)).contentEquals(new StringBuilder().repeat(str.charAt(str.length()-1),k));
        }
        return false;
    }
}
