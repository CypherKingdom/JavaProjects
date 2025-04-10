package java_basics.chap4;
public class Ex4 {
    public static void main (String [] args){
        String s="INFO 2211 : Java Programming";
        String courseName="", courseCode="", courseDesc="";
        int i = s.indexOf(' ');
        courseName = s.substring(0, i);
        int j=s.indexOf(':');
        courseCode=s.substring(i, j).trim();
        courseDesc=s.substring(j+1).trim();
        System.out.println("Course Name: " +courseName);
        System.out.println("Course Code: " +courseCode);
        System.out.println("Course Description: " + courseDesc);

        //method 2
        // String [] x = s.split(":");
        // courseDesc = x[1].trim();
        // String[] y = x[0].split(" ");
        // courseName = y[0];
        // courseCode = y[1];

        /* method 3
         * String s="jad messfc1 : lkserflsh";
         * String courseName, courseCode, courseDes;
         * String ss="", sd="", sf="";
         * int i;
         * for(i=0;i<s.length();i++){
         * if(s.charAt(i)==' '){
         * break;
         * }
         * ss+=s.charAt(i);
         * }
         * int k=i;
         * for(k=i;k<s.length();k++){
         * if(s.charAt(k) ==':'){
         * break;
         * }
         * sd+=s.charAt(k);
         * }
         * for(;k<s.length();k++){
         * sf+=s.charAt(k);
         * }
         * courseName=ss;
         * courseCode = sd ;
         * courseDes=sf;
         * System.out.println("Course name: " + courseName);
         * System.out.println("Course code: " + courseCode);
         * System.out.println("Course description" + courseDes);
         */
    }
}