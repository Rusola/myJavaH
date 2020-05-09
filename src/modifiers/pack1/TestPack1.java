package modifiers.pack1;

public class TestPack1 {
    public static void main(String[] args) {
        var p1 = new ClassFromPack1("anyName");
        System.out.println(p1.getName()); // we can reach getName as we are inside of the same package

        // test if we can see verify from variables from the same package but different class
        var ml = new MemberLevel("Ross", 100, "NY");
        // ml.getPrivateLastName(); // not visible as in diff  class
        ml.getProtectedAge(); // visible as the same package & ...
        ml.getDefaultCity();// visible as the same package

    }
}
