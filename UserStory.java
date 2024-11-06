public class UserStory {

    private String[] names;
    private String[] mathLevels;
    private String[] readingLevels;
    private String[] missingAssignments;

    public UserStory(String namesFile, String mathLevelsFile, String readingLevelsFile, String missingAssignmentsFile) {
        names = FileReader.toStringArray(namesFile);
        mathLevels = FileReader.toStringArray(mathLevelsFile);
        readingLevels = FileReader.toStringArray(readingLevelsFile);
        missingAssignments = FileReader.toStringArray(missingAssignmentsFile);
    }

    public String toString() {
        String result = "";  // Initialize an empty string
        for (int i = 0; i < names.length; i++) {
            result += "Student: " + names[i] + "  Reading Level: " + readingLevels[i] 
                    + "  Math Level: " + mathLevels[i] + "  Missing Assignments: " + missingAssignments[i] + "\n";
        }
        return result;  // Return the formatted string
    }
}