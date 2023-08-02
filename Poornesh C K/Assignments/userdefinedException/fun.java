import javax.print.attribute.standard.MediaName;

public class fun {

        students slist[]=new students[11];
        public void initElist(){
            for(int i=0;i<10;i++){
                slist[i]=new students((100+(i+1)), "student"+(i+1), (90+1));
            }
        }

        public students findstudent(String name){
            System.out.println("Searching student...");
            System.out.println("Enter the name to search");
            students smp =null;
            for(int i=0;i<slist.length;i++){
                if (    slist[i]!=null){
                    if(slist[i].getSname()==name){
                        smp=slist[i];
                    }
                }

            }
            return smp;
        }

}
