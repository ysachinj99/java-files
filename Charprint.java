public class Charprint {

  public static void main(String[] args) {
    int i,j,c;
    char ch;
    for(i=1;i<6;i++) 
     {
      ch='A';
      for(j=1;j<i+1;j++) 
       {
        System.out.print(" "+ch+" ");
        ch++;
      }
        System.out.println("  ");
  }
}
}