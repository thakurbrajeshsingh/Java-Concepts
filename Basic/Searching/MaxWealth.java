package Basic.Searching;

public class MaxWealth {
    public static void main(String[] args) {

        int[][] account={
                {1,2,3},{3,2,1}
        };
        System.out.println(maximumWealth(account));
    }

    static int maximumWealth(int[][] accounts) {
        int maxAccount = Integer.MIN_VALUE;
        for (int row=0;row<accounts.length;row++){
            int rowSum = 0;
            for (int col=0;col<accounts[row].length;col++){
                rowSum +=accounts[row][col];
            }
            if(rowSum>maxAccount){
                maxAccount = rowSum;
            }
        }

        return maxAccount;
    }
}
