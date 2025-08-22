public class FamilyList {
    public static void main(String[] args) {

        FamilyMember member1 = new FamilyMember("jorem", 23);
        FamilyMember member2 = new FamilyMember("jant", 24);
        FamilyMember member3 = new FamilyMember("rose", 40);
        FamilyMember member4 = new FamilyMember("jonathan", 45);
        
        member1.next = member2;
        member2.next = member3;
        member3.next = member4;

        System.out.println("-----iterate to each node using loop------");

        FamilyMember current = member1;
        while (current != null) {
            System.out.println("current Member: " + current.getName() + " | age: " + current.getAge());
            current = current.next;
        }
    }
}
