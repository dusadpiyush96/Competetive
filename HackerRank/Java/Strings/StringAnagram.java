    static boolean isAnagram(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();
        //if(a.equalsIgnoreCase(b)==false){
            //return false;
        //}
                            
        char l[]=a.toCharArray();
        char m[]=b.toCharArray();
        //m[0]='`';
        if(l.length!=m.length) return false;
        for(int i=0;i<a.length();i++){
            for(int j=0;j<a.length();j++){
                if(l[i]==m[j]){
                    m[j]='`';
                    break;
                }
                else{
                    continue;
                }
            }
        }
        int h=0;
        for(int k=0;k<a.length();k++){
            if(m[k]!='`'){
                return false;
            }
            else continue;
        }
        return true;
    }

