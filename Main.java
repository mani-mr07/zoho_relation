import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      Member esakki=new Member("esakki",null,null,'M',null);
      Member nattar=new Member("nattar",null,null,'F',null);
      Member mahesh=new Member("mahesh",esakki,nattar,'M',null);
      ArrayList<Member> siblings=new ArrayList<>();
      siblings.add(esakki);
      Member mani=new Member("mani",esakki,nattar,'M',siblings);
      System.out.print(mani.father());
    }
}