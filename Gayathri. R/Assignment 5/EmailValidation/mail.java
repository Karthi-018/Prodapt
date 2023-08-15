package org.example;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.Arrays;
import java.util.Objects;

public class mail {
    private String mail;
    public mail()
    {

    }
    public mail(String mail)
    {
        this.mail=mail;
    }
    void setMail(String mail)
    {
        this.mail=mail;
    }
    String getmail()
    {
        return mail;

    }

    static Boolean validatEmail(String email) {
        String str[]=email.split("@");
        String first=str[0];
        String sec=str[1];
        char[] spe1= new char[]{'.'};
        char[] spe2=new char[]{'_'};
        boolean flag=false;


        char[] charArray=first.toCharArray();
                 //System.out.println(first+sec);
        //-------------------first half ---validating lowercharacter and numbers-----------------
        for (int i = 0; i< charArray.length; i++) {
            if (!Character.isLowerCase(charArray[i])) {
                if (!Character.isDigit(charArray[i])) {
                   if (!Arrays.equals(new char[]{charArray[i]},spe2))
                    {
                        //System.out.println(charArray[i]);
                        if (!Objects.equals(charArray[i], '.')) {
                            //System.out.println("invalid email" + " " + charArray[i]);
                            return false;
                        }
                    }
                }
            }
       }
                        //System.out.println("first half completed");
        //--------------------------second half------------------------------------------------
        //System.out.println(sec);
        char[] secchar=sec.toCharArray();
        int cnt=0;
        for(int i=0;i<secchar.length;i++)
        {
            if(Arrays.equals(new char[]{secchar[i]},spe1))
            {
                //System.out.println(secchar[i]+" "+i);
                for(int j=i;j< secchar.length;j++)
                {
                    cnt++;
                }
                if(cnt>7) {
                    //System.out.println(cnt);
                    return false;
                }
                break;
            }
            if(!Character.isLowerCase(secchar[i]))
            {
                if( !Arrays.equals(new char[]{secchar[i]},spe1))
            {
                return false;
            }
            }

        }
        System.out.println(email);
        return true;
    }
}
