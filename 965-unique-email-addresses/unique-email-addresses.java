class Solution {
    public int numUniqueEmails(String[] emails) {
	HashSet<String> hs = new HashSet<>();
	for ( String s : emails ) {
		String[] s1 = s.split("@");
		hs.add(s1[0].split("\\+")[0].replaceAll("\\.", "") + "@" + s1[1]);
	}
	return hs.size();        
    }
}