public class DataRunner {
  public static void main(String[] args) {

    UserStory userStory = new UserStory("names.txt", "mathLevel.txt", "readingLevel.txt", "missingAssignments.txt");

    //Print the data
    System.out.println(userStory);
  }
}