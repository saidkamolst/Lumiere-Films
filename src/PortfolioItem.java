public class PortfolioItem {
    private String[][][] portfolioItems = new String[100][50][3];
    private int[] counts = new int[100];

    public void addPortfolioItems(int actorNum, String project, String role, String year) {
        if (counts[actorNum] < 50) {
            portfolioItems[actorNum][counts[actorNum]][0] = project;
            portfolioItems[actorNum][counts[actorNum]][1] = role;
            portfolioItems[actorNum][counts[actorNum]][2] = year;
            counts[actorNum]++;
            System.out.println("Portfolio Items added successfully.");
        }
        else {
            System.out.println("Portfolio Items list of this actor is full.");
        }
    }
    public void listPortfolioItems(int actorNum) {
        if (counts[actorNum] == 0) {
            System.out.println("Portfolio Items list of this actor is empty.");
        }
        for (int i = 0; i < counts[actorNum]; i++) {
            System.out.println(
                    i+1 + ". " +
                    portfolioItems[actorNum][i][0] + " " +
                    portfolioItems[actorNum][i][1] + " " +
                    portfolioItems[actorNum][i][2]
            );
        }
    }
    public void removePortfolioItems(int actorNum, int itemNum) {
        if (itemNum < 0 || itemNum >= counts[actorNum]) {
            System.out.println("Invalid actor number.");
        }
        for (int i = itemNum; i < counts[actorNum]; i++) {
            portfolioItems[actorNum][i][0] = portfolioItems[actorNum][i+1][0];
            portfolioItems[actorNum][i][1] = portfolioItems[actorNum][i+1][1];
            portfolioItems[actorNum][i][2] = portfolioItems[actorNum][i+1][2];
        }
        counts[actorNum]--;

        System.out.println("Portfolio Item removed successfully.");
    }
}
