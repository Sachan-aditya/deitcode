class Solution {
    public String reverseVowels(String s) {
      StringBuilder sb=new StringBuilder();
      Stack<Character> stack=new Stack<>();    
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='a'||c=='e'|| c=='o'||c=='u'|| c=='i'||c=='A'||c=='E'|| c=='O'||c=='U'|| c=='I')
            {
               stack.push(c);//eeoe
            }  
        }
      
          for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
             if(c=='a'||c=='e'|| c=='o'||c=='u'|| c=='i'||c=='A'||c=='E'|| c=='O'||c=='U'|| c=='I')
            {
               sb.append(stack.pop());
            } 
            else
            sb.append(c) ;
        }
     
        return sb.toString();
    }
}