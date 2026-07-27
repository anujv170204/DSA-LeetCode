class Solution {
    public List<String> validStrings(int n) {
        List<String> str = new ArrayList<>();
        int len = 1 << n;
        for(int i = 0; i < len; i++){
            int bits = i;
            int z = 1;
            boolean istrue = true;
            StringBuilder sb = new StringBuilder();

            for(int j = 0; j < n; j++){
                int bit = bits&1;

                if(bit == 0 && z == 0){
                    istrue = false;
                    break;
                }
                sb.append(bit);
                z = bit;
                bits >>= 1;

            }
            if(istrue){
                str.add(sb.reverse().toString());

            }
            
            
        }
        return str;
    }
}