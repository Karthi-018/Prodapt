package org.example;

public class pojoquizz {
        String Question;
        String Option1;
        String Option2;
        String Option3;
        String Option4;
        pojoquizz(String q,String op1,String op2, String op3, String op4)
        {
            Question =q;
            Option1=op1;
            Option2=op2;
            Option3=op3;
            Option4=op4;
        }
        void setque(String q)
        {
            Question =q;
        }
        String getque()
        {
            return Question;
        }
        void setop1(String op1)
        {
            Option1=op1;
        }
        void setop2(String op2) { Option2=op2; }
        void setop3(String op3){Option3=op3;}
        void setop4(String op4){Option4=op4;}
        public  String toString()
        {
            return Question+" "+Option1+" "+Option2+" "+Option3+" "+Option4;
        }
    }





