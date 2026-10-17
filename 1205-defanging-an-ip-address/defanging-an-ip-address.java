class Solution {
    public String defangIPaddr(String address) {
        // int n = address.length();
        // char[] arr = new char[n];
        // String str = ".";

        // for(int i = 0; i < address.length(); i++)
            return address.replace(".","[.]");
            }
        // return arr;
}