import java.util.ArrayList;

public class Member {
    private String name;
    private Member father;
    private Member mother;
    private Character gender;
    private ArrayList<Member> siblings=new ArrayList<>();

    public Member(String name, Member father, Member mother, Character gender, ArrayList<Member> siblings) {
        this.name = name;
        this.father = father;
        this.mother = mother;
        this.gender = gender;
        this.siblings = siblings;
    }

    public String  father(){
        return this.father.name;
    }
}
