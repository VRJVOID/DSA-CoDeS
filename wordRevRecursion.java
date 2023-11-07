public class wordRevRecursion {
    public static void wordRev(String str, int index){
        if(index == 0)
        {
            System.out.println(str.charAt(index));
            return;
        }

        System.out.println(str.charAt(index));
        wordRev(str,index-1);
    }

    public static void main(String args[])
    {
        String str = "depression";
        wordRev(str,str.length()-1);
    }
}
