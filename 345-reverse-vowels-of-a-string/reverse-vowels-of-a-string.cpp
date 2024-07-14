class Solution {
    
public:
    string reverseVowels(string s) {
 

int start=0;
int end=s.length()-1;
int mid=start+(end-start)/2;
while(start<=end){
    
    while(((s[start]!='a' and s[start]!='A') and ( s[start]!='e' and s[start]!='E') and (s[start]!='i' and s[start]!='I') and ( s[start]!='o' and s[start]!='O') and (s[start]!='u' and s[start]!='U')) and start<=end){
        start++;
    }
    
     while(((s[end]!='a' and s[end]!='A') and (s[end]!='e' and s[end]!='E' )and (s[end]!='i' and s[end]!='I') and (s[end]!='o' and s[end]!='O') and (s[end]!='u' and s[end]!='U') ) and start<=end) {
        end--;
    }
    if(start<=end){
    swap(s[start],s[end]);
    start++;
    end--;}



}
        
return s;    }

};