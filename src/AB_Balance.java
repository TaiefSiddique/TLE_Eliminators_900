import java.util.Scanner;

public class AB_Balance {
    public static void main(String[] args) {
        Scanner ss =new Scanner(System.in);
        int t;
        t=ss.nextInt();
        ss.nextLine();
        while(t!=0){
            String s=ss.nextLine();
            int len=s.length();
            char[] res=new char[len];
            if(s.charAt(0)==s.charAt(len-1)) System.out.println(s);
            else{
                if(s.charAt(0)=='a'){
                    res[0]='b';
                }
                else{
                    res[0]='a';
                }
                for(int i=1;i<len;i++)res[i]=s.charAt(i);
                for(int i=0;i<len;i++) System.out.printf("%c",res[i]);
                System.out.println();
            }

//            int ab=0;
//            int ba=0;
//            char[] res=s.toCharArray();
//            for(int i=0;i<len;i++){
//                if(i!=len-1 && s.charAt(i)==s.charAt(i+1))continue;
//                else if(i!=len-1 && s.charAt(i)=='a')ab++;
//                else if(i!=len-1 && s.charAt(i)=='b')ba++;
//            }
//            if(ab==ba) System.out.println(s);
//            //System.out.printf("ab=%d ba=%d\n", ab,ba);
//            else{
//                if(ab>ba){
//                    for(int i=0;i<len;i++){
//                        if(i!=len-1 && s.charAt(i)==s.charAt(i+1))continue;
//                        else if(i!=len-1 && s.charAt(i)=='a') {
//                            res[i] = 'b';
//                            break;
//                        }
//                    }
//                }
//                else {
//                    for(int i=0;i<len;i++){
//                        if(i!=len-1 && s.charAt(i)==s.charAt(i+1))continue;
//                        else if(i!=len-1 && s.charAt(i)=='b') {
//                            res[i] = 'a';
//                            break;
//                        }
//                    }
//                }
//                //String result=res.toString();
//                //System.out.println(result);
//                for(int i=0;i<len;i++) System.out.print(res[i]);
//            }
            t--;
        }
    }
}
