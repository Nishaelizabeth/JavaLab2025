public class GarbageCollectionDemo1 {
    String name;

    GarbageCollectionDemo1(String name) {
        this.name = name;
    }

    // Just a manual cleanup method (not called by GC)
    public void cleanup() {
        System.out.println("Cleaning up: " + name);
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        GarbageCollectionDemo1 obj1 = new GarbageCollectionDemo1("Object1");
        GarbageCollectionDemo1 obj2 = new GarbageCollectionDemo1("Object2");

        obj1.cleanup();
        obj1 = null;

        obj2.cleanup();
        obj2 = new GarbageCollectionDemo1("Object3");

        // Suggest JVM run GC
        System.gc();

        System.out.println("End of main method");
    }
}
