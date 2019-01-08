package Functions;

import java.util.Scanner;

public class Func {

    private static Scanner userInput;

    public static long programStartTime = System.currentTimeMillis();

    public static long programRunTime() {
        return System.currentTimeMillis() - programStartTime;
    }

    public static void printOne(Object input) {
        System.out.print(input);
    }

    public static void print(Object input) {
        System.out.println(input);
    }

    public static void pre(String input) {
        print(BOLD + WARNING + input + END);
    }

    public static Scanner askOne(Object input) {
        printOne(input);
        userInput = new Scanner(System.in);
        return userInput;
    }

    public static Scanner ask(Object input) {
        print(input);
        userInput = new Scanner(System.in);
        return userInput;
    }

    public class DeltaTime {
        
        public final long startTime;

        public DeltaTime() {
            startTime = System.currentTimeMillis();
        }
        
        public long deltaMillis() {
            return System.currentTimeMillis() - startTime;
        }
    }

    public static void done() {
        print("");
        print("Runtime: " + ok(Long.toString(programRunTime()) + " milliseconds"));
        print(fail("{[ Program Terminated ]}"));
        System.exit(0);
    }

    public static final String HEADER = "\033[95m";
    public static final String OKBLUE = "\033[94m";
    public static final String OKGREEN = "\033[92m";
    public static final String WARNING = "\033[93m";
    public static final String FAIL = "\033[91m";
    public static final String END = "\033[0m";
    public static final String BOLD = "\033[1m";
    public static final String UNDERLINE = "\033[4m";

    public static String fail(String input) {
        return (FAIL + input + END);
    }
    public static String good(String input) {
        return (OKGREEN + input + END);
    }
    public static String ok(String input) {
        return (OKBLUE + input + END);
    }
    public static String warn(String input) {
        return (WARNING + input + END);
    }
    public static class Math {
        public static long map(long x, long in_min, long in_max, long out_min, long out_max) {
          return (x - in_min) * (out_max - out_min) / (in_max - in_min) + out_min;
        }
    }
}