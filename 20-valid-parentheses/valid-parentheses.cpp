class Solution {
public:
    bool isValid(string s) {
     stack<char> st;

 for(auto v:s){
    //   cout<<"char-->"<<v<<endl;
     if(v=='('|| v=='{' || v=='['){
        st.push(v);
     }
     else{
        //char t = st.top();
        if(st.empty() || (v==')' && st.top()!='(') || (v=='}' && st.top()!='{') || (v==']' && st.top()!='[')){
            return false;

          }
          else{
            st.pop();
          }
        }

      }
      return st.size() == 0;
      
    }
};