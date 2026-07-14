public class FindFirstOccurrence {
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";

        int result = strStr(haystack, needle);

        System.out.println("Haystack: " + haystack);
        System.out.println("Needle: " + needle);
        System.out.println("First Occurrence Index: " + result);
    }
}
