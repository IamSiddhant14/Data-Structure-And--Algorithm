public class kpc {

        static String[] codes = {"","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"}; 
        
        public List<String> letterCombinations(String digits) {
            
            if( digits.length() == 0){
                List<String> ans1 = new ArrayList<>();
                return ans1;
            }
            
            List<String> ans1 = getkeypress(digits);
            return ans1;
            
        }
        
        public List<String> getkeypress( String str ){
            
            if( str.length() == 0 ){
                
                List<String> a = new ArrayList<>();
                a.add("");
                
                return a;
                
            }
            
            char a = str.charAt(0);
            String s = str.substring(1);
            
            List<String> recAns = getkeypress(s);
            List<String> myAns = new ArrayList<>();
            
            int idx =  a-'0';
            
            String code = codes[idx];
            
            for( int i =0; i<code.length(); i++){
                char newchar = code.charAt(i);
                for( String ele : recAns){
                   myAns.add(newchar + ele);
                }
        
            }
            
            return myAns;
        
        }
    }


