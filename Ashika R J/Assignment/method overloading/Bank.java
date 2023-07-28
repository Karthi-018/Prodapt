class Bank
{
	void Bdetails(String A_name,int A_no)
       {
		System.out.println("Acc Name="+A_name+" "+"Acc No="+A_no);
	}

	void Bdetails(String A_name,int A_no,String A_type)
       {
		System.out.println("Acc Name="+A_name+" "+"Acc No="+A_no+" "+"Acc type="+A_type);
	}
	
    public static void main(String a[])
      {
	Bank bk=new Bank();
	bk.Bdetails("Ashi",1425377865);
	bk.Bdetails("Ash",1968924576,"Minor");
       }
}