package student_valerija_ionova.lesson_11.level_6_approved.task_30_38.UIAction;

import student_valerija_ionova.lesson_11.level_6_approved.task_30_38.*;

import java.util.*;

public class FindUIAction implements UIAction {

    private BookDatabase bookDatabase;

    FindUIAction (BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("Please choose criterion for find or press 4 to start search:\n" +
                "1: Find by author\n" +
                "2: Find by title\n" +
                "3: Find by issue year\n");

        Set<SearchCriteria> setOfSearchCriteria = new HashSet<>();

        int selectedMenuNumber;
        Scanner in = new Scanner (System.in);

        do {
            selectedMenuNumber = enterMenuNumber();

            switch (selectedMenuNumber) {
                case 1: {
                    System.out.println("Please enter author:");
                    String author = in.nextLine();
                    SearchCriteria authorSearchCriteria = new AuthorSearchCriteria(author);
                    setOfSearchCriteria.add(authorSearchCriteria);
                    break;
                }
                case 2: {
                    System.out.println("Please enter title:");
                    String title = in.nextLine();
                    SearchCriteria titleSearchCriteria = new TitleSearchCriteria(title);
                    setOfSearchCriteria.add(titleSearchCriteria);
                    break;
                }
                case 3: {
                    System.out.println("Please enter year of issue:");
                    String year = in.nextLine();
                    SearchCriteria yearSearchCriteria = new YearOfIssueSearchCriteria(year);
                    setOfSearchCriteria.add(yearSearchCriteria);
                    break;
                }
            }
        }while (selectedMenuNumber != 4) ;

        List<SearchCriteria> listOfCriteria = new ArrayList<>(setOfSearchCriteria);
        List <Book> result = bookDatabase.find(listOfCriteria);

        if (result.size() == 0){
            System.out.println("Nothing were found");
        }else{
            System.out.println("Books:\n" + result);
        }
    }

    private int enterMenuNumber() {
        Scanner sc = new Scanner(System.in);
        int userSelectedMenuNumber;

        do{
            while (true) {
                try {
                    System.out.println("Please choose criterion for find or press 4 to start search:\n");
                    userSelectedMenuNumber = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("It's not number!");
                }
            }
            if ((userSelectedMenuNumber <1) || (userSelectedMenuNumber > 4)){
                System.out.println("It's not valid number");
            }
        }while((userSelectedMenuNumber <1) || (userSelectedMenuNumber > 4));
        return userSelectedMenuNumber;
    }
}
