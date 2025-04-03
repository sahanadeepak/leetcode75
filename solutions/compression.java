package leetcode75.solutions;

public class compression {
    public int compress(char[] chars){
        int writeIndex = 0;
        for(int i =0; i< chars.length;){
            int readIndex = writeIndex + 1;
            while(readIndex < chars.length && chars[readIndex] == chars[i]){
                readIndex++;
            }
            chars[writeIndex++] = chars[i];
           if(readIndex - i > 1){
                String count = String.valueOf(readIndex - i);
                for(char c : count.toCharArray()){
                    chars[writeIndex++] = c;
                }
            }
            i = readIndex;

        }
        return writeIndex;

    }
    
    public static void main(String[] args) {
        compression obj = new compression();
        char[] chars = {'a','a','b','b','c','c','c'};
        int length = obj.compress(chars);
        System.out.println("Compressed length: " + length);
        for(int i = 0; i < length; i++){
            System.out.print(chars[i] + " ");
        }
    }
}
