

class ComLineTest
{
    public static void main(String[] args) {
        int count;
        int i=0;
        /*this is a program
        * in which we can do something
        * sgdjhsdfdj
        * sdgjgh.
        */
        String string;
        count=args.length;
        System.out.println("number of argumentes="+count);
        while(i<count)
        {
            string=args[i];
            i=i+1;
            System.out.println(i+":"+"JAVA IS "+string+"!");
        }
    }
}