package leak;

public class Tester {
    public static void main(String[] args) throws Exception {
        // method showmemoryusage took memory, so we preload it
        showMemoryUse(false);
        //##DISPLAY_BEGIN##
        Stack stack = new Stack(10000);
        showMemoryUse(); // before using the stack

        for (int i = 0; i < 10000; i++) { // fill the stack
            stack.push("a large, large, large, large, string " + i);
        }
        for (int i = 0; i < 10000; i++) { // empty the stack
            System.out.println(stack.pop());
        }

        showMemoryUse(); // after using the stack
//##DISPLAY_END##
        try {stack.push(1);} catch(Throwable t) {}
    }

    static void showMemoryUse(boolean... b) throws Exception {
        System.gc();System.gc();System.gc();System.gc();System.gc();
        Thread.sleep(100);
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        long freeMemory = runtime.freeMemory();
        long use = maxMemory - freeMemory;
        if (b.length == 0 || b[0] == true)
            System.out.println("Memory Use (approx.): " + (use/1024) + " KBytes");
    }
}
