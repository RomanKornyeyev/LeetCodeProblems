/**
 * FizzBuzz solution
 * @author Román
 * @see {@link https://github.com/RomanKornyeyev} - GitHub profile
 */

class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> arr = new ArrayList<String>(n);
        
        for(int i=1; i<=n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                arr.add("FizzBuzz");
            }else if(i % 3 == 0){
                arr.add("Fizz");
            }else if(i % 5 == 0){
                arr.add("Buzz");
            }else{
                arr.add(""+i);
            } 
        }

        return arr;
    }
}