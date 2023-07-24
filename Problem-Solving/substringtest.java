public class substringtest {
    public static void main(String[] args) {
        String a = "manager";
        String b = "agegomanage";
        int i = 0;
        while (i < b.length()) {
            int j = 0;
            String ans = "";
            int s = 0, e = 0;
            int q = 0;
            while (j < a.length()) {
                if (b.charAt(i) == a.charAt(j)) {
                    s = j;
                    e = j;
                    int v = i;
                    int u = j;
                    while (v < b.length() && u < a.length()) {
                        if (b.charAt(i) == a.charAt(j)) {
                            e = u;
                        } else {
                            break;
                        }
                        v++;
                        u++;
                    }
                    q = v;
                    ans = a.substring(s, e);
                }
                j++;
            }
            i = q;
            System.out.print(ans + " ");
            i++;
        }
    }
}